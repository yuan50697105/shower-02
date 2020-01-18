package org.yuan.boot.shower.dao;

import org.yuan.boot.shower.pojo.SysUser;
import org.yuan.boot.shower.pojo.SysUserRole;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-12 01:10
 */
public interface SysUserRoleDao extends BaseDao<SysUserRole> {
    void save(SysUserRole sysUserRole);

    void batchSave(List<SysUserRole> sysUserRoles);

    void batchUpdate(SysUser sysUser, List<SysUserRole> sysUserRoles);

    void deleteByRoleId(Long id);

    void deleteByRoleIds(List<Long> ids);

    void deleteByUserId(Long userId);

    void deleteByUserIds(List<Long> userIds);
}
