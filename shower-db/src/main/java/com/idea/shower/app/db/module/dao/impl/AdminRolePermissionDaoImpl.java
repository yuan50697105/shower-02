package com.idea.shower.app.db.module.dao.impl;


import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.AdminRolePermissionDao;
import com.idea.shower.app.db.module.mapper.AdminRolePermissionMapper;
import com.idea.shower.app.db.module.pojo.AdminRolePermission;
import com.idea.shower.app.db.module.pojo.AdminRolePermissionExample;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:21
 */
@Component
@AllArgsConstructor
public class AdminRolePermissionDaoImpl extends BaseDaoImpl<AdminRolePermission, AdminRolePermissionMapper> implements AdminRolePermissionDao {
    @Override
    public List<Long> selectPermissionIdByRoleId(Long roleId) {
        return baseMapper().selectPermissionIdByRoleId(roleId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int batchInsertSelective(List<AdminRolePermission> adminRolePermissions) {
        return adminRolePermissions.stream().map(baseMapper()::insertSelective).reduce(Integer::sum).orElse(0);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByRoleId(Long roleId) {
        return baseMapper().deleteByRoleId(roleId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByPermissionId(Long permissionId) {
        return baseMapper().deleteByPermissionId(permissionId);
    }

    @Override
    @Transactional
    public void deleteByPermissionIds(List<Long> ids) {
        AdminRolePermissionExample example = new AdminRolePermissionExample();
        example.or().andPermissionIdIn(ids);
        baseMapper().deleteByExample(example);
    }

    @Override
    @Transactional
    public void deleteByRoleIds(List<Long> id) {
        AdminRolePermissionExample example = new AdminRolePermissionExample();
        example.or().andRoleIdIn(id);
        baseMapper().deleteByExample(example);
    }

    @Override
    public List<AdminRolePermission> listByRoleId(Long id) {
        AdminRolePermissionExample example = new AdminRolePermissionExample();
        example.or().andRoleIdEqualTo(id);
        return baseMapper().selectByExample(example);
    }
}