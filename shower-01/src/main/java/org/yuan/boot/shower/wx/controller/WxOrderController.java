package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.wx.service.WxOrderService;
import org.yuan.boot.webmvc.controller.ResultController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:07
 */
@RestController
@RequestMapping("wx/order")
@AllArgsConstructor
@Log4j2
public class WxOrderController extends ResultController {
    private WxOrderService wxOrderService;
}