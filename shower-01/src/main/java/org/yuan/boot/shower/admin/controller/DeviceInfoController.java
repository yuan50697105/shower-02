package org.yuan.boot.shower.admin.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.shower.admin.pojo.DeviceInfoVO;
import org.yuan.boot.shower.admin.service.DeviceInfoService;
import org.yuan.boot.shower.db.pojo.DeviceInfoCondition;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

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

    @GetMapping(value = "get", produces = APPLICATION_JSON_UTF8)
    public Result get(Long id) {
        return deviceInfoService.get(id);
    }

    @PostMapping(value = "save", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result save(@RequestBody @Validated(DeviceInfoVO.Save.class) DeviceInfoVO deviceInfoVO, BindingResult result) {
        validate(result);
        return deviceInfoService.save(deviceInfoVO);
    }

    @PostMapping(value = "update", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result update(@RequestBody @Validated(DeviceInfoVO.Update.class) DeviceInfoVO deviceInfoVO, BindingResult result) {
        validate(result);
        return deviceInfoService.update(deviceInfoVO);
    }


    @GetMapping(value = "delete", params = "id", produces = APPLICATION_JSON_UTF8)
    public Result delete(Long id) {
        return deviceInfoService.delete(id);
    }

    @GetMapping(value = "delete", params = "ids", produces = APPLICATION_JSON_UTF8)
    public Result delete(List<Long> ids) {
        return deviceInfoService.delete(ids);
    }
}