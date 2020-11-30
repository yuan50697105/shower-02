package com.idea.shower.app.device.service.sub.impl;

import com.alibaba.fastjson.JSON;
import com.aliyuncs.iot.model.v20180120.PubResponse;
import com.idea.shower.app.device.properties.DeviceListenerProperties;
import com.idea.shower.app.device.service.control.DeviceProcessService;
import com.idea.shower.app.device.service.sub.DeviceControlService;
import com.idea.shower.app.device.service.sub.DeviceRequestService;
import com.idea.shower.commons.exception.ResultException;
import com.idea.shower.commons.pojo.DeviceOrderDto;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
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
        log.info("DeviceProcessServiceImpl.addOrder");
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            PubResponse pubResponse = deviceControlService.workStart(deviceInfo.getProductKey(), deviceInfo.getCode(), deviceOrderDto.getOrderNo());
            log.info("pubResponse=" + JSON.toJSONString(pubResponse));
            deviceOrderDto.setResult(ResultUtils.data(pubResponse));
        } else {
            throw new ResultException(ResultUtils.wxDeviceNotFoundError());
        }
        return deviceOrderDto;
    }

    @Override
    public DeviceOrderDto endOrder(DeviceOrderDto deviceOrderDto) throws ResultException {
        log.info("DeviceProcessServiceImpl.endOrder");
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            PubResponse pubResponse = deviceControlService.workEnd(deviceInfo.getProductKey(), deviceInfo.getCode(), deviceOrderDto.getOrderNo());
            log.info("pubResponse=" + JSON.toJSONString(pubResponse));
            deviceOrderDto.setResult(ResultUtils.data(pubResponse));
        } else {
            throw new ResultException(ResultUtils.wxDeviceNotFoundError());
        }
        return deviceOrderDto;
    }

    @Override
    public DeviceOrderDto openTheDoor(DeviceOrderDto deviceOrderDto) throws ResultException {
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
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

    @Override
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

    @Override
    public DeviceOrderDto closeTheCleaningWaterValve(DeviceOrderDto deviceOrderDto) throws ResultException {
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            String deviceName = deviceInfo.getDeviceName();
            PubResponse pubResponse = deviceRequestService.closeTheCleaningWaterValve(deviceInfo.getProductKey(), deviceInfo.getCode());
            deviceOrderDto.setResult(ResultUtils.ok("成功", pubResponse));
            log.info("pubResponse=" + JSON.toJSONString(pubResponse));
        } else {
            throw new ResultException(ResultUtils.wxDeviceNotFoundError());
        }
        return deviceOrderDto;
    }

    @Override
    public DeviceOrderDto resetDevice(DeviceOrderDto deviceOrderDto) throws ResultException {
        Long deviceId = deviceOrderDto.getDeviceId();
        Optional<DeviceInfo> deviceInfoOptional = deviceInfoDao.getByIdOpt(deviceId);
        if (deviceInfoOptional.isPresent()) {
            DeviceInfo deviceInfo = deviceInfoOptional.get();
            String deviceName = deviceInfo.getDeviceName();
            PubResponse pubResponse = deviceRequestService.resetDevice(deviceInfo.getProductKey(), deviceInfo.getCode());
            deviceOrderDto.setResult(ResultUtils.ok("成功", pubResponse));
            log.info("pubResponse=" + JSON.toJSONString(pubResponse));
        } else {
            throw new ResultException(ResultUtils.wxDeviceNotFoundError());
        }
        return deviceOrderDto;
    }
}