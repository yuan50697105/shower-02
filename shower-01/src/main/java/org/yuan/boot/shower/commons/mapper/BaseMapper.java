package org.yuan.boot.shower.commons.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @program: shower-01
 * @description: 基础Mapper
 * @author: yuane
 * @create: 2020-01-20 16:26
 */
@Mapper
public interface BaseMapper<T> extends org.yuan.boot.db.mapper.BaseMapper<T> {
}
