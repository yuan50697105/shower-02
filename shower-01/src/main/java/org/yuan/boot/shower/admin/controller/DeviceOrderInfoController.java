package org.yuan.boot.shower.admin.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.admin.service.DeviceOrderService;
import org.yuan.boot.shower.db.pojo.DeviceOrderInfoCondition;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:17
 */
@RestController
@RequestMapping("device/order")
@AllArgsConstructor
@Log4j2
public class DeviceOrderInfoController extends AbstractResultController {
    private DeviceOrderService deviceOrderService;

    @GetMapping(value = "data", produces = APPLICATION_JSON_UTF8)
    public Result data(DeviceOrderInfoCondition condition) {
        return deviceOrderService.data(condition);
    }
}