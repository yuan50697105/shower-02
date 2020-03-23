package com.idea.shower.app.wx.mp.controller;

import com.idea.shower.app.wx.mp.pojo.WxLoginInfo;
import com.idea.shower.app.wx.mp.pojo.WxUserInfo;
import com.idea.shower.app.wx.mp.service.WxCustomerInfoService;
import com.idea.shower.web.webmvc.controller.ResultController;
import com.idea.shower.web.webmvc.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 12:46
 */
@RestController
@RequestMapping("wx/customer")
@AllArgsConstructor
@Validated
public class WxCustomerInfoController extends ResultController {
    private WxCustomerInfoService wxCustomerInfoService;

    @PostMapping("login")
    public Result login(@RequestBody WxLoginInfo wxLoginInfo) {
        return wxCustomerInfoService.login(wxLoginInfo);
    }

    @PostMapping("saveUserInfo")
    public Result saveUserInfo(WxUserInfo wxUserInfo) {
        return wxCustomerInfoService.saveUserInfo(wxUserInfo);
    }
}