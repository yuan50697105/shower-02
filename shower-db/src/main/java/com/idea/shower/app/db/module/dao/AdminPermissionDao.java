package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.AdminPermission;
import com.idea.shower.app.db.module.pojo.query.AdminPermissionQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 16:15
 */
public interface AdminPermissionDao extends BaseDao<AdminPermission> {
    PageResult<AdminPermission> selectPageByCondition(AdminPermissionQuery condition);

    List<AdminPermission> selectListByCondition(AdminPermissionQuery condition);

    List<AdminPermission> selectByIds(List<Long> permissionIds);

    List<Long> selectIdByIds(List<Long> permissionIds);

    Optional<AdminPermission> selectById(Long id);

    int insertSelective(AdminPermission adminPermission);

    int deleteById(Long id);

    int updateSelective(AdminPermission adminPermission);
}
