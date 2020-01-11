package org.yuan.boot.db.dao;

import org.yuan.boot.db.pojo.BaseEntity;

import java.io.Serializable;

public interface BaseDao<T extends BaseEntity<T>, ID extends Serializable> {
}
