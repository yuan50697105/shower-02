package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.wx.pojo.WxOrderVO;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 11:53
 */
public interface WxPrepayOrderService {
    Result addOrder(WxOrderVO wxOrderVO);
}