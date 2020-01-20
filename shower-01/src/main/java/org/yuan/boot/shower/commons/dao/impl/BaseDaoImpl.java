package org.yuan.boot.shower.commons.dao.impl;

import org.springframework.stereotype.Component;
import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.commons.mapper.BaseMapper;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 16:27
 */
public abstract class BaseDaoImpl<T, M extends BaseMapper<T>> extends org.yuan.boot.db.dao.impl.BaseDaoImpl<T, Long, M> implements BaseDao<T> {

}