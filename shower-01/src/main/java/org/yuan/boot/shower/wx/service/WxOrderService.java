package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.db.pojo.WxOrderInfoCondition;
import org.yuan.boot.shower.wx.pojo.WxOrderVO;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:44
 */
public interface WxOrderService {
    Result addOrder(WxOrderVO wxOrderVO);

    Result getOrderList(WxOrderInfoCondition wxOrderInfoCondition);

    Result pay(Long orderId);
}