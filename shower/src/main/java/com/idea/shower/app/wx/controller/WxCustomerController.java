package com.idea.shower.app.wx.controller;

import com.idea.shower.app.wx.service.WxCustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.idea.shower.app.commons.web.controller.BaseController;

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