package com.idea.shower.app.device.service.impl;

import com.alibaba.fastjson.JSON;
import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.idea.shower.commons.pojo.dto.DeviceOrderDto;
import com.idea.shower.app.device.properties.DeviceListenerProperties;
import com.idea.shower.app.device.service.DeviceControlService;
import com.idea.shower.app.device.service.DeviceProcessService;
import com.idea.shower.app.device.service.DeviceRequestService;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import com.idea.shower.commons.exception.ResultException;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class DeviceProcessServiceImpl implements DeviceProcessService {
    @Autowired
    private DeviceInfoDao deviceInfoDao;
    @Autowired
    private DeviceListenerProperties properties;
    @Autowired
    private DeviceControlService deviceControlService;
    @Autowired
    private DeviceRequestService deviceRequestService;

    @Override
    @SneakyThrows
    public DeviceOrderDto addOrder(DeviceOrderDto deviceOrderDto) {
        String s = "/a1PPvXQ57zD/work_2/user/control    ";
        String work_2 = "work_2";
        String a1PPvXQ57zD = "a1PPvXQ57zD";
        String productKey = properties.getProductKey();
//        sshCommandSender.send(s, a1PPvXQ57zD, work_2, "{71,1234}}");
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            String deviceName = deviceInfo.getDeviceName();
            PubResponse pubResponse = deviceControlService.workStart(deviceInfo.getProductKey(), deviceInfo.getCode(), deviceOrderDto.getOrderNo());
            log.info("pubResponse=" + JSON.toJSONString(pubResponse));
        } else {
            throw new ResultException(ResultUtils.wxDeviceNotFoundError());
        }
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
        return deviceOrderDto;
    }

    @Override
    public DeviceOrderDto openTheDoor(DeviceOrderDto deviceOrderDto) throws ResultException {
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            String deviceName = deviceInfo.getDeviceName();
            PubResponse pubResponse = deviceRequestService.openTheDoor(deviceInfo.getProductKey(), deviceInfo.getCode());
            deviceOrderDto.setResult(ResultUtils.ok("成功", pubResponse));
            log.info("pubResponse=" + JSON.toJSONString(pubResponse));
        } else {
            throw new ResultException(ResultUtils.wxDeviceNotFoundError());
        }

        return deviceOrderDto;
    }

    @Override
    public DeviceOrderDto closeTheDoor(DeviceOrderDto deviceOrderDto) throws ResultException {
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            String deviceName = deviceInfo.getDeviceName();
            PubResponse pubResponse = deviceRequestService.closeTheDoor(deviceInfo.getProductKey(), deviceInfo.getCode());
            deviceOrderDto.setResult(ResultUtils.ok("成功", pubResponse));
            log.info("pubResponse=" + JSON.toJSONString(pubResponse));
        } else {
            throw new ResultException(ResultUtils.wxDeviceNotFoundError());
        }

        return deviceOrderDto;
    }

    @Override
    public DeviceOrderDto turnOnTheShowerValve(DeviceOrderDto deviceOrderDto) throws ResultException {
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            String deviceName = deviceInfo.getDeviceName();
            PubResponse pubResponse = deviceRequestService.turnOnTheShowerValve(deviceInfo.getProductKey(), deviceInfo.getCode());
            deviceOrderDto.setResult(ResultUtils.ok("成功", pubResponse));
            log.info("pubResponse=" + JSON.toJSONString(pubResponse));
        } else {
            throw new ResultException(ResultUtils.wxDeviceNotFoundError());
        }

        return deviceOrderDto;
    }

    @Override
    public DeviceOrderDto turnOffTheShowerValve(DeviceOrderDto deviceOrderDto) throws ResultException {
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            String deviceName = deviceInfo.getDeviceName();
            PubResponse pubResponse = deviceRequestService.turnOffTheShowerValve(deviceInfo.getProductKey(), deviceInfo.getCode());
            deviceOrderDto.setResult(ResultUtils.ok("成功", pubResponse));
            log.info("pubResponse=" + JSON.toJSONString(pubResponse));
        } else {
            throw new ResultException(ResultUtils.wxDeviceNotFoundError());
        }

        return deviceOrderDto;
    }

    public DeviceOrderDto openTheCleaningWaterValve(DeviceOrderDto deviceOrderDto) throws ResultException {
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            String deviceName = deviceInfo.getDeviceName();
            PubResponse pubResponse = deviceRequestService.openTheCleaningWaterValve(deviceInfo.getProductKey(), deviceInfo.getCode());
            deviceOrderDto.setResult(ResultUtils.ok("成功", pubResponse));
            log.info("pubResponse=" + JSON.toJSONString(pubResponse));
        } else {
            throw new ResultException(ResultUtils.wxDeviceNotFoundError());
        }
        return deviceOrderDto;
    }
}