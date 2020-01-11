package org.yuan.boot.webmvc.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.webmvc.app.service.BaseCustomerInfoService;
import org.yuan.boot.webmvc.controller.ResultController;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 23:09
 */
@RestController
@RequestMapping("base/customer/info")
@AllArgsConstructor
public class BaseCustomerInfoController extends ResultController {
    private BaseCustomerInfoService baseCustomerInfoService;
}