package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.shower.db.dao.DeviceInfoDao;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.wx.service.WxDeviceService;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:48
 */
@Service
@AllArgsConstructor
public class WxDeviceServiceImpl implements WxDeviceService {
    private DeviceInfoDao deviceInfoDao;

    @Override
    public Optional<DeviceInfo> getById(Long deviceId) {
        return deviceInfoDao.getById(deviceId);
    }
}