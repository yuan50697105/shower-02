package org.yuan.boot.db.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.db.dao.BaseDao;
import org.yuan.boot.db.mapper.BaseMapper;

import java.io.Serializable;

@SuppressWarnings("SpringJavaAutowiredMembersInspection")
public abstract class BaseDaoImpl<T, ID extends Serializable, M extends BaseMapper> implements BaseDao<T, ID> {
    @Autowired
    private M baseMapper;

    public M baseMapper() {
        return baseMapper;
    }

}
