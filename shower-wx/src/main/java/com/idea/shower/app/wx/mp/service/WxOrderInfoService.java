package com.idea.shower.app.wx.mp.service;


import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.app.wx.mp.pojo.WxOrderInfo;
import com.idea.shower.app.wx.mp.pojo.WxPayOrderInfo;
import com.idea.shower.app.wx.mp.pojo.WxReturnInfo;
import com.idea.shower.web.webmvc.pojo.Result;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 15:20
 */
public interface WxOrderInfoService {
    /**
     * 添加订单
     *
     * @param wxOrderInfo 订单信息封装
     * @return 处理结果
     */
    Result addOrder(WxOrderInfo wxOrderInfo);

    /**
     * 结束订单
     *
     * @param wxOrderInfo 订单信息封装
     * @return 处理结果
     */
    Result endOrder(WxOrderInfo wxOrderInfo);

    /**
     * 微信统一下单
     *
     * @param wxPayOrderInfo 支付信息封装
     * @return 处理结果
     */
    Result payOrder(WxPayOrderInfo wxPayOrderInfo);

    /**
     * 回调
     *
     * @param xml 回调信息
     * @return 处理结果
     */
    WxReturnInfo notify(String xml);

    /**
     * 订单信息
     *
     * @param condition 条件
     * @return 订单信息
     */
    Result data(OrderInfoQuery condition);

    /**
     * 订单详情
     *
     * @param orderId 订单ID
     * @return 订单详情
     */
    Result getOrderItem(Long orderId);
}
