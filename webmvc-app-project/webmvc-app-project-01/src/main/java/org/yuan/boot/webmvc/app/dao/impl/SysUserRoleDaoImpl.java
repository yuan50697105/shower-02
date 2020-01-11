package org.yuan.boot.webmvc.app.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.dao.SysUserRoleDao;
import org.yuan.boot.webmvc.app.mapper.SysUserRoleMapper;
import org.yuan.boot.webmvc.app.pojo.SysUserRole;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-12 01:10
 */
@Component
public class SysUserRoleDaoImpl extends BaseDaoImpl<SysUserRole, SysUserRoleMapper> implements SysUserRoleDao {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysUserRole sysUserRole) {
        baseMapper().insertSelective(sysUserRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchSave(List<SysUserRole> sysUserRoles) {
        for (SysUserRole sysUserRole : sysUserRoles) {
            save(sysUserRole);
        }
    }
}