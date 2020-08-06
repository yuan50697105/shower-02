package com.idea.shower.admin.device.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 17:01
 */
public interface DeviceInfoService {
    /**
     * @param deviceInfoVo
     * @return
     */
    Result<?> add(DeviceInfoVo deviceInfoVo);
}
