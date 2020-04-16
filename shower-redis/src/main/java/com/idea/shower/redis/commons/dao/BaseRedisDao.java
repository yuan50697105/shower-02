package com.idea.shower.redis.commons.dao;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:49
 */
public interface BaseRedisDao<T,KEY> {

    void insert(T t);

    Optional<T> find(KEY key);

    Iterable<T> findAll();

    void setValue(String key, Object value, Integer time, TimeUnit unit);

    T getValue(String key);
}
