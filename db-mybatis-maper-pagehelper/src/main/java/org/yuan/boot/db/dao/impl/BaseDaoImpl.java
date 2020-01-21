package org.yuan.boot.db.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.db.dao.BaseDao;
import org.yuan.boot.db.mapper.BaseMapper;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 17:03
 */
public abstract class BaseDaoImpl<T, M extends BaseMapper<T>> implements BaseDao<T> {
    @Autowired
    private M baseMapper;

    protected M baseMapper() {
        return baseMapper;
    }
}