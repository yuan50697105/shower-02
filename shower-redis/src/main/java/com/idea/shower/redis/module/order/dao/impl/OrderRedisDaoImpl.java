package com.idea.shower.redis.module.order.dao.impl;

import cn.hutool.json.JSONUtil;
import com.idea.shower.redis.commons.dao.impl.BaseRedisDaoImpl;
import com.idea.shower.redis.module.order.dao.OrderRedisDao;
import com.idea.shower.redis.module.order.pojo.OrderTimeOutRedisEntity;
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
public class OrderRedisDaoImpl extends BaseRedisDaoImpl<OrderTimeOutRedisEntity> implements OrderRedisDao {

    @Override
    public void setOrderTimeOut(OrderTimeOutRedisEntity entity) {
        setValue(ORDER_INFO_REDIS_KEY + entity.getOrderId(), JSONUtil.toJsonStr(entity), entity.getTime(), entity.getUnit());
    }

    @Override
    public void deleteOrderInfo(Long orderId) {
        deleteValue(ORDER_INFO_REDIS_KEY + orderId);
    }

    @Override
    public OrderTimeOutRedisEntity getOrderInfoByKey(Long orderId) {
        return getValue("orderInfo:" + orderId);
    }
}