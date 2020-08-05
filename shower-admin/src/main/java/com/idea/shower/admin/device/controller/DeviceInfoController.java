package com.idea.shower.admin.device.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.admin.device.service.DeviceInfoService;
import com.idea.shower.app.db.module.pojo.query.DeviceInfoQuery;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 16:56
 */
@RestController
@RequestMapping("/device/info")
@Data
public class DeviceInfoController {
    private DeviceInfoService deviceInfoService;

    @PostMapping({"", "/save"})
    public Result<?> add(@RequestBody DeviceInfoVo deviceInfoVo) {
        return deviceInfoService.add(deviceInfoVo);
    }

    @PutMapping({"", "/modify"})
    public Result<?> modify(@RequestBody DeviceInfoVo deviceInfoVo) {
        return deviceInfoService.modify(deviceInfoVo);
    }

    @DeleteMapping({"", "/delete"})
    public Result<?> delete(Long id) {
        return deviceInfoService.delete(id);
    }

    @GetMapping({"/{id}", "/get/{id}"})
    public Result<?> get(@PathVariable Long id) {
        return ResultInfo.success(deviceInfoService.getById(id));
    }

    @GetMapping({"/data"})
    public Result<?> data(DeviceInfoQuery query) {
        return deviceInfoService.data(query);
    }

    @GetMapping("list")
    public Result<?> list(DeviceInfoQuery query) {
        return deviceInfoService.list(query);
    }


}