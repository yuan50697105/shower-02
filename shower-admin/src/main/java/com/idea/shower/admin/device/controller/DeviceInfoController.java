package com.idea.shower.admin.device.controller;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.admin.device.service.DeviceInfoService;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Result<?> add(DeviceInfoVo deviceInfoVo) {
        return deviceInfoService.add(deviceInfoVo);
    }

}