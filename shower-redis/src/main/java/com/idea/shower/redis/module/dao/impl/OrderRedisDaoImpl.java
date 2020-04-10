package com.idea.shower.redis.module.dao.impl;

import com.idea.shower.redis.commons.dao.impl.BaseRedisDaoImpl;
import com.idea.shower.redis.module.dao.OrderRediskDao;
import com.idea.shower.redis.module.pojo.OrderRedisEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:55
 */
@AllArgsConstructor
@Component
public class OrderRedisDaoImpl extends BaseRedisDaoImpl<OrderRedisEntity, String> implements OrderRediskDao {
    @Override
    public void setOrderInTime(OrderRedisEntity entity) {
        setValue(String.valueOf(entity.getOrderId()), entity.getOrderNo(), entity.getTime(), entity.getUnit());
    }
}