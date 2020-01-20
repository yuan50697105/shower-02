package org.yuan.boot.shower.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.admin.service.WxOrderInfoService;
import org.yuan.boot.webmvc.controller.AbstractResultController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:20
 */
@RestController
@RequestMapping("wx/order")
public class WxOrderInfoController extends AbstractResultController {
    private WxOrderInfoService wxOrderInfoService;
}