package com.idea.shower.app.wx.mp.controller;

import com.idea.shower.app.db.module.pojo.query.DeviceInfoQuery;
import com.idea.shower.app.wx.mp.service.WxDeviceInfoService;
import com.idea.shower.web.webmvc.controller.ResultController;
import com.idea.shower.web.webmvc.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 15:24
 */
@RestController
@RequestMapping("wx/device")
@AllArgsConstructor
public class WxDeviceController extends ResultController {
    private WxDeviceInfoService wxDeviceService;

    /**
    *获取设备列表
    *@author finch
    *@date: 2020/3/24
    */
    @PostMapping ("deviceInfoList")
    public Result deviceInfoList(@RequestBody DeviceInfoQuery deviceInfoQuery) {
        return wxDeviceService.deviceInfoList(deviceInfoQuery);
    }
}