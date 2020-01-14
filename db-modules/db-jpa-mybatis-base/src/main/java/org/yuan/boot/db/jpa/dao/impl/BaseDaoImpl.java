package org.yuan.boot.db.jpa.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.jpa.dao.BaseDao;
import org.yuan.boot.db.jpa.mapper.BaseMapper;
import org.yuan.boot.db.jpa.pojo.AbstractBaseEntity;
import org.yuan.boot.db.jpa.repository.BaseRepository;

import java.io.Serializable;

@SuppressWarnings({"SpringJavaAutowiredFieldsWarningInspection", "SpringJavaInjectionPointsAutowiringInspection"})
@Service
public abstract class BaseDaoImpl<T extends AbstractBaseEntity<T>, ID extends Serializable, R extends BaseRepository<T, ID>, M extends BaseMapper<T>> implements BaseDao<T, ID> {
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
