package com.idea.shower.shower.commons.dao.impl;

import com.idea.shower.shower.commons.dao.BaseDao;
import com.idea.shower.shower.commons.mapper.BaseMapper;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 16:27
 */
public abstract class BaseDaoImpl<T, M extends BaseMapper> extends com.idea.shower.db.dao.impl.BaseDaoImpl<T, Long, M> implements BaseDao<T> {

}