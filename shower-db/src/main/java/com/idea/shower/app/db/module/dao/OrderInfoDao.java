package com.idea.shower.app.db.module.dao;

import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.OrderInfo;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.app.db.module.pojo.vo.OrderInfoDeviceVO;
import com.idea.shower.db.core.pojo.IWxPageResult;
import com.idea.shower.db.mybaits.pojo.PageResult;

import java.math.BigDecimal;
import java.util.Date;
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

    IWxPageResult<OrderInfo> selectPageByConditionWeXin(OrderInfoQuery query);

    Optional<OrderInfo> getByOrderNo(String orderNo);

    void updateTotalPriceByOrderNo(BigDecimal totalprice, String orderNo);

    IWxPageResult<OrderInfoDeviceVO> selectOrderInfoDeviceVOPageByCondition(OrderInfoQuery query);

    void updateStatusUsingById(Long id);

    void updateStatusTimeOutById(Long id);

    void updateStatusEndUseById(Long id);

    Optional<OrderInfoDeviceVO> getByOrderNoDeviceVo(String orderNo);

    void updateEndTimeByOrderId(Date date, Long id);

    void updateUseStartTime(Date date, Long id);

    void updateStatusCancelByOrderNo(String orderNo);
}
