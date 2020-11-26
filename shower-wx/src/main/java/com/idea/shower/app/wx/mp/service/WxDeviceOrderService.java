package com.idea.shower.app.wx.mp.service;

import com.idea.shower.commons.pojo.dto.DeviceOrderDto;
import com.idea.shower.commons.pojo.dto.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-26 21:16
 */
public interface WxDeviceOrderService {
    Result addOrder(DeviceOrderDto deviceOrderDto);
}