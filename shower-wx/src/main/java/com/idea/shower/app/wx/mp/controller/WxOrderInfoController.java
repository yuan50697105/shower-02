package com.idea.shower.app.wx.mp.controller;

import cn.hutool.core.io.IoUtil;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.app.wx.mp.pojo.WxOrderInfo;
import com.idea.shower.app.wx.mp.pojo.WxPayOrderInfo;
import com.idea.shower.app.wx.mp.pojo.WxReturnInfo;
import com.idea.shower.app.wx.mp.service.WxOrderInfoService;
import com.idea.shower.web.webmvc.controller.ResultController;
import com.idea.shower.web.webmvc.pojo.Result;
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
public class WxOrderInfoController extends ResultController {
    private WxOrderInfoService wxOrderInfoService;

    @PostMapping("data")
    public Result data(@RequestBody OrderInfoQuery condition) {
        return wxOrderInfoService.data(condition);
    }

    @GetMapping("item")
    public Result orderItem(Long orderId) {
        return wxOrderInfoService.getOrderItem(orderId);
    }


    @PostMapping("add")
    public Result addOrder(@RequestBody WxOrderInfo wxOrderInfo) {
        return wxOrderInfoService.addOrder(wxOrderInfo);
    }

    @PostMapping("end")
    public Result endOrder(@RequestBody WxOrderInfo wxOrderInfo) {
        return wxOrderInfoService.endOrder(wxOrderInfo);
    }

    @PostMapping("pay")
    public Result payOrder(@RequestBody WxPayOrderInfo wxPayOrderInfo) {
        return wxOrderInfoService.payOrder(wxPayOrderInfo);
    }

    @PostMapping("notify")
    @SneakyThrows
    public WxReturnInfo notify(HttpServletRequest request) {
        ServletInputStream inputStream = request.getInputStream();
        String xml = IoUtil.read(inputStream, StandardCharsets.UTF_8);
        return wxOrderInfoService.notify(xml);
    }
}