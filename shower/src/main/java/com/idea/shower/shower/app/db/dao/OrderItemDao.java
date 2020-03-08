package com.idea.shower.shower.app.db.dao;

import com.idea.shower.shower.app.commons.dao.BaseDao;
import com.idea.shower.shower.app.db.pojo.OrderItem;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:42
 */
public interface OrderItemDao extends BaseDao<OrderItem> {
    void save(OrderItem orderItem);

    void batchSave(List<OrderItem> orderItems);
}
