package com.idea.shower.app.db.module.dao;

import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.OrderInfo;
import com.idea.shower.app.db.module.pojo.OrderInfoQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:34
 */
public interface OrderInfoDao extends BaseDao<OrderInfo> {
    PageResult<OrderInfo> selectPage(OrderInfoQuery condition);

    void save(OrderInfo orderInfo);

    Optional<OrderInfo> selectById(Long orderId);

}
