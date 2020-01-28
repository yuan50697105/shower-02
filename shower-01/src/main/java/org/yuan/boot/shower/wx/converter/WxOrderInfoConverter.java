package org.yuan.boot.shower.wx.converter;

import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderItem;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:09
 */
public interface WxOrderInfoConverter {

    OrderInfo convertForAddCommonsOrder(WxOrderInfo wxOrderInfo);

    OrderItem convertForAddCommonsOrderItem(OrderInfo orderInfo, WxOrderInfo wxOrderInfo);
}
