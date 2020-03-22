package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.AdminUserRole;

import java.util.List;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:22
 */
public interface AdminUserRoleDao extends BaseDao<AdminUserRole> {
    int deleteByUserId(Long userId);

    int deleteByUserIds(List<Long> userIds);

    int deleteByRoleId(Long roleId);

    int deleteByRoleIds(List<Long> roleIds);

    List<Long> selectRoleIdByUserId(Long userId);

    List<Long> selectUserIdByRoleId(Long roleId);

    int batchInsertSelective(List<AdminUserRole> adminUserRoles);
}