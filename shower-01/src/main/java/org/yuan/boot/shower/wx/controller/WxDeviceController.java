package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.wx.service.WxDeviceService;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 22:55
 */
@SuppressWarnings("deprecation")
@RestController
@RequestMapping("wx/device")
@AllArgsConstructor
public class WxDeviceController extends AbstractResultController {
    private WxDeviceService wxDeviceService;

    @GetMapping(value = "nearList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result nearList(String point) {
        return wxDeviceService.nearList(point);
    }

    @GetMapping(value = "deviceInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result deviceInfo(Long id) {
        return wxDeviceService.getDeviceInfo(id);
    }
}