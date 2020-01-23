package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    public Result login(String jsCode) {
        return wxCustomerService.login(jsCode);
    }
}