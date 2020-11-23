package com.idea.shower.app.device.service.impl;

import com.idea.shower.app.device.service.DeviceReceiveService;
import com.idea.shower.db.mybaits.module.mapper.DeviceInfoMapper;
import com.idea.shower.db.mybaits.module.mapper.DeviceRunningLogMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-23 21:26
 */
@Service
@Slf4j
public class DeviceReceiveServiceImpl implements DeviceReceiveService {
    @Autowired
    private DeviceRunningLogMapper deviceRunningLogMapper;
    @Autowired
    private DeviceInfoMapper deviceInfoMapper;

    @Override

    public void receiveData(String productKey, String deviceName, String operating, String messageId, String content) {

    }

    @Override
    public void work15Sec(String productKey, String deviceName, String messageId, String content) {

    }

    @Override
    public void timing5Min(String productKey, String deviceName, String messageId, String content) {

    }

    @Override
    public void response(String productKey, String deviceName, String messageId, String content) {

    }

}