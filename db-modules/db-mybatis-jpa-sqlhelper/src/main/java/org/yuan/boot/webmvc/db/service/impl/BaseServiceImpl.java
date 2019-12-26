package org.yuan.boot.webmvc.db.service.impl;

import org.yuan.boot.webmvc.db.mapper.BaseMapper;
import org.yuan.boot.webmvc.db.pojo.BaseEntity;
import org.yuan.boot.webmvc.db.repository.BaseRepository;
import org.yuan.boot.webmvc.db.service.BaseService;

public abstract class BaseServiceImpl<T extends BaseEntity<T>, R extends BaseRepository<T>, M extends BaseMapper<T>> implements BaseService<T> {
    private M baseMapper;
    private R baseRepository;

    public M baseMapper() {
        return baseMapper;
    }

    public R baseRepository() {
        return baseRepository;
    }
}
