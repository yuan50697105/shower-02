package com.idea.shower.app.device.controller;

import com.idea.shower.commons.pojo.dto.DeviceOrderDto;
import com.idea.shower.app.device.service.impl.DeviceProcessServiceImpl;
import com.idea.shower.web.webmvc.exception.ResultException;
import com.idea.shower.web.webmvc.pojo.Result;
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
    private DeviceProcessServiceImpl deviceProcessService;

    /**
     * 订单下单
     */
    @GetMapping("order/add")
    public Result orderAdd(@RequestBody DeviceOrderDto deviceOrderDto) {
        deviceOrderDto = deviceProcessService.addOrder(deviceOrderDto);
        return deviceOrderDto.getResult();
    }

    /**
     * 开门
     */
    @PostMapping("open/door")
    public Result openTheDoor(@RequestBody DeviceOrderDto deviceOrderDto) throws ResultException {
        deviceOrderDto = deviceProcessService.openTheDoor(deviceOrderDto);
        return deviceOrderDto.getResult();
    }

    /**
     * 关门
     */
    @PostMapping("close/door")
    public Result closeTheDoor(@RequestBody DeviceOrderDto deviceOrderDto) throws ResultException {
        deviceOrderDto = deviceProcessService.closeTheDoor(deviceOrderDto);
        return deviceOrderDto.getResult();
    }

    /**
     * 开启淋浴
     */
    @SneakyThrows
    @PostMapping("turn/on/shower")
    public Result turnOnTheShowerValve(@RequestBody DeviceOrderDto deviceOrderDto) {
        deviceOrderDto = deviceProcessService.turnOnTheShowerValve(deviceOrderDto);
        return deviceOrderDto.getResult();
    }

    /**
     * 关闭淋浴
     */
    @SneakyThrows
    @PostMapping("turn/off/shower")
    private Result turnOffTheShowerValve(@RequestBody DeviceOrderDto deviceOrderDto) {
        deviceOrderDto = deviceProcessService.turnOffTheShowerValve(deviceOrderDto);
        return deviceOrderDto.getResult();
    }

    /**
     * 开清洗水阀
     *
     */
    @SneakyThrows
    @PostMapping("open/cleaning/water")
    public Result openTheCleaningWaterValve(@RequestBody DeviceOrderDto deviceOrderDto) {
        deviceOrderDto = deviceProcessService.openTheCleaningWaterValve(deviceOrderDto);
        return deviceOrderDto.getResult();
    }


}