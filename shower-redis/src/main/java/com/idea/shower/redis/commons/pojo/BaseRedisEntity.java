package com.idea.shower.redis.commons.pojo;

import com.idea.shower.db.core.pojo.BaseDbCoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:43
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseRedisEntity<KEY, T> extends BaseDbCoreEntity {
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