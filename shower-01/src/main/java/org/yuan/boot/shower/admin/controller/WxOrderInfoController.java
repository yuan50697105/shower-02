package org.yuan.boot.shower.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.admin.service.WxOrderInfoService;
import org.yuan.boot.shower.db.pojo.WxOrderInfoCondition;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

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

    @GetMapping(value = "data",produces = APPLICATION_JSON_UTF8)
    public Result data(WxOrderInfoCondition condition) {
        return wxOrderInfoService.data(condition);
    }
}