package org.yuan.boot.db.service.impl;

import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.repository.BaseRepository;
import org.yuan.boot.db.service.BaseDbService;

import java.io.Serializable;

public abstract class BaseDbServiceImpl<T extends BaseEntity<T>, ID extends Serializable, R extends BaseRepository<T, ID>, M extends BaseMapper<T>> implements BaseDbService<T, ID> {
    private M baseMapper;
    private R baseRepository;

    public M baseMapper() {
        return baseMapper;
    }

    public R baseRepository() {
        return baseRepository;
    }
}
