package org.yuan.boot.webmvc.app.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserRolePermissionViewCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserRolePermissionViewConverter;
import org.yuan.boot.webmvc.app.service.SysUserRolePermissionViewService;
import org.yuan.boot.webmvc.pojo.Result;
import retrofit2.http.GET;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 23:39
 */
@RestController
@RequestMapping("sys/user/role/permission/view")
@AllArgsConstructor
@Log4j2
public class SysUserRolePermissionViewController {
    private SysUserRolePermissionViewService sysUserRolePermissionViewService;

    @GetMapping("list")
    public Result list() {
        return sysUserRolePermissionViewService.list();
    }
}