package org.yuan.boot.db.service;

import org.yuan.boot.db.pojo.BaseEntity;

import java.io.Serializable;

public interface BaseDbService<T extends BaseEntity<T>, ID extends Serializable> {
}
