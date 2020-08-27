package com.idea.shower.db.mybaits.commons.dao.impl;

import com.idea.shower.db.mybaits.base.dao.impl.BaseDbDaoImpl;
import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.commons.mapper.BaseMapper;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 16:27
 */
public abstract class BaseDaoImpl<T, M extends BaseMapper> extends BaseDbDaoImpl<T, Long, M> implements BaseDao<T> {

}