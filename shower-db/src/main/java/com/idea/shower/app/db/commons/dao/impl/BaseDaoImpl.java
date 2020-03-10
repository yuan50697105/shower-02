package com.idea.shower.app.db.commons.dao.impl;

import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.db.mybaits.dao.impl.BaseDbDaoImpl;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 16:27
 */
public abstract class BaseDaoImpl<T, M extends BaseMapper> extends BaseDbDaoImpl<T, Long, M> implements BaseDao<T> {

}