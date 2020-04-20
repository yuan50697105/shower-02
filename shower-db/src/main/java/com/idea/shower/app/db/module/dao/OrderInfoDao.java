package com.idea.shower.app.db.module.dao;

import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.OrderInfo;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.db.core.pojo.WxPageResult;
import com.idea.shower.db.mybaits.pojo.PageResult;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:12
 */
public interface OrderInfoDao extends BaseDao<OrderInfo> {
    void save(OrderInfo orderInfo);

    Optional<OrderInfo> getById(Long orderId);

    void updateStatusPaidByOrderNo(String outTradeNo);

    PageResult<OrderInfo> selectPageByCondition(OrderInfoQuery condition);

    WxPageResult<OrderInfo> selectPageByConditionWeXin(OrderInfoQuery query);

    Optional<OrderInfo> getByOrderNo(String orderNo);

    void updateTotalPriceByOrderNo(BigDecimal totalprice, String orderNo);

    void updateStatusUsingByOrderId(Long orderId);
}
