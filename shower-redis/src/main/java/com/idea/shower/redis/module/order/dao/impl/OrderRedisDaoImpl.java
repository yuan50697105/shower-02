package com.idea.shower.redis.module.order.dao.impl;

import cn.hutool.json.JSONUtil;
import com.idea.shower.redis.commons.dao.impl.BaseRedisDaoImpl;
import com.idea.shower.redis.module.order.dao.OrderRediskDao;
import com.idea.shower.redis.module.order.pojo.OrderTimeOutRedisEntity;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:55
 */
@AllArgsConstructor
@Component
@Slf4j
public class OrderRedisDaoImpl extends BaseRedisDaoImpl<OrderTimeOutRedisEntity> implements OrderRediskDao {

    @Override
    public void setOrderTimeOut(OrderTimeOutRedisEntity entity) {
        log.info("添加订单信息"+JSONUtil.toJsonStr(entity));
        setValue(ORDER_INFO + entity.getOrderId(), JSONUtil.toJsonStr(entity), entity.getTime(), entity.getUnit());
    }

    @Override
    public OrderTimeOutRedisEntity getOrderInfoByKey(Long orderId) {
        return getValue(ORDER_INFO + orderId);
    }

    @Override
    public void deleteOrderInfo(Long id) {
        log.info("删除订单信息"+id);
        del(ORDER_INFO+id);
    }
}