package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:49
 */
public interface WxOrderService {
    Result addOrder(WxOrderInfo wxOrderInfo);

    Result endOrder(WxOrderInfo wxOrderInfo);

    Optional<OrderInfo> getById(Long orderId);
}
