package com.idea.shower.redis.module.dao.impl;

import com.idea.shower.redis.commons.dao.impl.BaseRedisDaoImpl;
import com.idea.shower.redis.module.dao.OrderLockDao;
import com.idea.shower.redis.module.pojo.OrderLock;
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
public class OrderLockDaoImpl extends BaseRedisDaoImpl<OrderLock, String> implements OrderLockDao {
    
}