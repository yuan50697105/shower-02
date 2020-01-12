package org.yuan.boot.db.dao.impl;

import org.yuan.boot.db.dao.BaseDao;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.AbstractBaseEntity;
import org.yuan.boot.db.repository.BaseRepository;

import java.io.Serializable;

public abstract class BaseDaoImpl<T extends AbstractBaseEntity<T>, ID extends Serializable, R extends BaseRepository<T, ID>, M extends BaseMapper<T>> implements BaseDao<T, ID> {
    private M baseMapper;
    private R baseRepository;

    public M baseMapper() {
        return baseMapper;
    }

    public R baseRepository() {
        return baseRepository;
    }
}
