package com.idea.shower.shower.app.wx.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.idea.shower.shower.app.commons.controller.BaseController;
import com.idea.shower.shower.app.wx.service.WxCustomerService;

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