package com.idea.shower.app.wx.mp.service;

import com.idea.shower.app.db.module.pojo.OrderInfo;
import com.idea.shower.app.db.module.pojo.OrderItem;
import com.idea.shower.app.wx.mp.pojo.WxOrderInfo;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 11:55
 */
public interface WxOrderInfoCreateService {


    OrderInfo createOrder(WxOrderInfo wxOrderInfo);


    List<OrderItem> createRentalOrderItem(WxOrderInfo wxOrderInfo, OrderInfo orderInfo);

    List<OrderItem> createContinueOrderItem(WxOrderInfo wxOrderInfo, OrderItem rentalOrderItem);

}
