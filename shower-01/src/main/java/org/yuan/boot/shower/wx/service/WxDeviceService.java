package org.yuan.boot.shower.wx.service;

import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 22:56
 */
public interface WxDeviceService {
    Result nearList(String point);

    Result getDeviceInfo(String id);
}
