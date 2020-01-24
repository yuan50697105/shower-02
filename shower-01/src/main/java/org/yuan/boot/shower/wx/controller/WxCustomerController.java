package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.wx.pojo.WxUserInfo;
import org.yuan.boot.shower.wx.service.WxCustomerService;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:53
 */
@RestController
@RequestMapping("wx/customer")
@AllArgsConstructor
@Log4j2
public class WxCustomerController extends ResultController {
    private WxCustomerService wxCustomerService;

    /**
     * 用户登录
     */
    @PostMapping(value = "Login", produces = APPLICATION_JSON_UTF8)
    public Result login(String jsCode) {
        return wxCustomerService.login(jsCode);
    }

    /**
     * 获取用户信息
     */
    @PostMapping(value = "getUserInfo", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result getUserInfo(Long id) {
        return wxCustomerService.getUserInfoById(id);
    }

    /**
     * 保存用户信息
     */
    @PostMapping(value = "saveUserInfo", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result saveUserInfo(@RequestBody @Validated(WxUserInfo.ValidateForUserInfo.class) WxUserInfo wxUserInfo, BindingResult result) {
        validate(result);
        return wxCustomerService.saveUserInfo(wxUserInfo);
    }
}