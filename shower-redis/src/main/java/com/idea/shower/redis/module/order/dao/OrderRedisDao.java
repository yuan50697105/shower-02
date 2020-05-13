package com.idea.shower.redis.module.order.dao;

import com.idea.shower.redis.commons.dao.BaseRedisDao;
import com.idea.shower.redis.module.order.pojo.OrderTimeOutRedisEntity;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:55
 */
public interface OrderRedisDao extends BaseRedisDao<OrderTimeOutRedisEntity> {
    String ORDER_INFO_RESERVATION = "ORDER_INFO_RESERVATION:";
    String ORDER_INFO_COMMONS = "ORDER_INFO_COMMONS";

    /**
     * 添加订单计时
     *
     * @param entity 订单计时实体
     */
    void setOrderTimeOut(OrderTimeOutRedisEntity entity);

    OrderTimeOutRedisEntity getOrderInfoByKey(Long orderId);

    void deleteOrderInfo(Long id);
}