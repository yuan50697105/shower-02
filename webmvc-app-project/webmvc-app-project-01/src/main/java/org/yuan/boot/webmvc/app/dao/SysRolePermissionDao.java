package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.SysRolePermission;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-12 01:58
 */
public interface SysRolePermissionDao extends BaseDao<SysRolePermission> {
    void save(SysRolePermission sysRolePermission);

    void batchSave(List<SysRolePermission> sysRolePermissions);

    void batchUpdate(SysRole sysRole, List<SysRolePermission> sysRolePermissions);

    void deleteByRoleId(Long roleId);

    void deleteByRoleIds(List<Long> ids);

    void deleteByPermissionId(Long id);

    void deleteByPermissionIds(List<Long> ids);
}
