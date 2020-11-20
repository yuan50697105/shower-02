package com.idea.shower.app.device.controller;

import com.idea.shower.app.device.pojo.dto.DeviceAddOrderDto;
import com.idea.shower.app.device.service.impl.DeviceProcessServiceImpl;
import com.idea.shower.web.webmvc.exception.ResultException;
import com.idea.shower.web.webmvc.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-17 22:14
 */
@RestController
@RequestMapping("device/process")
public class DeviceProcessController {
    @Autowired
    private DeviceProcessServiceImpl deviceProcessService;

    @GetMapping("order/add")
    public Result orderAdd(DeviceAddOrderDto deviceAddOrderDto) {
        deviceAddOrderDto = deviceProcessService.addOrder(deviceAddOrderDto);
        return deviceAddOrderDto.getResult();
    }

    @GetMapping("open/door")
    public Result openTheDoor(DeviceAddOrderDto deviceAddOrderDto) throws ResultException {
        deviceAddOrderDto = deviceProcessService.openTheDoor(deviceAddOrderDto);
        return deviceAddOrderDto.getResult();
    }

    @GetMapping("close/door")
    public Result closeTheDoor(DeviceAddOrderDto deviceAddOrderDto) throws ResultException {
        deviceAddOrderDto = deviceProcessService.closeTheDoor(deviceAddOrderDto);
        return deviceAddOrderDto.getResult();
    }

    @GetMapping("turn/on/shower")
    public Result turnOnTheShowerValve(DeviceAddOrderDto deviceAddOrderDto) {
        deviceAddOrderDto = deviceProcessService.turnOnTheShowerValve(deviceAddOrderDto);
        return deviceAddOrderDto.getResult();
    }
}