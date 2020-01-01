package org.yuan.boot.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.service.BaseDbService;

import java.io.Serializable;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public abstract class BaseDbServiceImpl<T extends BaseEntity<T>, ID extends Serializable, M extends BaseMapper<T>> implements BaseDbService<T, ID> {
    @Autowired
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }

}
