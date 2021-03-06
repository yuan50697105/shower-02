package com.idea.shower.app.device.service.control;

import com.idea.shower.commons.pojo.DeviceOrderDto;
import com.idea.shower.commons.exception.ResultException;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-20 21:58
 */
public interface DeviceProcessService {
    /**
     * 添加订单
     * @param deviceOrderDto
     * @return
     */
    DeviceOrderDto addOrder(DeviceOrderDto deviceOrderDto);

    DeviceOrderDto endOrder(DeviceOrderDto deviceOrderDto) throws ResultException;

    /**
     * 开门
     * @param deviceOrderDto
     * @return
     * @throws ResultException
     */
    DeviceOrderDto openTheDoor(DeviceOrderDto deviceOrderDto) throws ResultException;

    DeviceOrderDto closeTheDoor(DeviceOrderDto deviceOrderDto) throws ResultException;

    DeviceOrderDto turnOnTheShowerValve(DeviceOrderDto deviceOrderDto) throws ResultException;

    DeviceOrderDto turnOffTheShowerValve(DeviceOrderDto deviceOrderDto) throws ResultException;

    DeviceOrderDto openTheCleaningWaterValve(DeviceOrderDto deviceOrderDto) throws ResultException;

    DeviceOrderDto resetDevice(DeviceOrderDto deviceOrderDto) throws ResultException;
}
