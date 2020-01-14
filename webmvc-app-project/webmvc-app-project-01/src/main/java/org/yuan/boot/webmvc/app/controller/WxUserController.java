package org.yuan.boot.webmvc.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.pojo.vo.WxUserOrderVo;
import org.yuan.boot.webmvc.app.service.WxUserService;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 21:59
 */
@RestController
@RequestMapping("wx/user")
@AllArgsConstructor
public class WxUserController extends ResultController {
    private WxUserService wxUserService;

    @GetMapping("info")
    public Result info(String openId) {
        return wxUserService.getInfoByOpenId(openId);
    }

    @GetMapping("info/order")
    public Result orderInfo(String openId) {
        return wxUserService.getOrderInfoByOpenId(openId);
    }

    @PostMapping("order/add")
    public Result addOrder(WxUserOrderVo wxUserOrderVo) {
        return wxUserService.addOrder(wxUserOrderVo);
    }

    // TODO: 2020/1/14 微信预支付
    // TODO: 2020/1/14 微信回调
    // TODO: 2020/1/14 微信结束使用

}