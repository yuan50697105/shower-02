package com.idea.shower.app.wx.mp.service.impl;

import com.idea.shower.app.wx.mp.pojo.WxOrderInfo;
import com.idea.shower.app.wx.mp.service.CreateWxOrderInfoService;
import com.idea.shower.app.wx.mp.service.WxOrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.idea.shower.app.commons.utils.ResultUtils;
import com.idea.shower.app.commons.db.module.dao.OrderInfoDao;
import com.idea.shower.app.commons.db.module.dao.OrderItemDao;
import com.idea.shower.app.commons.db.module.pojo.OrderInfo;
import com.idea.shower.app.commons.db.module.pojo.OrderItem;
import com.idea.shower.web.webmvc.pojo.Result;

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
    private CreateWxOrderInfoService createWxOrderInfoService;
    private OrderInfoDao orderInfoDao;
    private OrderItemDao orderItemDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderInfo wxOrderInfo) {
        OrderInfo orderInfo = createWxOrderInfoService.createOrder(wxOrderInfo);
        List<OrderItem> orderItems = createWxOrderInfoService.createRentalOrderItem(wxOrderInfo, orderInfo);
        orderInfoDao.save(orderInfo);
        orderItemDao.batchSave(orderItems);
        return ResultUtils.ok();
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