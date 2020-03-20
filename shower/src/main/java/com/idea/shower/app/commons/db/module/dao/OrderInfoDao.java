package com.idea.shower.app.commons.db.module.dao;

import com.idea.shower.db.mybaits.pojo.PageResult;
import com.idea.shower.app.commons.db.commons.dao.BaseDao;
import com.idea.shower.app.commons.db.module.pojo.OrderInfo;
import com.idea.shower.app.commons.db.module.pojo.OrderInfoQueryBaseConditionQuery;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:34
 */
public interface OrderInfoDao extends BaseDao<OrderInfo> {
    PageResult<OrderInfo> selectPage(OrderInfoQueryBaseConditionQuery condition);

    void save(OrderInfo orderInfo);

    Optional<OrderInfo> selectById(Long orderId);

}
