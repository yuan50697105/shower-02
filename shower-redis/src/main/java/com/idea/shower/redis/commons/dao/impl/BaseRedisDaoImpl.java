package com.idea.shower.redis.commons.dao.impl;

import cn.hutool.core.util.ClassUtil;
import com.idea.shower.redis.commons.dao.BaseRedisDao;
import com.idea.shower.redis.commons.pojo.BaseRedisEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisKeyValueTemplate;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:49
 */
public class BaseRedisDaoImpl<T, KEY> implements BaseRedisDao<T, KEY> {
    @Autowired
    private RedisKeyValueTemplate redisKeyValueTemplate;

    private Class<T> type;

    @SuppressWarnings("unchecked")
    public BaseRedisDaoImpl() {
        type = (Class<T>) ClassUtil.getTypeArgument(this.getClass(), 0);
    }

    @Override
    public void insert(BaseRedisEntity<KEY, T> entity) {
        redisKeyValueTemplate.insert(entity.getKey(), entity.getData());
    }

    @Override
    public void insert(T t) {
        redisKeyValueTemplate.insert(t);
    }

    @Override
    public void update(BaseRedisEntity<KEY, T> entity) {
        redisKeyValueTemplate.update(entity.getKey(), entity.getData());
    }

    @Override
    public BaseRedisEntity<KEY, T> findById(KEY key) {
        return new BaseRedisEntity<>(key, redisKeyValueTemplate.findById(key, type).orElse(null));
    }

    @Override
    public Optional<T> find(KEY key) {
        return redisKeyValueTemplate.findById(key, type);
    }

    @Override
    public Iterable<T> findAll() {
        return redisKeyValueTemplate.findAll(type);
    }

}