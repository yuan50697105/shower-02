package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.dao.AdminRouteDao;
import com.idea.shower.db.mybaits.module.mapper.AdminRouteMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminRoute;
import com.idea.shower.db.mybaits.module.pojo.AdminRouteExample;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-02 12:21
 */
@Component
public class AdminRouteDaoImpl extends CommonsDaoImpl<AdminRoute, AdminRouteMapper> implements AdminRouteDao {
    @Override
    public List<AdminRoute> selectByExample(AdminRouteExample adminRouteExample) {
        return baseDao().selectByExample(adminRouteExample);
    }


    @Override
    public int deleteByRoleIds(List<Long> roleIds) {
        AdminRouteExample example = new AdminRouteExample();
        example.or().andRoleIdIn(roleIds);
        return baseDao().deleteByExample(example);
    }

    @Override
    public List<AdminRoute> selectListByRoleId(Long id) {
        AdminRouteExample example = new AdminRouteExample();
        example.or().andRoleIdEqualTo(id);
        return baseDao().selectByExample(example);
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
        return baseDao().deleteByExample(example);
    }

    @Override
    public int deleteById(Long id) {
        return baseDao().deleteByPrimaryKey(id);
    }

    @Override
    public QueryWrapper<AdminRoute> getWrapper(Map<String, Object> params) {
        return null;
    }
}