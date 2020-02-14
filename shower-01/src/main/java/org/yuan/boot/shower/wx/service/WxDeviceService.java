package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.db.pojo.DeviceInfo;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:47
 */
public interface WxDeviceService {
    /**
     * 通过ID获取设备信息
     *
     * @param deviceId 设备ID
     * @return 设备信息
     */
    Optional<DeviceInfo> getById(Long deviceId);
}
