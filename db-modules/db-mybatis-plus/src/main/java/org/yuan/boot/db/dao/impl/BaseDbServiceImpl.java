package org.yuan.boot.db.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.yuan.boot.db.dao.BaseDao;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.BaseEntity;

import java.io.Serializable;

public abstract class BaseDbServiceImpl<T extends BaseEntity<T>, ID extends Serializable, M extends BaseMapper<T>> extends ServiceImpl<M, T> implements BaseDao<T, ID> {
}
