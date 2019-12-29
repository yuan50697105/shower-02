package org.yuan.boot.db.service.impl;

import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.repository.BaseRepository;
import org.yuan.boot.db.service.BaseDbService;

public abstract class BaseDbServiceImpl<T extends BaseEntity<T>, R extends BaseRepository<T>, M extends BaseMapper<T>> implements BaseDbService<T> {
    private M baseMapper;
    private R baseRepository;

    public M baseMapper() {
        return baseMapper;
    }

    public R baseRepository() {
        return baseRepository;
    }
}
