package com.idea.shower.redis.module.dao;

import com.idea.shower.redis.commons.dao.BaseRedisDao;
import com.idea.shower.redis.module.pojo.OrderRedisEntity;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:55
 */
public interface OrderRediskDao extends BaseRedisDao<OrderRedisEntity, String> {
    /**
     * 添加订单计时
     *
     * @param entity 订单计时实体
     */
    void setOrderInTime(OrderRedisEntity entity);
}