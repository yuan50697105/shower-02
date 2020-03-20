package com.idea.shower.app.wx.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.idea.shower.app.commons.web.controller.BaseController;
import com.idea.shower.app.wx.service.WxDeviceService;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:47
 */
@RestController
@RequestMapping("wx/device")
@AllArgsConstructor
public class WxDeviceController extends BaseController {
    private WxDeviceService wxDeviceService;
}