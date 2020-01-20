package org.yuan.boot.shower.admin.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.admin.service.DeviceInfoService;
import org.yuan.boot.webmvc.controller.AbstractResultController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:15
 */
@RestController
@RequestMapping("device/info")
@AllArgsConstructor
@Log4j2
public class DeviceInfoController extends AbstractResultController {
    private DeviceInfoService deviceInfoService;
}