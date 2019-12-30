package org.yuan.boot.webmvc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.webmvc.app.service.SysUserService;
import org.yuan.boot.webmvc.controller.ResultController;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:35
 */
@RestController
@RequestMapping("sys/user")
public class SysUserController extends ResultController {
    @Autowired
    private SysUserService sysUserService;
}