package org.yuan.boot.webmvc.app.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.dao.SysRolePermissionDao;
import org.yuan.boot.webmvc.app.mapper.SysRolePermissionMapper;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.SysRolePermission;
import org.yuan.boot.webmvc.app.pojo.SysRolePermissionExample;

import java.util.Date;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-12 01:58
 */
@Component
@AllArgsConstructor
public class SysRolePermissionDaoImpl extends BaseDaoImpl<SysRolePermission, SysRolePermissionMapper> implements SysRolePermissionDao {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysRolePermission sysRolePermission) {
        sysRolePermission = sysRolePermission.setId(snowflake().nextId()).setCreateTime(new Date());
        baseMapper().insertSelective(sysRolePermission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchSave(List<SysRolePermission> sysRolePermissions) {
        for (SysRolePermission sysRolePermission : sysRolePermissions) {
            save(sysRolePermission);
        }
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchUpdate(SysRole sysRole, List<SysRolePermission> sysRolePermissions) {
        deleteByRoleId(sysRole.getId());
        batchSave(sysRolePermissions);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleId(Long roleId) {
        SysRolePermissionExample example = new SysRolePermissionExample();
        example.or().andIdEqualTo(roleId);
        baseMapper().deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleIds(List<Long> roleIds) {
        SysRolePermissionExample example = new SysRolePermissionExample();
        example.or().andIdIn(roleIds);
        baseMapper().deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByPermissionId(Long id) {
        SysRolePermissionExample example = new SysRolePermissionExample();
        example.or().andPermissionIdEqualTo(id);
        baseMapper().deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByPermissionIds(List<Long> ids) {
        SysRolePermissionExample example = new SysRolePermissionExample();
        example.or().andPermissionIdIn(ids);
        baseMapper().deleteByExample(example);
    }
}