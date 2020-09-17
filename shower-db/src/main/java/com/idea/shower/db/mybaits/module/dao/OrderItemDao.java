package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.OrderItem;

import java.util.List;
import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 19:55
 */
<<<<<<< HEAD
public interface OrderItemDao extends CommonsDao<OrderItem,OrderItem> {
=======
public interface OrderItemDao extends BaseDao<OrderItem> {
    void insert(OrderItem orderItem);
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92

    void batchSave(List<OrderItem> orderItems);

    Optional<OrderItem> getRentalItemByOrderIdOpt(Long orderId);

    List<OrderItem> selectListByOrderNo(String orderNo);

    OrderItem getStartingItemByOrderId(Long id);
}
