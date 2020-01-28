package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import oracle.ucp.proxy.annotation.Post;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.shower.db.pojo.OrderInfoCondition;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.service.WxOrderService;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.pojo.Result;

import javax.servlet.http.HttpServletRequest;

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
@Validated
public class WxOrderController extends ResultController {
    private WxOrderService wxOrderService;

    /**
     * 查询订单
     */
    @GetMapping("data")
    public Result data(OrderInfoCondition condition) {
        return wxOrderService.data(condition);
    }

    /**
     * 添加订单
     */
    @PostMapping(value = "add", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result add(@RequestBody @Validated WxOrderInfo wxOrderInfo, BindingResult result) {
        validate(result);
        return wxOrderService.addOrder(wxOrderInfo);
    }

//    @PostMapping("prepay")
//    public Result prepay(Long orderId) {
//        return wxOrderService.prepay(orderId);
//    }

    @PostMapping(value = "pay",produces = APPLICATION_JSON_UTF8)
    public Result pay(Long orderId) {
        return wxOrderService.pay(orderId);
    }

    public Result payNotify(HttpServletRequest request) {
        return wxOrderService.payNotify(request);
    }
}