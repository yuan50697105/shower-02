package com.idea.shower.app.wx.mp.controller;

import cn.hutool.core.io.IoUtil;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.app.wx.mp.pojo.*;
import com.idea.shower.app.wx.mp.service.WxOrderInfoService;
import com.idea.shower.web.webmvc.controller.ResultController;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 15:19
 */
@RestController
@RequestMapping("wx/order")
@AllArgsConstructor
public class WxOrderInfoController extends ResultController {
    private final WxOrderInfoService wxOrderInfoService;

    @PostMapping("data")
    public Result data(@RequestBody(required = false) OrderInfoQuery condition) {
        return wxOrderInfoService.selectPage(condition);
    }

    @GetMapping("item")
    public Result orderItem(String orderNo) {
        return wxOrderInfoService.getOrderItemByOrderNo(orderNo);
    }


    @PostMapping("add")
    public Result addOrder(@RequestBody WxAddOrderRequest wxAddOrderRequest) {
        return wxOrderInfoService.addOrder(wxAddOrderRequest);
    }

    @PostMapping("open")
    public Result open(@RequestBody WxUseOrderRequest request){
        return wxOrderInfoService.openRoom(request);
    }

    @PostMapping("end")
    public Result endOrder(@RequestBody WxUseOrderRequest wxEndOrderRequest) {
        return wxOrderInfoService.endOrder(wxEndOrderRequest);
    }

    @PostMapping("pay")
    public Result payOrder(@RequestBody WxPayOrderInfo wxPayOrderInfo) {
        try {
            return wxOrderInfoService.payOrder(wxPayOrderInfo);
        } catch (WxPayException e) {
            e.printStackTrace();
            return ResultUtils.wxError(e.getMessage());
        }
    }

    @RequestMapping("notify")
    @SneakyThrows
    public WxReturnInfo notify(HttpServletRequest request) {
        ServletInputStream inputStream = request.getInputStream();
        String xml = IoUtil.read(inputStream, StandardCharsets.UTF_8);
        return wxOrderInfoService.notify(xml);
    }

    @PostMapping("cancel")
    public Result cancel(@RequestBody String orderNo) {
        return wxOrderInfoService.cancelOrderByOrderNo(orderNo);
    }
}