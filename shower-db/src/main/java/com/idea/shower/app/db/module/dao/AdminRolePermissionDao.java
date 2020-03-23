package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.AdminRolePermission;

import java.util.List;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:21
 */
public interface AdminRolePermissionDao extends BaseDao<AdminRolePermission> {
    List<Long> selectPermissionIdByRoleId(Long roleId);

    int batchInsertSelective(List<AdminRolePermission> adminRolePermissions);

    int deleteByRoleId(Long roleId);

    int deleteByPermissionId(Long id);
}
