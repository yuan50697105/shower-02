package com.idea.shower.redis.commons.dao.impl;

import cn.hutool.core.util.ClassUtil;
import cn.hutool.json.JSONUtil;
import com.idea.shower.redis.commons.dao.BaseRedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:49
 */
public class BaseRedisDaoImpl<T> implements BaseRedisDao<T> {
    @Autowired
    private RedisKeyValueTemplate redisKeyValueTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private Class<T> type;

    @SuppressWarnings("unchecked")
    public BaseRedisDaoImpl() {
        type = (Class<T>) ClassUtil.getTypeArgument(this.getClass(), 0);
    }


    @Override
    public void insert(T t) {
        redisKeyValueTemplate.insert(t);
    }

    @Override
    public Optional<T> find(String key) {
        return redisKeyValueTemplate.findById(key, type);
    }

    @Override
    public Iterable<T> findAll() {
        return redisKeyValueTemplate.findAll(type);
    }

    @Override
    public void setValue(String key, Object value, Integer time, TimeUnit unit) {
        stringRedisTemplate.opsForValue().set(key, JSONUtil.toJsonStr(value), time, unit);
    }

    @Override
    public T getValue(String key) {
        return JSONUtil.toBean(stringRedisTemplate.opsForValue().get(key), type);
    }

    @Override
    public void del(String key){
        stringRedisTemplate.delete(key);
    }
}