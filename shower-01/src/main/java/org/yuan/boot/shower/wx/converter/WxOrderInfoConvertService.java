package org.yuan.boot.shower.wx.converter;

import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderItem;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 11:55
 */
public interface WxOrderInfoConvertService {


    OrderInfo addOrder(WxOrderInfo wxOrderInfo);

    OrderItem addOrderItem(WxOrderInfo wxOrderInfo, OrderInfo orderInfo);

    List<OrderItem> addBaseOrderItems(WxOrderInfo wxOrderInfo, OrderInfo orderInfo);
}
