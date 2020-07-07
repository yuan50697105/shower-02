package com.idea.shower.db.mybaits.mapper;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 22:26
 */
@Mapper
public interface AdminUserRouteMapper {
    List<String> selectRouteByUsername(String username);
}
