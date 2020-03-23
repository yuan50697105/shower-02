package com.idea.shower.app.db.module.dao;


import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.OrderItem;

import java.util.List;
import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 19:55
 */
public interface OrderItemDao extends BaseDao<OrderItem> {
    void save(OrderItem orderItem);

    void batchSave(List<OrderItem> orderItems);

    Optional<OrderItem> getRentalItemByOrderId(Long orderId);

    List<OrderItem> selectListByOrderId(Long orderId);
}
