package com.idea.shower.app.db.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.AdminPermissionDao;
import com.idea.shower.app.db.module.mapper.AdminPermissionMapper;
import com.idea.shower.app.db.module.mapper.AdminUserMapper;
import com.idea.shower.app.db.module.mapper.AdminUserRoleMapper;
import com.idea.shower.app.db.module.pojo.AdminPermission;
import com.idea.shower.app.db.module.pojo.AdminPermissionExample;
import com.idea.shower.app.db.module.pojo.query.AdminPermissionQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:19
 */
@Component
@AllArgsConstructor
public class AdminPermissionDaoImpl extends BaseDaoImpl<AdminPermission, AdminPermissionMapper> implements AdminPermissionDao {
    private final AdminPermissionMapper adminPermissionMapper;
    private final AdminUserRoleMapper adminUserRoleMapper;
    private final AdminUserMapper adminUserMapper;

    @Override
    public PageResult<AdminPermission> selectPageByCondition(AdminPermissionQuery condition) {
        PageHelper.startPage(condition.getPage(), condition.getLimit());
        return new PageResult<>(PageInfo.of(baseMapper().selectByCondition(condition)));
    }

    @Override
    public List<AdminPermission> selectListByCondition(AdminPermissionQuery condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public List<AdminPermission> selectByIds(List<Long> ids) {
        return baseMapper().selectByIdIn(ids);
    }

    @Override
    public List<Long> selectIdByIds(List<Long> permissionIds) {
        return baseMapper().selectIdByIdIn(permissionIds);
    }

    @Override
    public Optional<AdminPermission> selectById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    public int insert(AdminPermission adminPermission) {
        return baseMapper().insert(adminPermission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(AdminPermission adminPermission) {
        return baseMapper().insertSelective(adminPermission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateSelective(AdminPermission adminPermission) {
        return baseMapper().updateByPrimaryKeySelective(adminPermission);
    }

    @Override
    public AdminPermission getById(Long id) {
        return baseMapper().selectByPrimaryKey(id);
    }

    @Override
    public void deleteByIds(List<Long> ids) {
        AdminPermissionExample example = new AdminPermissionExample();
        example.or().andIdIn(ids);
        baseMapper().selectByExample(example);
    }

    @Override
    public PageResult<AdminPermission> selectPageByQuery(AdminPermissionQuery query, int page, int size) {
        PageHelper.startPage(page, size);
        return new PageResult<>(new PageInfo<>(baseMapper().selectByCondition(query)));
    }

    @Override
    public List<AdminPermission> selectListByQuery(AdminPermissionQuery query) {
        return baseMapper().selectByCondition(query);
    }

    @Override
    public int deleteByRoleIds(List<Long> roleIds) {
        AdminPermissionExample example = new AdminPermissionExample();
        example.or().andRoleIdIn(roleIds);
        return baseMapper().deleteByExample(example);
    }

    @Override
    public List<AdminPermission> selectListByRoleId(Long id) {
        AdminPermissionExample example = new AdminPermissionExample();
        example.or().andRoleIdEqualTo(id);
        return baseMapper().selectByExample(example);
    }

    @Override
    public List<String> selectNameListByRoleId(Long id) {
        List<AdminPermission> adminPermissions = selectListByRoleId(id);
        return adminPermissions.stream().map(AdminPermission::getName).distinct().collect(Collectors.toList());
    }

    @Override
    public List<String> selectPermissionListByUsername(String username) {
        Long userId = adminUserMapper.selectOneIdByUsername(username);
        List<Long> roleIds = adminUserRoleMapper.selectRoleIdByUserId(userId);
        return adminPermissionMapper.selectNameByRoleIdIn(roleIds);
    }

    @Override
    public List<AdminPermission> selectAllByRoleId(Long roleId) {
        return adminPermissionMapper.selectAllByRoleId(roleId);
    }

    @Override
    public List<String> selectNameByRoleId(Long roleId) {
        return adminPermissionMapper.selectNameByRoleId(roleId);
    }

    @Override
    public List<String> selectNameByRoleIdIn(Collection<Long> roleIdCollection) {
        return adminPermissionMapper.selectNameByRoleIdIn(roleIdCollection);
    }

    @Override
    public int deleteById(Long id) {
        return baseMapper().deleteByPrimaryKey(id);
    }


}