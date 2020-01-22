package org.yuan.boot.shower.db.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.AdminUserRoleDao;
import org.yuan.boot.shower.db.mapper.AdminUserRoleMapper;
import org.yuan.boot.shower.db.pojo.AdminUserRole;
import org.yuan.boot.shower.db.pojo.AdminUserRoleExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:12
 */
@Component
@AllArgsConstructor
public class AdminUserRoleDaoImpl extends BaseDaoImpl<AdminUserRole, AdminUserRoleMapper> implements AdminUserRoleDao {
    @Override
    public List<AdminUserRole> selectByUserId(Long id) {
        AdminUserRoleExample example = new AdminUserRoleExample();
        example.or().andUserIdEqualTo(id);
        return baseMapper().selectByExample(example);
    }

    @Override
    public List<Long> selectRoleIdsByUserId(Long id) {
        List<AdminUserRole> adminUserRoles = selectByUserId(id);
        return adminUserRoles.stream().map(AdminUserRole::getRoleId).collect(Collectors.toList());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchSaveByUser(List<AdminUserRole> adminUserRoles) {
        adminUserRoles = Optional.ofNullable(adminUserRoles).orElse(new ArrayList<>());
        deleteByUserIds(adminUserRoles);
        batchSave(adminUserRoles);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchSaveByRole(List<AdminUserRole> adminUserRoles) {
        adminUserRoles = Optional.ofNullable(adminUserRoles).orElse(new ArrayList<>());
        deleteByRoleIds(adminUserRoles);
        batchSave(adminUserRoles);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchSave(List<AdminUserRole> adminUserRoles) {
        for (AdminUserRole adminUserRole : adminUserRoles) {
            baseMapper().insertSelective(adminUserRole);
        }
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByUserIds(List<AdminUserRole> adminUserRoles) {
        List<Long> userIds = adminUserRoles.stream().map(AdminUserRole::getUserId).collect(Collectors.toList());
        AdminUserRoleExample example = new AdminUserRoleExample();
        example.or().andUserIdIn(userIds);
        baseMapper().deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleIds(List<AdminUserRole> adminUserRoles) {
        List<Long> roleIds = adminUserRoles.stream().map(AdminUserRole::getRoleId).collect(Collectors.toList());
        AdminUserRoleExample example = new AdminUserRoleExample();
        example.or().andRoleIdIn(roleIds);
        baseMapper().deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleId(Long id) {
        AdminUserRoleExample example = new AdminUserRoleExample();
        example.or().andRoleIdEqualTo(id);
        baseMapper().deleteByExample(example);
    }

    @Override
    public List<AdminUserRole> selectByRoleId(Long roleId) {
        AdminUserRoleExample example = new AdminUserRoleExample();
        example.or().andRoleIdEqualTo(roleId);
        return baseMapper().selectByExample(example);
    }

    @Override
    public Long countByRoleId(Long roleId) {
        AdminUserRoleExample example = new AdminUserRoleExample();
        example.or().andRoleIdEqualTo(roleId);
        return baseMapper().countByExample(example);
    }

    @Override
    public Boolean existByRoleId(Long roleId) {
        return countByRoleId(roleId) > 0;
    }
}