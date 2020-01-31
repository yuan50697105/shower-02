package org.yuan.boot.shower.wx.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.commons.controller.BaseController;
import org.yuan.boot.shower.wx.service.WxCustomerService;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:38
 */
@RestController
@RequestMapping("wx/customer")
@AllArgsConstructor
public class WxCustomerController extends BaseController {
    private WxCustomerService wxCustomerService;


}