package com.idea.shower.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.idea.shower.shower.commons.utils.Results;
import com.idea.shower.shower.db.dao.OrderInfoDao;
import com.idea.shower.shower.db.dao.OrderItemDao;
import com.idea.shower.shower.db.pojo.OrderInfo;
import com.idea.shower.shower.db.pojo.OrderItem;
import com.idea.shower.shower.wx.service.WxOrderInfoCreateService;
import com.idea.shower.shower.wx.pojo.WxOrderInfo;
import com.idea.shower.shower.wx.service.OrderCodeService;
import com.idea.shower.shower.wx.service.WxCustomerService;
import com.idea.shower.shower.wx.service.WxOrderService;
import com.idea.shower.webmvc.pojo.Result;

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