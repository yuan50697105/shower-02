package org.yuan.boot.db.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.yuan.boot.db.dao.BaseDao;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.pojo.AbstractBaseEntity;

import java.io.Serializable;

public abstract class BaseDaoImpl<T extends AbstractBaseEntity<T>, ID extends Serializable, M extends BaseMapper<T>> extends ServiceImpl<M, T> implements BaseDao<T, ID> {

}
