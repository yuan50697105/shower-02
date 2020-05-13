package com.idea.shower.app.wx.mp.service;

import com.idea.shower.app.db.module.pojo.query.DeviceInfoQuery;
import com.idea.shower.web.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 15:23
 */
public interface WxDeviceInfoService {
    Result deviceInfoList(DeviceInfoQuery deviceInfoQuery);

    Result sendInfo(long l);
}