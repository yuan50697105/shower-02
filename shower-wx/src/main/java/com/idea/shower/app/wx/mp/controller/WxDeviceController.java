package com.idea.shower.app.wx.mp.controller;

import com.idea.shower.app.wx.mp.service.WxDeviceInfoService;
import com.idea.shower.web.webmvc.controller.ResultController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 15:24
 */
@RestController
@RequestMapping("wx/device")
public class WxDeviceController extends ResultController {
    private WxDeviceInfoService wxDeviceService;
}