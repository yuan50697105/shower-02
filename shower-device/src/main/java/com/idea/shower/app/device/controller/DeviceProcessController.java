package com.idea.shower.app.device.controller;

import com.idea.shower.app.device.service.DeviceProcessService;
import org.springframework.beans.factory.annotation.Autowired;
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
}