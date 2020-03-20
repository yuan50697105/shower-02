package com.idea.shower.app.wx.mp.service;

import com.idea.shower.app.wx.mp.pojo.WxOrderInfo;
import com.idea.shower.app.commons.db.module.pojo.OrderInfo;
import com.idea.shower.web.webmvc.pojo.Result;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:49
 */
public interface WxOrderService {
    /**
     * 添加订单
     * @param wxOrderInfo
     * @return
     */
    Result addOrder(WxOrderInfo wxOrderInfo);

    /**
     * 结束订单
     * @param wxOrderInfo
     * @return
     */
    Result endOrder(WxOrderInfo wxOrderInfo);

    /**
     * 通过ID获取订单信息
     * @param orderId 订单ID
     * @return 订单信息
     */
    Optional<OrderInfo> getById(Long orderId);
}
