package org.yuan.boot.webmvc.app.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.dao.SysUserRoleDao;
import org.yuan.boot.webmvc.app.mapper.SysUserRoleMapper;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.SysUserRole;
import org.yuan.boot.webmvc.app.pojo.SysUserRoleExample;

import java.util.Date;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-12 01:10
 */
@Component
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class SysUserRoleDaoImpl extends BaseDaoImpl<SysUserRole, SysUserRoleMapper> implements SysUserRoleDao {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysUserRole sysUserRole) {
        sysUserRole.setId(snowflake().nextId()).setCreateTime(new Date());
        baseMapper().insertSelective(sysUserRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchSave(List<SysUserRole> sysUserRoles) {
        for (SysUserRole sysUserRole : sysUserRoles) {
            save(sysUserRole);
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchUpdate(SysUser sysUser, List<SysUserRole> sysUserRoles) {
        deleteByUserId(sysUser.getId());
        batchSave(sysUserRoles);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleId(Long roleId) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.or().andRoleIdEqualTo(roleId);
        baseMapper().deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleIds(List<Long> roleIds) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.or().andRoleIdIn(roleIds);
        baseMapper().deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByUserId(Long userId) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.or().andUserIdEqualTo(userId);
        baseMapper().deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByUserIds(List<Long> userIds) {
        SysUserRoleExample example = new SysUserRoleExample();
        example.or().andUserIdIn(userIds);
        baseMapper().deleteByExample(example);
    }
}