package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.db.pojo.DeviceInfoCondition;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:22
 */
public interface WxDeviceService {
    Result data(DeviceInfoCondition condition);

    Result get(Long id);
}
