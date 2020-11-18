package com.idea.shower.app.device.controller;

import com.idea.shower.app.device.pojo.dto.DeviceAddOrderDto;
import com.idea.shower.app.device.service.DeviceProcessService;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
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
    private DeviceProcessService deviceProcessService;

    @GetMapping("get")
    public Result test() {
        String s = "/a1PPvXQ57zD/work_2/user/request";
        deviceProcessService.addOrder(new DeviceAddOrderDto());
        return ResultUtils.ok(s);
    }
}