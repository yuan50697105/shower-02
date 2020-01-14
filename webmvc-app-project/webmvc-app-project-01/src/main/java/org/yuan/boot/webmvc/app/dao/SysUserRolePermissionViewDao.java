package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.webmvc.app.pojo.SysUserRolePermissionView;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 23:36
 */
public interface SysUserRolePermissionViewDao extends BaseDao<SysUserRolePermissionView> {
    List<SysUserRolePermissionView> list();
}
