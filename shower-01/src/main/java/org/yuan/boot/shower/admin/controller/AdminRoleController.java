package org.yuan.boot.shower.admin.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.admin.service.AdminRoleService;
import org.yuan.boot.webmvc.controller.AbstractResultController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:28
 */
@RestController
@RequestMapping("admin/role")
@AllArgsConstructor
public class AdminRoleController extends AbstractResultController {
    private AdminRoleService adminRoleService;

}