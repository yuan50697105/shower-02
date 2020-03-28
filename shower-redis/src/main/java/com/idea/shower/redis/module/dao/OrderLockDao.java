package com.idea.shower.redis.module.dao;

import com.idea.shower.redis.commons.dao.BaseRedisDao;
import com.idea.shower.redis.module.pojo.OrderLock;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:55
 */
public interface OrderLockDao extends BaseRedisDao<OrderLock, String> {
}