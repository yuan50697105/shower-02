package com.idea.shower.app.device.service;

import com.idea.shower.app.device.pojo.dto.DeviceAddOrderDto;
import com.idea.shower.app.device.sender.SSHCommandSender;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-17 22:44
 */
@Service
public class DeviceProcessService {
    @Autowired
    private SSHCommandSender sshCommandSender;
    @Autowired
    private DeviceInfoDao deviceInfoDao;

    public DeviceAddOrderDto addOrder(DeviceAddOrderDto deviceAddOrderDto) {
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceAddOrderDto.getDeviceId());
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
        }
    }
}