package com.idea.shower.app.admin.admin.controller;

import com.idea.shower.app.admin.admin.service.AdminRoleService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-13 19:44
 */
@RestController
@RequestMapping("admin/role")
@AllArgsConstructor
@Validated
public class AdminRoleController {
    private final AdminRoleService adminRoleService;
}