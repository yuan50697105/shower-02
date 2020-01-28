package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.db.pojo.OrderInfoCondition;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.webmvc.pojo.Result;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: shower-01
 * @description: 微信订单处理
 * @author: yuane
 * @create: 2020-01-23 19:08
 */
public interface WxOrderService {
    Result addOrder(WxOrderInfo wxOrderInfo);

    Result payNotify(WxOrderInfo wxOrderInfo);

    Result data(OrderInfoCondition condition);

    Result prepay(Long orderId);

    Result pay(Long orderId);

    Result payNotify(HttpServletRequest request);
}
