package com.idea.shower.redis.commons.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:43
 */
@Data
public class BaseRedisEntity<KEY, T> {
    @Id
    private KEY key;
    private T data;

    public BaseRedisEntity() {
    }

    public BaseRedisEntity(KEY key, T data) {
        this.key = key;
        this.data = data;
    }
}