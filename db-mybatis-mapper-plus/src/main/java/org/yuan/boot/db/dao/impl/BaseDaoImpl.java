package org.yuan.boot.db.dao.impl;

import org.yuan.boot.db.dao.BaseDao;
import org.yuan.boot.db.mapper.BaseMapper;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-22 15:49
 */
public abstract class BaseDaoImpl<T, M extends BaseMapper<T>> implements BaseDao<T> {
}