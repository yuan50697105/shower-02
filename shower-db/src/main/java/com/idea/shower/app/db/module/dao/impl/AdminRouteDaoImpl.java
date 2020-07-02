package com.idea.shower.app.db.module.dao.impl;

import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.AdminRouteDao;
import com.idea.shower.app.db.module.mapper.AdminRouteMapper;
import com.idea.shower.app.db.module.pojo.AdminRoute;
import com.idea.shower.app.db.module.pojo.AdminRouteExample;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-02 12:21
 */
@Component
public class AdminRouteDaoImpl extends BaseDaoImpl<AdminRoute, AdminRouteMapper> implements AdminRouteDao {
    @Override
    public List<AdminRoute> selectByExample(AdminRouteExample adminRouteExample) {
        return baseMapper().selectByExample(adminRouteExample);
    }

    @Override
    public int insert(AdminRoute sysRoute) {
        return baseMapper().insert(sysRoute);
    }
}