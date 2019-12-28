package org.yuan.boot.webmvc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.webmvc.app.service.SysPermissionService;
import org.yuan.boot.webmvc.controller.ResultController;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-28 13:21
 */
@RestController("sys/permission")
public class SysPermissionController extends ResultController {
    @Autowired
    private SysPermissionService sysPermissionService;
}