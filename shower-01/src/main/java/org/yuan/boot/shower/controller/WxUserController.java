package org.yuan.boot.shower.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.pojo.vo.WxUserOrderVo;
import org.yuan.boot.shower.service.WxUserService;
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

    @RequestMapping("order/pay")
    public Result payOrder(WxUserOrderVo orderVo) {
        return wxUserService.payOrder(orderVo);
    }

    // TODO: 2020/1/14 微信回调
    public Result payNotify(WxUserOrderVo orderVo) {
        return wxUserService.payNotify(orderVo);
    }
    // TODO: 2020/1/14 微信结束使用

}