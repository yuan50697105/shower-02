package com.idea.shower.db.mybaits.module.dao;

import com.idea.shower.db.mybaits.base.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.core.pojo.IWxPageResult;
import com.idea.shower.db.mybaits.module.pojo.OrderInfo;
import com.idea.shower.db.mybaits.module.pojo.query.OrderInfoQuery;
import com.idea.shower.db.mybaits.module.pojo.vo.OrderInfoDeviceVO;

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
    void insert(OrderInfo orderInfo);

    Optional<OrderInfo> getByIdOpt(Long orderId);

    void updateStatusCompleteByOrderNo(String outTradeNo);

    PageResult<OrderInfo> selectPageByCondition(OrderInfoQuery condition);

    IWxPageResult<OrderInfo> selectPageByConditionWeXin(OrderInfoQuery query);

    Optional<OrderInfo> getByOrderNoOpt(String orderNo);

    void updateTotalPriceByOrderNo(BigDecimal totalprice, String orderNo);

    IWxPageResult<OrderInfoDeviceVO> selectOrderInfoDeviceVOPageByCondition(OrderInfoQuery query);

    void updateStatusUsingById(Long id);

    void updateStatusTimeOutById(Long id);

    void updateStatusEndUseById(Long id);

    Optional<OrderInfoDeviceVO> getByOrderNoDeviceVoOpt(String orderNo);

    void updateEndTimeByOrderId(Date date, Long id);

    void updateUseStartTime(Date date, Long id);

    void updateStatusCancelByOrderNo(String orderNo);

    void updateTransactionIdByOrderNo(String transactionId, String outTradeNo);
}
