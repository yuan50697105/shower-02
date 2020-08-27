package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.module.pojo.AdminUserRole;

import java.util.List;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:22
 */
public interface AdminUserRoleDao extends BaseDao<AdminUserRole> {
    int deleteByUserId(Long userId);

    void deleteByUserIds(List<Long> userIds);

    int deleteByRoleId(Long roleId);

    void deleteByRoleIds(List<Long> roleIds);

    List<Long> selectRoleIdByUserId(Long userId);

    List<Long> selectUserIdByRoleId(Long roleId);

    int batchInsertSelective(List<AdminUserRole> adminUserRoles);

    List<AdminUserRole> listByUserId(Long id);

    List<String> selectRoleNameByUsername(String username);


    int insertSelective(AdminUserRole adminUserRole);
}