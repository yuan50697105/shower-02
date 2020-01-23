package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.wx.service.WxDeviceService;
import org.yuan.boot.webmvc.controller.ResultController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:21
 */
@RestController
@RequestMapping("wx/device")
@AllArgsConstructor
@Log4j2
public class WxDeviceController extends ResultController {
    private WxDeviceService wxDeviceService;
}