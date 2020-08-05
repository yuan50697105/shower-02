package com.idea.shower.admin.admin.service.impl;

import ai.yue.library.base.exception.ResultException;
import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.ObjectUtil;
import com.idea.shower.admin.admin.pojo.AdminUserVO;
import com.idea.shower.admin.admin.service.AdminUserService;
import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import com.idea.shower.app.db.module.dao.AdminRoleDao;
import com.idea.shower.app.db.module.dao.AdminUserDao;
import com.idea.shower.app.db.module.dao.AdminUserRoleDao;
import com.idea.shower.app.db.module.pojo.AdminRole;
import com.idea.shower.app.db.module.pojo.AdminUser;
import com.idea.shower.app.db.module.pojo.AdminUserRole;
import com.idea.shower.app.db.module.pojo.query.AdminUserQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-24 19:11
 */
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
@CacheConfig(cacheNames = "users")
public class AdminUserServiceImpl implements AdminUserService {
    private final AdminUserDao adminUserService;
    private final AdminUserRoleDao adminUserRoleService;
    private final AdminRoleDao adminRoleService;
    private final PasswordEncoder passwordEncoder;

    @Override
    @CachePut
    public Result<?> add(AdminUserVO vo) {
        checkUserExist(vo);
        AdminUser adminUser = createUser(vo);
        createUserRole(vo, adminUser);
        return ResultInfo.success();
    }

    @Override
    @CachePut
    public Result<?> modifyUser(AdminUserVO vo) {
        AdminUser adminUser = adminUserService.getById(vo.getId());
        checkUserNull(adminUser);
        adminUser.copyFrom(vo, "id", "password", "username");
        adminUserService.updateSelective(adminUser);
        return ResultInfo.success();
    }

    @Override
    public Result<?> getUser(Long id) {
        AdminUser adminUser = adminUserService.getById(id);
        checkUserNull(adminUser);
        return ResultInfo.success(Collections.singletonMap("user", adminUser));

    }

    @Override
    public Result<?> getRole(Long id) {
        AdminUser adminUser = adminUserService.getById(id);
        checkUserNull(adminUser);
        List<AdminUserRole> adminUserRoles = adminUserRoleService.listByUserId(id);
        List<Long> roleIds = adminUserRoles.stream().map(BaseDbEntity::getId).collect(Collectors.toList());
        List<AdminRole> adminRoles = adminRoleService.listByIds(roleIds);
        return ResultInfo.success(Collections.singletonMap("role", adminRoles));
    }

    @Override
    @CachePut
    public Result<?> modifyRole(AdminUserVO vo) {
        AdminUser adminUser = adminUserService.getById(vo.getId());
        checkUserNull(adminUser);
        removeUserRole(vo);
        createUserRole(vo, adminUser);
        return ResultInfo.success();
    }

    @Override
    @CacheEvict
    public Result<?> delete(List<Long> id) {
        adminUserRoleService.deleteByUserIds(id);
        adminUserService.deleteByIds(id);
        return ResultInfo.success();
    }

    @Override
    @Cacheable
    public Result<?> data(AdminUserQuery query, int page, int size) {
        PageResult<AdminUser> pageResult = adminUserService.selectPageByQuery(query, page, size);
        return ResultInfo.success(pageResult);
    }

    @Override
    @Cacheable
    public Result<?> list(AdminUserQuery query) {
        return ResultInfo.success(Collections.singletonMap("list", adminUserService.selectListByQuery(query)));
    }

    @Override
    public Result<?> get(Long id) {
        AdminUser adminUser = adminUserService.getById(id);
        checkUserNull(adminUser);
        List<AdminUserRole> adminUserRoles = adminUserRoleService.listByUserId(id);
        List<Long> roleIds = adminUserRoles.stream().map(AdminUserRole::getRoleId).collect(Collectors.toList());
        List<AdminRole> adminRoles = adminRoleService.selectByIds(roleIds);

        List<String> roleNames = adminRoles.stream().map(AdminRole::getName).collect(Collectors.toList());
        roleIds = adminRoles.stream().map(BaseDbEntity::getId).collect(Collectors.toList());

        AdminUserVO adminUserVO = new AdminUserVO();
        adminUserVO.copyFrom(adminUser);
        adminUserVO.setRoleNames(roleNames);
        adminUserVO.setRoleIds(roleIds);
        return ResultInfo.success(adminUserVO);
    }

    @Override
    public Result<?> modify(AdminUserVO adminUserVO) {
        AdminUser adminUser = adminUserService.getById(adminUserVO.getId());
        adminUser.copyFrom(adminUserVO, "id", "username", "password");
        List<Long> roleIds = adminUserVO.getRoleIds();
        List<Long> roleDbIds = adminUserRoleService.selectRoleIdByUserId(adminUser.getId());
        roleDbIds = adminRoleService.selectIdByIdIn(roleDbIds);
        Collection<Long> intersection = CollUtil.intersection(roleDbIds, roleIds);
        roleIds.removeAll(intersection);
        if (ObjectUtil.isNotEmpty(roleIds)) {
            roleIds = adminRoleService.selectIdByIdIn(roleIds);
            for (Long roleId : roleIds) {
                AdminUserRole adminUserRole = AdminUserRole.builder().roleId(roleId).userId(adminUserVO.getId()).build();
                adminUserRoleService.insertSelective(adminUserRole);
            }
        }
        roleDbIds.removeAll(intersection);
        roleDbIds.forEach(adminUserRoleService::deleteByRoleId);
        return ResultInfo.success();
    }

    /**
     * 删除关联用户角色
     *
     * @param vo
     */
    private void removeUserRole(AdminUserVO vo) {
        Long id = vo.getId();
        adminUserRoleService.deleteByUserIds(Collections.singletonList(id));
    }

    /**
     * 创建用户角色
     *
     * @param vo
     * @param adminUser
     */
    private void createUserRole(AdminUserVO vo, AdminUser adminUser) {
        List<Long> roleIds = vo.getRoleIds();
        if (!ObjectUtil.isNotEmpty(roleIds)) {
            throw new ResultException(ResultInfo.param_check_not_pass());
        }
        roleIds = adminRoleService.listByIds(roleIds).stream().map(BaseDbEntity::getId).collect(Collectors.toList());
        ArrayList<AdminUserRole> adminUserRoles = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            adminUserRoles.add(AdminUserRole.builder().roleId(roleId).userId(adminUser.getId()).build());
        }
        adminUserRoleService.batchInsertSelective(adminUserRoles);
    }

    /**
     * 创建用户
     *
     * @param vo
     * @return
     */
    private AdminUser createUser(AdminUserVO vo) {
        AdminUser adminUser = new AdminUser();
        adminUser.copyFrom(vo);
        adminUser.setPassword(passwordEncoder.encode(adminUser.getPassword()));
        adminUserService.insertSelective(adminUser);
        return adminUser;
    }

    /**
     * 检查用户是否存在
     *
     * @param vo
     */
    private void checkUserExist(AdminUserVO vo) {
        String username = vo.getUsername();
        if (Validator.isEmpty(username)) {
            throw new ResultException(ResultInfo.param_check_not_pass(username + "不能为空"));
        }
        boolean exist = adminUserService.existByUsername(username);
        if (exist) {
            throw new ResultException(ResultInfo.param_check_not_pass(username + "用户已存在"));
        }
    }

    private void checkUserNull(AdminUser adminUser) {
        if (ObjectUtil.isNull(adminUser)) {
            throw new ResultException(ResultInfo.param_value_invalid("用户不存在"));
        }
    }
}