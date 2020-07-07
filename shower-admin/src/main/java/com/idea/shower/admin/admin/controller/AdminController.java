package com.idea.shower.admin.admin.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.idea.shower.admin.admin.service.AdminService;
import com.idea.shower.admin.security.JwtTokenUtils;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Set;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-31 10:26
 */
@RestController
@RequestMapping("admin")
@Validated
@AllArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping("getUserInfo")
    @PreAuthorize("isAuthenticated()")
    public Result<?> getUserInfo(String token) {
        String username = JwtTokenUtils.getUsername(token);
        Set<String> hashSet = adminService.getRoleList(username);
        HashMap<String, Object> map = new HashMap<>();
        map.put("roles", hashSet);
        map.put("name", username);
        map.put("avtor", "");
        return ResultInfo.success(map);
    }

    @GetMapping("logout")
    public Result<?> logout() {
        SecurityContextHolder.clearContext();
        return ResultInfo.success();

    }
}