package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.shower.wx.pojo.WxUserInfoVO;
import org.yuan.boot.shower.wx.service.WxUserService;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:51
 */
@RestController
@RequestMapping("wx/user")
@AllArgsConstructor
public class WxUserController extends AbstractResultController {
    private WxUserService wxUserService;

    @PostMapping("login")
    public Result wxLogin(String jsCode) {
        return wxUserService.wxLogin(jsCode);
    }

    @GetMapping("getAccessToken")
    public Result getAccessToken() {
        return wxUserService.getAccessToken();
    }

    @PostMapping("saveUserInfo")
    public Result saveUserInfo(@RequestBody WxUserInfoVO wxUserInfoVO) {
        return wxUserService.saveUserInfo(wxUserInfoVO);
    }


}