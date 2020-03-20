package com.idea.shower.app.wx.service;

import com.idea.shower.app.wx.pojo.WxOrderInfo;
import com.idea.shower.app.commons.db.module.pojo.*;

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
