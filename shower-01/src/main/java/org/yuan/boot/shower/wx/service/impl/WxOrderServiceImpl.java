package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.OrderInfoDao;
import org.yuan.boot.shower.db.dao.OrderItemDao;
import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderItem;
import org.yuan.boot.shower.wx.service.WxOrderInfoCreateService;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.service.OrderCodeService;
import org.yuan.boot.shower.wx.service.WxCustomerService;
import org.yuan.boot.shower.wx.service.WxOrderService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:49
 */
@Service
@AllArgsConstructor
public class WxOrderServiceImpl implements WxOrderService {
    private WxOrderInfoCreateService wxOrderInfoCreateService;
    private OrderCodeService orderCodeService;
    private WxCustomerService wxCustomerService;
    private OrderInfoDao orderInfoDao;
    private OrderItemDao orderItemDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderInfo wxOrderInfo) {
        OrderInfo orderInfo = wxOrderInfoCreateService.createOrder(wxOrderInfo);
        List<OrderItem> orderItems = wxOrderInfoCreateService.createRentalOrderItem(wxOrderInfo, orderInfo);
        orderInfoDao.save(orderInfo);
        orderItemDao.batchSave(orderItems);
        return Results.ok();
    }

    @Override
    public Result endOrder(WxOrderInfo wxOrderInfo) {
        return null;
    }

    @Override
    public Optional<OrderInfo> getById(Long orderId) {
        return orderInfoDao.selectById(orderId);
    }
}