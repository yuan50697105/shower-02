package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.OrderInfoDao;
import org.yuan.boot.shower.db.dao.OrderItemDao;
import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderItem;
import org.yuan.boot.shower.wx.converter.WxOrderInfoConverter;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.pojo.WxOrderInfoQueryResult;
import org.yuan.boot.shower.wx.service.WxPrepayOrderService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:15
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
@Log4j2
public class WxPrepayOrderServiceImpl implements WxPrepayOrderService {
    private WxOrderInfoConverter wxOrderInfoConverter;
    private OrderInfoDao orderInfoDao;
    private OrderItemDao orderItemDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderInfo wxOrderInfo) {
        // TODO: 2020/1/23 预支付订单添加
        OrderInfo orderInfo = wxOrderInfoConverter.convertForAddOrder(wxOrderInfo);
        orderInfoDao.save(orderInfo);
        OrderItem orderItem = wxOrderInfoConverter.convertForAddOrderItem(orderInfo, wxOrderInfo);
        orderItemDao.save(orderItem);
        WxOrderInfoQueryResult wxOrderInfoQueryResult = new WxOrderInfoQueryResult();
        wxOrderInfoQueryResult.setOrderInfo(orderInfo);
        wxOrderInfoQueryResult.setOrderItems(Collections.singletonList(orderItem));
        return Results.data(wxOrderInfoQueryResult);
    }

}