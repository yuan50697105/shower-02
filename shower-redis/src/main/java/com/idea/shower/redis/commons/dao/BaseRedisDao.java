package com.idea.shower.redis.commons.dao;

import com.idea.shower.redis.commons.pojo.BaseRedisEntity;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:49
 */
public interface BaseRedisDao<T,KEY> {
    void insert(BaseRedisEntity<KEY, T> entity);

    void insert(T t);

    void update(BaseRedisEntity<KEY, T> entity);

    BaseRedisEntity<KEY, T> findById(KEY key);

    Optional<T> find(KEY key);

    Iterable<T> findAll();
}
