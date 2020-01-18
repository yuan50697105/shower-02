package org.yuan.boot.shower.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.shower.dao.SysUserRolePermissionViewDao;
import org.yuan.boot.shower.mapper.SysUserRolePermissionViewMapper;
import org.yuan.boot.shower.pojo.SysUserRolePermissionView;
import org.yuan.boot.shower.pojo.SysUserRolePermissionViewExample;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 23:37
 */
@Component
@AllArgsConstructor
public class SysUserRolePermissionViewDaoImpl extends BaseDaoImpl<SysUserRolePermissionView, SysUserRolePermissionViewMapper> implements SysUserRolePermissionViewDao {
    @Override
    public List<SysUserRolePermissionView> list() {
        return baseMapper().selectByExample(new SysUserRolePermissionViewExample());
    }


}