package org.yuan.boot.webmvc.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.webmvc.app.pojo.vo.OrderInfoVo;
import org.yuan.boot.webmvc.app.service.OrderInfoService;
import org.yuan.boot.webmvc.pojo.Result;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 21:55
 */
@RestController
@RequestMapping("order/info")
@AllArgsConstructor
public class OrderInfoController extends ResultController {
    private OrderInfoService orderInfoService;

    @PostMapping("add")
    public Result add(OrderInfoVo orderInfoVo, BindingResult result) {
        validate(result);
        return orderInfoService.add(orderInfoVo);
    }

    @PostMapping("prepay")
    public Result prepay(OrderInfoVo orderInfoVo, BindingResult result) {
        validate(result);
        return orderInfoService.prepay(orderInfoVo);
    }

//    @PostMapping()
    public String notify(HttpServletRequest request) {

        return "SUCCESS";

    }
    
}