package com.idea.shower.db.mybaits.module.dao;

import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.pojo.WxPageResult;
import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.OrderInfo;
import com.idea.shower.db.mybaits.module.pojo.ao.OrderInfoAo;
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
public interface OrderInfoDao extends CommonsDao<OrderInfo, OrderInfoAo> {

    Optional<OrderInfo> getByIdOpt(Long orderId);

    void updateStatusCompleteByOrderNo(String outTradeNo);

    PageResult<OrderInfo> selectPageByCondition(OrderInfoQuery condition);

    WxPageResult<OrderInfo> selectPageByConditionWeXin(OrderInfoQuery query);

    Optional<OrderInfo> getByOrderNoOpt(String orderNo);

    void updateTotalPriceByOrderNo(BigDecimal totalprice, String orderNo);

    WxPageResult<OrderInfoDeviceVO> selectOrderInfoDeviceVOPageByCondition(OrderInfoQuery query);

    void updateStatusUsingById(Long id);

    void updateStatusTimeOutById(Long id);

    void updateStatusEndUseById(Long id);

    Optional<OrderInfoDeviceVO> getByOrderNoDeviceVoOpt(String orderNo);

    void updateEndTimeByOrderId(Date date, Long id);

    void updateUseStartTime(Date date, Long id);

    void updateStatusCancelByOrderNo(String orderNo);

    void updateTransactionIdByOrderNo(String transactionId, String outTradeNo);
}
