package com.idea.shower.admin.admin.controller;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.admin.pojo.AdminRoleVO;
import com.idea.shower.admin.admin.service.AdminRoleBackService;
import com.idea.shower.app.db.module.pojo.query.AdminRoleQuery;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-25 17:07
 */
@RestController
@RequestMapping("admin/role")
@PreAuthorize("hasAnyAuthority('超级管理员')")
@AllArgsConstructor
@Validated
public class AdminRoleController {
    private final AdminRoleBackService adminRoleBackService;


    @PostMapping("add")
    public Result<?> add(@RequestBody AdminRoleVO vo) {
        return adminRoleBackService.add(vo);
    }

    @PostMapping("modify")
    public Result<?> modify(@RequestBody AdminRoleVO vo) {
        return adminRoleBackService.modify(vo);
    }

    @GetMapping("delete")
    public Result<?> delete(List<Long> ids) {
        return adminRoleBackService.delete(ids);
    }

    @GetMapping("get")
    public Result<?> get(Long id) {
        return adminRoleBackService.get(id);
    }

    @GetMapping("data")
    public Result<?> data(AdminRoleQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        return adminRoleBackService.data(query, page, size);
    }

    @GetMapping("list")
    public Result<?> list(AdminRoleQuery query) {
        return adminRoleBackService.list(query);
    }


}