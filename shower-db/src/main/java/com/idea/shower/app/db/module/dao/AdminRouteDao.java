package com.idea.shower.app.db.module.dao;

import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.AdminRoute;
import com.idea.shower.app.db.module.pojo.AdminRouteExample;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-02 12:21
 */
public interface AdminRouteDao extends BaseDao<AdminRoute> {
    List<AdminRoute> selectByExample(AdminRouteExample adminRouteExample);

    int insert(AdminRoute sysRoute);

    int deleteByRoleIds(List<Long> id);

    List<AdminRoute> selectListByRoleId(Long id);

    List<String> selectNameListByRoleId(Long id);

    int deleteByIds(List<Long> ids);

    int deleteById(Long id);
}
