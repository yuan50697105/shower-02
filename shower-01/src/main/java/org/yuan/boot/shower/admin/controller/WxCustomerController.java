package org.yuan.boot.shower.admin.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.admin.service.WxCustomerService;
import org.yuan.boot.shower.db.pojo.WxCustomerCondition;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:18
 */
@RestController
@RequestMapping("wx/customer")
@AllArgsConstructor
@Log4j2
public class WxCustomerController extends AbstractResultController {
    private WxCustomerService wxCustomerService;

    @GetMapping(value = "data", produces = APPLICATION_JSON_UTF8)
    public Result data(WxCustomerCondition condition) {
        return wxCustomerService.data(condition);
    }
}