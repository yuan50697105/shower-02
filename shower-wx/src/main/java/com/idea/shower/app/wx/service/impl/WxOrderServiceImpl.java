package com.idea.shower.app.wx.service.impl;

import com.idea.shower.app.wx.pojo.WxOrderInfo;
import com.idea.shower.app.wx.service.OrderCodeService;
import com.idea.shower.app.wx.service.WxOrderInfoCreateService;
import com.idea.shower.app.wx.service.WxOrderService;
import com.idea.shower.app.commons.db.module.dao.OrderInfoDao;
import com.idea.shower.app.commons.db.module.dao.OrderItemDao;
import com.idea.shower.app.commons.db.module.pojo.OrderInfo;
import com.idea.shower.app.commons.db.module.pojo.OrderItem;
import com.idea.shower.app.commons.utils.Results;
import com.idea.shower.app.wx.service.WxCustomerService;
import com.idea.shower.web.webmvc.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        String orderNo = wxOrderInfo.getOrderNo();
        Long orderId = wxOrderInfo.getOrderId();
        return null;
    }

    @Override
    public Optional<OrderInfo> getById(Long orderId) {
        return orderInfoDao.selectById(orderId);
    }
}