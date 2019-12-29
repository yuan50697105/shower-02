package org.yuan.boot.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.service.BaseDbService;

public abstract class BaseDbServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> implements BaseDbService<T> {
    @Autowired
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }
}
