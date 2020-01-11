package org.yuan.boot.db.dao.impl;

import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.dao.BaseDao;

import java.io.Serializable;

public abstract class BaseDaoImpl<T extends BaseEntity<T>, ID extends Serializable, M extends BaseMapper<T>> implements BaseDao<T, ID> {
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }
}
