package org.yuan.boot.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.repository.BaseRepository;
import org.yuan.boot.db.service.BaseService;

@SuppressWarnings({"SpringJavaAutowiredFieldsWarningInspection", "SpringJavaInjectionPointsAutowiringInspection"})
@Service
public abstract class BaseServiceImpl<T extends BaseEntity<T>, R extends BaseRepository<T>, M extends BaseMapper<T>> implements BaseService<T> {
    @Autowired
    private R baseRepository;
    @Autowired
    private M baseMapper;

    public R baseRepository() {
        return baseRepository;
    }

    public M baseMapper() {
        return baseMapper;
    }

}
