package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.db.jpa.dao.BaseDao;
import org.yuan.boot.webmvc.app.pojo.BaseEntity;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 14:35
 */
public interface BaseService<T extends BaseEntity<T>> extends BaseDao<T, Long> {
}
