package org.yuan.boot.db.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;
import org.yuan.boot.db.repository.BaseRepository;
import org.yuan.boot.db.dao.BaseDao;

import java.io.Serializable;

@SuppressWarnings({"SpringJavaAutowiredFieldsWarningInspection", "SpringJavaInjectionPointsAutowiringInspection"})
@Service
public abstract class BaseDaoImpl<T extends BaseEntity<T>, ID extends Serializable, R extends BaseRepository<T, ID>, M extends BaseMapper<T>> implements BaseDao<T, ID> {
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
