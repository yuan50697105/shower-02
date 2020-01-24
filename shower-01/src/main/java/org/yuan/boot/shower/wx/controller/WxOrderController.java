package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.shower.db.pojo.OrderInfoCondition;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.service.WxOrderService;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.pojo.Result;

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

    @GetMapping("data")
    public Result data(OrderInfoCondition condition) {
        return wxOrderService.data(condition);
    }

    @PostMapping(value = "add", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result add(@RequestBody @Validated WxOrderInfo wxOrderInfo, BindingResult result) {
        validate(result);
        return wxOrderService.addOrder(wxOrderInfo);
    }
}