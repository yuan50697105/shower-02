package com.idea.shower.app.device.controller;

import com.idea.shower.app.device.service.DeviceProcessService;
import com.idea.shower.commons.exception.ResultException;
import com.idea.shower.commons.pojo.DeviceOrderDto;
import com.idea.shower.commons.pojo.Result;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: shower/01
 * @description:
 * @author: yuane
 * @create: 2020/11/17 22:14
 */
@RestController
@RequestMapping("device/process")
public class DeviceProcessController {
    @Autowired
    private DeviceProcessService deviceProcessService;

    /**
     * 订单下单
     */
    @PostMapping("order/add")
    @ResponseBody
    public Result orderAdd(@RequestBody DeviceOrderDto deviceOrderDto) {
        deviceOrderDto = deviceProcessService.addOrder(deviceOrderDto);
        return deviceOrderDto.getResult();
    }

    /**
     * 开门
     */
    @PostMapping("open/door")
    public Result openTheDoor( DeviceOrderDto deviceOrderDto) throws ResultException {
        deviceOrderDto = deviceProcessService.openTheDoor(deviceOrderDto);
        return deviceOrderDto.getResult();
    }

    /**
     * 关门
     */
    @PostMapping("close/door")
    public Result closeTheDoor( DeviceOrderDto deviceOrderDto) throws ResultException {
        deviceOrderDto = deviceProcessService.closeTheDoor(deviceOrderDto);
        return deviceOrderDto.getResult();
    }

    /**
     * 开启淋浴
     */
    @SneakyThrows
    @PostMapping("turn/on/shower")
    public Result turnOnTheShowerValve( DeviceOrderDto deviceOrderDto) {
        deviceOrderDto = deviceProcessService.turnOnTheShowerValve(deviceOrderDto);
        return deviceOrderDto.getResult();
    }

    /**
     * 关闭淋浴
     */
    @SneakyThrows
    @PostMapping("turn/off/shower")
    private Result turnOffTheShowerValve( DeviceOrderDto deviceOrderDto) {
        deviceOrderDto = deviceProcessService.turnOffTheShowerValve(deviceOrderDto);
        return deviceOrderDto.getResult();
    }

    /**
     * 开清洗水阀
     *
     */
    @SneakyThrows
    @PostMapping("open/cleaning/water")
    public Result openTheCleaningWaterValve( DeviceOrderDto deviceOrderDto) {
        deviceOrderDto = deviceProcessService.openTheCleaningWaterValve(deviceOrderDto);
        return deviceOrderDto.getResult();
    }


}