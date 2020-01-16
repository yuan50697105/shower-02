package org.yuan.boot.db.dao;

import org.yuan.boot.db.pojo.AbstractBaseEntity;

import java.io.Serializable;

public interface BaseDao<T extends AbstractBaseEntity<T>, ID extends Serializable> {
}
