package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.db.pojo.*;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 11:55
 */
public interface WxOrderInfoCreateService {


    OrderInfo createOrder(WxOrderInfo wxOrderInfo);

    OrderItem createOrderItem(WxOrderInfo wxOrderInfo, OrderInfo orderInfo, CustomerInfo customerInfo, DeviceInfo deviceInfo, GoodsInfo goodsInfo);

    List<OrderItem> createRentalOrderItem(WxOrderInfo wxOrderInfo, OrderInfo orderInfo);
}
