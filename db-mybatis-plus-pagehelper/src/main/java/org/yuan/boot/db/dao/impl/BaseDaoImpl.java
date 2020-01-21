package org.yuan.boot.db.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.yuan.boot.db.dao.BaseDao;
import org.yuan.boot.db.mapper.BaseMapper;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 17:06
 */
public abstract class BaseDaoImpl<T, M extends BaseMapper<T>> extends ServiceImpl<M, T> implements BaseDao<T> {
}