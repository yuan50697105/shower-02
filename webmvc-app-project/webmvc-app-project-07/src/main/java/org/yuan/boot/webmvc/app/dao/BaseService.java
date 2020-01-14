package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.db.dao.BaseDao;
import org.yuan.boot.webmvc.app.pojo.BaseEntity;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 14:01
 */
public interface BaseService<T extends BaseEntity<T>> extends BaseDao<T, Long> {
}
