package com.idea.shower.app.device.service;

import com.idea.shower.app.device.pojo.dto.DeviceAddOrderDto;
import com.idea.shower.app.device.sender.SSHCommandSender;
import com.idea.shower.db.mybaits.module.constants.DeviceInfoConstants;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.SneakyThrows;
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

    @SneakyThrows
    public DeviceAddOrderDto addOrder(DeviceAddOrderDto deviceAddOrderDto) {
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceAddOrderDto.getDeviceId());
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            if (deviceInfo.getRunStatus().equals(DeviceInfoConstants.DeviceRunningStatus.AVALI)) {
//                可以下单
                String deviceName = deviceInfo.getDeviceName();
                sshCommandSender.send(deviceName,"");
            } else {
                deviceAddOrderDto.setResult(ResultUtils.wxDeviceUsingError());
                return deviceAddOrderDto;
            }
        }
        return deviceAddOrderDto;
    }
}