package com.idea.shower.admin.admin.service.impl;

import ai.yue.library.base.exception.ResultException;
import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import cn.hutool.core.util.ObjectUtil;
import com.idea.shower.admin.admin.pojo.AdminRoleVO;
import com.idea.shower.admin.admin.service.AdminRoleBackService;
import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import com.idea.shower.app.db.module.dao.*;
import com.idea.shower.app.db.module.pojo.AdminPermission;
import com.idea.shower.app.db.module.pojo.AdminRole;
import com.idea.shower.app.db.module.pojo.AdminRolePermission;
import com.idea.shower.app.db.module.pojo.query.AdminRoleQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-25 17:15
 */
@Service
@AllArgsConstructor
@Transactional
@CacheConfig(cacheNames = "roles")
public class AdminRoleBackServiceImpl implements AdminRoleBackService {
    private final AdminRoleDao adminRoleService;
    private final AdminUserRoleDao adminUserRoleService;
    private final AdminPermissionDao adminPermissionService;
    private final AdminRolePermissionDao adminRolePermissionService;
    private final AdminRoleRouteDao adminRoleRouteDao;

    @Override
    @CachePut
    public Result<?> add(AdminRoleVO vo) {
        checkRoleExist(vo);
        AdminRole adminRole = createRole(vo);
//        createRolePermission(vo, adminRole);
        return ResultInfo.success(adminRole);
    }

    @Override
    @CachePut
    public Result<?> update(AdminRoleVO vo) {
        Long id = vo.getId();
        AdminRole adminRole = adminRoleService.getById(vo.getId());
        checkRoleNull(adminRole);
        adminRole.copyFrom(vo);
        adminRoleService.updateSelective(adminRole);
        adminRoleRouteDao.deleteByRoleId(id);
        createRoleRoute(vo, adminRole);
        return ResultInfo.success();
    }

    @Override
    @CacheEvict
    public Result<?> delete(List<Long> id) {
        adminRoleService.deleteByIds(id);
        adminRoleRouteDao.deleteByRoleIds(id);
        adminUserRoleService.deleteByRoleIds(id);
        return ResultInfo.success();
    }

    @Override
    public Result<?> get(Long id) {
        HashMap<Object, Object> data = new HashMap<>();
        AdminRole adminRole = adminRoleService.getById(id);
        checkRoleNull(adminRole);
        List<AdminRolePermission> adminRolePermissions = adminRolePermissionService.listByRoleId(id);
        List<AdminPermission> adminPermissions = adminPermissionService.listByIds(adminRolePermissions.stream().map(BaseDbEntity::getId).collect(Collectors.toList()));
        data.put("role", adminRole);
        data.put("permission", adminPermissions);
        return ResultInfo.success(data);
    }

    @Override
    @Cacheable
    public Result<?> data(AdminRoleQuery query, int page, int size) {
        PageResult<AdminRole> pageResult = adminRoleService.selectPageByQuery(query, page, size);
        return ResultInfo.success(pageResult);
    }

    @Override
    @Cacheable
    public Result<?> list(AdminRoleQuery query) {
        List<AdminRole> list = adminRoleService.selectListByQuery(query);
        return ResultInfo.success(Collections.singletonMap("list", list));
    }

    private void checkRoleNull(AdminRole adminRole) {
        if (ObjectUtil.isNull(adminRole)) {
            throw new ResultException(ResultInfo.param_value_invalid());
        }
    }

    private void createRoleRoute(AdminRoleVO vo, AdminRole adminRole) {
        List<String> role = vo.getRole();
        System.out.println("role = " + role);
//        List<?> permissionIds = vo.getRoutes();
//        permissionIds = adminPermissionService.listByIds(permissionIds).stream().map(BaseDbEntity::getId).collect(Collectors.toList());
//        ArrayList<AdminRolePermission> adminRolePermissions = new ArrayList<>(permissionIds.size());
//        for (Long permissionId : permissionIds) {
//            AdminRolePermission adminRolePermission = new AdminRolePermission();
//            adminRolePermission.setPermissionId(permissionId);
//            adminRolePermission.setRoleId(adminRole.getId());
//            adminRolePermissions.add(adminRolePermission);
//        }
//        adminRolePermissionService.batchInsertSelective(adminRolePermissions);
    }


    private AdminRole createRole(AdminRoleVO vo) {
        AdminRole adminRole = new AdminRole();
        adminRole.copyFrom(vo);
        adminRoleService.insertSelective(adminRole);
        return adminRole;
    }

    private void checkRoleExist(AdminRoleVO vo) {
        String name = vo.getName();
        boolean exist = adminRoleService.checkExistByName(name);
        if (exist) {
            throw new ResultException(ResultInfo.param_check_not_pass());
        }
    }
}