package com.idea.shower.admin.customer.controller;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.customer.pojo.CustomerInfoVo;
import com.idea.shower.admin.customer.service.CustomerInfoService;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 17:06
 */
@RestController
@RequestMapping("/customer/info")
@Data
public class CustomerInfoController {
    private CustomerInfoService customerInfoService;

    @PostMapping({"", "/add"})
    public Result<?> add(@RequestBody CustomerInfoVo customerInfoVo) {
        return customerInfoService.add(customerInfoVo);
    }
}