package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.module.pojo.OrderItem;

import java.util.List;
import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 19:55
 */
public interface OrderItemDao extends BaseDao<OrderItem> {
    void insert(OrderItem orderItem);

    void batchSave(List<OrderItem> orderItems);

    Optional<OrderItem> getRentalItemByOrderIdOpt(Long orderId);

    List<OrderItem> selectListByOrderNo(String orderNo);

    OrderItem getStartingItemByOrderId(Long id);
}
