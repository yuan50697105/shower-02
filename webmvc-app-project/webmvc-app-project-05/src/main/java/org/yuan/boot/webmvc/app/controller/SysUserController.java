package org.yuan.boot.webmvc.app.controller;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.webmvc.app.dao.SysUserService;
import org.yuan.boot.webmvc.controller.ResultController;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:35
 */
@EqualsAndHashCode(callSuper = true)
@RestController
@RequestMapping("sys/user")
@Value
public class SysUserController extends ResultController {
    private SysUserService sysUserService;

}