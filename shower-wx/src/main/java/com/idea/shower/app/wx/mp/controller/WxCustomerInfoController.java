package com.idea.shower.app.wx.mp.controller;

import com.idea.shower.app.wx.mp.pojo.WxUserInfo;
import com.idea.shower.app.wx.mp.service.WxCustomerInfoService;
import com.idea.shower.web.webmvc.controller.ResultController;
import com.idea.shower.web.webmvc.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("login")
    public Result login(String jsCode) {
        return wxCustomerInfoService.login(jsCode);
    }

    @PostMapping("saveUserInfo")
    public Result saveUserInfo(WxUserInfo wxUserInfo) {
        return wxCustomerInfoService.saveUserInfo(wxUserInfo);
    }
}