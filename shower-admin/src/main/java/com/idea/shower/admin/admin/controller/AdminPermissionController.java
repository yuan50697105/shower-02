package com.idea.shower.admin.admin.controller;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.admin.pojo.AdminPermissionVO;
import com.idea.shower.admin.admin.service.AdminPermissionService;
import com.idea.shower.db.mybaits.module.pojo.query.AdminPermissionQuery;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@Validated
public class AdminPermissionController {
    private final AdminPermissionService adminPermissionService;

    @PostMapping("add")
    public Result<?> add(@RequestBody AdminPermissionVO vo) {
        return adminPermissionService.add(vo);
    }

    @PostMapping("modify")
    public Result<?> modify(@RequestBody AdminPermissionVO vo) {
        return adminPermissionService.modify(vo);
    }

    @GetMapping("delete")
    public Result<?> delete(List<Long> ids) {
        return adminPermissionService.delete(ids);
    }

    @GetMapping("get")
    public Result<?> get(Long id) {
        return adminPermissionService.get(id);
    }

    @GetMapping("data")
    public Result<?> data(AdminPermissionQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        return adminPermissionService.data(query, page, size);
    }

    @GetMapping("list")
    public Result<?> list(AdminPermissionQuery query) {
        return adminPermissionService.list(query);
    }
}