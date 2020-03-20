package com.idea.shower.app.wx.controller;

import com.idea.shower.app.wx.pojo.WxOrderInfo;
import com.idea.shower.app.commons.web.controller.BaseController;
import com.idea.shower.app.wx.service.WxOrderService;
import com.idea.shower.web.webmvc.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:48
 */
@RestController
@RequestMapping("com/idea/shower/shower/app/wx/order")
@AllArgsConstructor
public class WxOrderController extends BaseController {
    private WxOrderService wxOrderService;

    @PostMapping(value = "add", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result add(WxOrderInfo wxOrderInfo) {
        return wxOrderService.addOrder(wxOrderInfo);
    }
}