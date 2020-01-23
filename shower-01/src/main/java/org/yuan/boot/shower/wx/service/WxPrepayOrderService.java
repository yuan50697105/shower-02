package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:15
 */
public interface WxPrepayOrderService {
    Result addOrder(WxOrderInfo wxOrderInfo);
}
