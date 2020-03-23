package com.idea.shower.app.wx.mp.service;

import com.idea.shower.web.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description: 微信小程序设备服务
 * @author: yuane
 * @create: 2020-03-22 10:59
 */
public interface WxAreaInfoService {

    Result areaInfoList();

    Result areaBuildingList(Long areaId);
}
