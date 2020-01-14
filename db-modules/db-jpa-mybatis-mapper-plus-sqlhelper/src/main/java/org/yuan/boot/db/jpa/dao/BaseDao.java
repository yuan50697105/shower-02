package org.yuan.boot.db.jpa.dao;

import org.yuan.boot.db.jpa.pojo.AbstractBaseEntity;

import java.io.Serializable;

public interface BaseDao<T extends AbstractBaseEntity<T>, ID extends Serializable> {
}
