package com.idea.shower.shower.app.wx.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.idea.shower.shower.app.commons.db.module.dao.DeviceInfoDao;
import com.idea.shower.shower.app.commons.db.module.pojo.DeviceInfo;
import com.idea.shower.shower.app.wx.service.WxDeviceService;

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