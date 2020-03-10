package com.idea.shower.app.commons.db.module.dao;

import com.idea.shower.app.commons.db.commons.dao.BaseDao;
import com.idea.shower.app.commons.db.module.pojo.OrderItem;

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
