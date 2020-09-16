package com.idea.shower.db.mybaits.module.dao;

import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.AdminRoute;
import com.idea.shower.db.mybaits.module.pojo.AdminRouteExample;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-02 12:21
 */
public interface AdminRouteDao extends CommonsDao<AdminRoute,AdminRoute> {
    List<AdminRoute> selectByExample(AdminRouteExample adminRouteExample);


    int deleteByRoleIds(List<Long> id);

    List<AdminRoute> selectListByRoleId(Long id);

    List<String> selectNameListByRoleId(Long id);

    int deleteByIds(List<Long> ids);

    int deleteById(Long id);
}
