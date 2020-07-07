package com.idea.shower.db.mybaits.dao.impl;

import com.idea.shower.db.mybaits.dao.AdminUserRouteDao;
import com.idea.shower.db.mybaits.mapper.AdminUserRouteMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 22:25
 */
@Service
@AllArgsConstructor
public class AdminUserRouteDaoImpl implements AdminUserRouteDao {
    private final AdminUserRouteMapper adminUserRouteMapper;

    @Override
    public List<String> selectRouteNameByUsername(String username) {
        return adminUserRouteMapper.selectRouteNameByUsername(username);
    }
}