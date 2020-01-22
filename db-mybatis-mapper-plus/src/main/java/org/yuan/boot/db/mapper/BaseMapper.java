package org.yuan.boot.db.mapper;

import com.baomidou.mybatisplus.core.mapper.Mapper;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-22 15:48
 */
@RegisterMapper
public interface BaseMapper<T> extends com.baomidou.mybatisplus.core.mapper.BaseMapper<T>, Mapper<T>, IdsMapper<T>, ConditionMapper<T> {
}
