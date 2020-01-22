package org.yuan.boot.shower.admin.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.admin.pojo.DeviceInfoVO;
import org.yuan.boot.shower.admin.service.DeviceInfoService;
import org.yuan.boot.shower.db.pojo.DeviceInfoCondition;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

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

    @GetMapping(value = "data", produces = APPLICATION_JSON_UTF8)
    public Result data(DeviceInfoCondition condition) {
        return deviceInfoService.data(condition);
    }

    @GetMapping(value = "list", produces = APPLICATION_JSON_UTF8)
    public Result list(DeviceInfoCondition condition) {
        return deviceInfoService.list(condition);
    }

    @GetMapping("get")
    public Result get(Long id) {
        return deviceInfoService.get(id);
    }

    @PostMapping("save")
    public Result save(DeviceInfoVO deviceInfoVO, BindingResult result) {
        validate(result);
        return deviceInfoService.save(deviceInfoVO);
    }
}