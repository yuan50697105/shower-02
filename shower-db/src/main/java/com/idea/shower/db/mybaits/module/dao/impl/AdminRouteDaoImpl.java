package com.idea.shower.db.mybaits.module.dao.impl;

import com.idea.shower.db.mybaits.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.db.mybaits.module.dao.AdminRouteDao;
import com.idea.shower.db.mybaits.module.mapper.AdminRouteMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminRoute;
import com.idea.shower.db.mybaits.module.pojo.AdminRouteExample;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public int deleteByRoleIds(List<Long> roleIds) {
        AdminRouteExample example = new AdminRouteExample();
        example.or().andRoleIdIn(roleIds);
        return baseMapper().deleteByExample(example);
    }

    @Override
    public List<AdminRoute> selectListByRoleId(Long id) {
        AdminRouteExample example = new AdminRouteExample();
        example.or().andRoleIdEqualTo(id);
        return baseMapper().selectByExample(example);
    }

    @Override
    public List<String> selectNameListByRoleId(Long id) {
        List<AdminRoute> list = selectListByRoleId(id);
        return list.stream().map(AdminRoute::getName).distinct().collect(Collectors.toList());
    }

    @Override
    public int deleteByIds(List<Long> ids) {
        AdminRouteExample example = new AdminRouteExample();
        example.or().andIdIn(ids);
        return baseMapper().deleteByExample(example);
    }

    @Override
    public int deleteById(Long id) {
        return baseMapper().deleteByPrimaryKey(id);
    }
}