package org.yuan.boot.webmvc.app.dao.impl;

import org.yuan.boot.db.dao.impl.BaseDaoImpl;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.webmvc.app.dao.BaseService;
import org.yuan.boot.webmvc.app.pojo.BaseEntity;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 00:14
 */
public class BaseServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> extends BaseDaoImpl<T, Long, M> implements BaseService<T> {
}