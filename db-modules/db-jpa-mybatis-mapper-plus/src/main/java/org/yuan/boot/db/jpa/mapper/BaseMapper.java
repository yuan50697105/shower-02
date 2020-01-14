package org.yuan.boot.db.jpa.mapper;


import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

@RegisterMapper
public interface BaseMapper<T> extends Mapper<T>, IdsMapper<T>, ConditionMapper<T> {
}
