package com.idea.shower.db.mybaits.dao;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 22:24
 */
public interface AdminUserRouteDao {
    List<String> selectRouteNameByUsername(String username);
}
