package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.shower.db.pojo.WxOrderInfoCondition;
import org.yuan.boot.shower.wx.pojo.WxOrderVO;
import org.yuan.boot.shower.wx.service.WxOrderService;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 19:03
 */
@SuppressWarnings("AliDeprecation")
@RestController
@RequestMapping("wx/order")
@AllArgsConstructor
public class WxOrderController extends AbstractResultController {
    private WxOrderService wxOrderService;

    @GetMapping(value = "orderList", produces = MediaType.APPLICATION_PROBLEM_JSON_UTF8_VALUE)
    public Result orderList(WxOrderInfoCondition wxOrderInfoCondition) {
        return wxOrderService.getOrderList(wxOrderInfoCondition);
    }

    @PostMapping(value = "add", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result add(@RequestBody @Validated WxOrderVO wxOrderVO) {
        return wxOrderService.addOrder(wxOrderVO);
    }

    @PostMapping(value = "pay", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result pay(@RequestBody Long orderId) {
        return wxOrderService.pay(orderId);
    }
}