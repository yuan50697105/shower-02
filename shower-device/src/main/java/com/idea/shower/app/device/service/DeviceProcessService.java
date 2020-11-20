package com.idea.shower.app.device.service;

import com.idea.shower.app.device.pojo.dto.DeviceAddOrderDto;
import com.idea.shower.web.webmvc.exception.ResultException;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-20 21:58
 */
public interface DeviceProcessService {
    DeviceAddOrderDto addOrder(DeviceAddOrderDto deviceAddOrderDto);

    DeviceAddOrderDto openTheDoor(DeviceAddOrderDto deviceAddOrderDto) throws ResultException;

    DeviceAddOrderDto closeTheDoor(DeviceAddOrderDto deviceAddOrderDto) throws ResultException;

    DeviceAddOrderDto turnOnTheShowerValve(DeviceAddOrderDto deviceAddOrderDto) throws ResultException;
}
