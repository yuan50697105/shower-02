package org.yuan.boot.db.jpa.dao.impl;

import org.yuan.boot.db.jpa.dao.BaseDao;
import org.yuan.boot.db.jpa.mapper.BaseMapper;
import org.yuan.boot.db.jpa.pojo.AbstractBaseEntity;
import org.yuan.boot.db.jpa.repository.BaseRepository;

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
