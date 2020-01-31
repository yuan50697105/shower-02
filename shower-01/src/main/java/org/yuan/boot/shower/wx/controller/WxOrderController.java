package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.commons.controller.BaseController;
import org.yuan.boot.shower.wx.service.WxOrderService;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:48
 */
@RestController
@RequestMapping("wx/order")
@AllArgsConstructor
public class WxOrderController extends BaseController {
    private WxOrderService wxOrderService;
}