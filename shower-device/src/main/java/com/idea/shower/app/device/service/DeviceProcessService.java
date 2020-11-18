package com.idea.shower.app.device.service;

import com.idea.shower.app.device.pojo.dto.DeviceAddOrderDto;
import com.idea.shower.app.device.sender.SSHCommandSender;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        String s = "/a1PPvXQ57zD/work_2/user/request";
        String work_2 = "work_2";
        String a1PPvXQ57zD = "a1PPvXQ57zD";
        sshCommandSender.send(s, a1PPvXQ57zD, work_2, "test");
//        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceAddOrderDto.getDeviceId());
//        if (deviceInfoOptional.isPresent()) {
//            DeviceInfo deviceInfo = deviceInfoOptional.get();
//            if (deviceInfo.getRunStatus().equals(DeviceInfoConstants.DeviceRunningStatus.AVALI)) {
//                可以下单
//                String deviceName = deviceInfo.getDeviceName();

//            } else {
//                deviceAddOrderDto.setResult(ResultUtils.wxDeviceUsingError());
//                return deviceAddOrderDto;
//            }
//        }
        return deviceAddOrderDto;
    }
}