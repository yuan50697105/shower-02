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
import org.yuan.boot.shower.wx.service.WxCommonsOrderService;
import org.yuan.boot.shower.wx.service.WxOrderNoService;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:11
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
@Log4j2
public class WxCommonsOrderServiceImpl implements WxCommonsOrderService {
    private WxOrderInfoConverter wxOrderInfoConverter;
    private OrderInfoDao orderInfoDao;
    private OrderItemDao orderItemDao;
    private WxOrderNoService wxOrderNoService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderInfo wxOrderInfo) {
        // TODO: 2020/1/23  添加普通订单
        OrderInfo orderInfo = wxOrderInfoConverter.convertForAddOrder(wxOrderInfo);
        orderInfo.setOrderNo(wxOrderNoService.getOrderNo());
        orderInfoDao.save(orderInfo);
        OrderItem orderItem = wxOrderInfoConverter.convertForAddOrderItem(orderInfo, wxOrderInfo);
        orderItemDao.save(orderItem);
        return Results.ok();
    }
}