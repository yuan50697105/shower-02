package com.idea.shower.admin.admin.controller;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.admin.pojo.AdminPermissionVO;
import com.idea.shower.admin.admin.service.AdminPermissionBackService;
import com.idea.shower.app.db.module.pojo.query.AdminPermissionQuery;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-25 18:39
 */
@RestController
@RequestMapping("admin/permission")
@PreAuthorize("hasAnyAuthority('超级管理员')")
@AllArgsConstructor
@Validated
public class AdminPermissionController {
    private final AdminPermissionBackService adminPermissionBackService;

    @PostMapping("add")
    public Result<?> add(@RequestBody AdminPermissionVO vo) {
        return adminPermissionBackService.add(vo);
    }

    @PostMapping("modify")
    public Result<?> modify(@RequestBody AdminPermissionVO vo) {
        return adminPermissionBackService.modify(vo);
    }

    @GetMapping("delete")
    public Result<?> delete(List<Long> ids) {
        return adminPermissionBackService.delete(ids);
    }

    @GetMapping("get")
    public Result<?> get(Long id) {
        return adminPermissionBackService.get(id);
    }

    @GetMapping("data")
    public Result<?> data(AdminPermissionQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        return adminPermissionBackService.data(query, page, size);
    }

    @GetMapping("list")
    public Result<?> list(AdminPermissionQuery query) {
        return adminPermissionBackService.list(query);
    }
}