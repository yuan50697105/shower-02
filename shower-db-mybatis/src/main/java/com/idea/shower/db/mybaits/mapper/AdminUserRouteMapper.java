package com.idea.shower.db.mybaits.mapper;

import org.mapstruct.Mapper;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 22:26
 */
@Mapper
public interface AdminUserRouteMapper {
    List<String> selectRouteNameByUsername(String username);
}
