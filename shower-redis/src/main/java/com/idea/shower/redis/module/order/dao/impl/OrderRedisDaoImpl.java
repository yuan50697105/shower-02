package com.idea.shower.redis.module.order.dao.impl;

import cn.hutool.json.JSONUtil;
import com.idea.shower.redis.commons.dao.impl.BaseRedisDaoImpl;
import com.idea.shower.redis.module.order.dao.OrderRediskDao;
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
public class OrderRedisDaoImpl extends BaseRedisDaoImpl<OrderTimeOutRedisEntity> implements OrderRediskDao {

    @Override
    public void setOrderTimeOut(OrderTimeOutRedisEntity entity) {
        setValue(ORDER_INFO + entity.getOrderId(), JSONUtil.toJsonStr(entity), entity.getTime(), entity.getUnit());
    }

    @Override
    public OrderTimeOutRedisEntity getOrderInfoByKey(Long orderId) {
        return getValue("orderInfo:" + orderId);
    }
}