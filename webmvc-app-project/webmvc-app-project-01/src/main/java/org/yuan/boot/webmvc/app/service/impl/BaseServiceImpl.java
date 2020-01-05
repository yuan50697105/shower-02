package org.yuan.boot.webmvc.app.service.impl;

import cn.hutool.core.lang.Snowflake;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.db.service.impl.BaseDbServiceImpl;
import org.yuan.boot.webmvc.app.pojo.BaseEntity;
import org.yuan.boot.webmvc.app.service.BaseService;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 00:14
 */

public class BaseServiceImpl<T extends BaseEntity<T>, M extends BaseMapper<T>> extends BaseDbServiceImpl<T, Long, M> implements BaseService<T> {
    private Snowflake snowflake;
}