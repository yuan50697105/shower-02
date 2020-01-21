package org.yuan.boot.db.mapper;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 17:01
 */
@RegisterMapper
public interface BaseMapper<T> extends Mapper<T>, IdsMapper<T>, ConditionMapper<T> {
}
