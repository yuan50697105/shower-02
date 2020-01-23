package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.wx.pojo.WxOrderVO;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:00
 */
public interface WxCommonsOrderService {
    Result addOrder(WxOrderVO wxOrderVO);
}
