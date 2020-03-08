package com.idea.shower.shower.db.dao;

import com.idea.shower.db.pojo.PageResult;
import com.idea.shower.shower.commons.dao.BaseDao;
import com.idea.shower.shower.db.pojo.OrderInfo;
import com.idea.shower.shower.db.pojo.OrderInfoCondition;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:34
 */
public interface OrderInfoDao extends BaseDao<OrderInfo> {
    PageResult<OrderInfo> selectPage(OrderInfoCondition condition);

    void save(OrderInfo orderInfo);

    Optional<OrderInfo> selectById(Long orderId);

}
