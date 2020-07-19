package com.idea.shower.admin.admin.controller;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.admin.pojo.AdminUserVO;
import com.idea.shower.admin.admin.service.AdminUserBackService;
import com.idea.shower.app.db.module.pojo.query.AdminUserQuery;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-24 19:09
 */
@RestController
@RequestMapping("admin/user")
@AllArgsConstructor
@Validated
public class AdminUserController {
    private final AdminUserBackService adminUserBackService;

    @PostMapping("add")
    public Result<?> add(@RequestBody AdminUserVO vo) {
        return adminUserBackService.add(vo);
    }

    @GetMapping("get/user")
    public Result<?> getUser(Long id) {
        return adminUserBackService.getUser(id);
    }

    @PostMapping("modify/user")
    public Result<?> modifyUser(@RequestBody AdminUserVO vo) {
        return adminUserBackService.modifyUser(vo);
    }

    @GetMapping("get/role")
    public Result<?> getRole(Long id) {
        return adminUserBackService.getRole(id);
    }

    @PostMapping("modify/role")
    public Result<?> modifyRole(@RequestBody AdminUserVO vo) {
        return adminUserBackService.modifyRole(vo);
    }

    @GetMapping("delete")
    public Result<?> delete(List<Long> ids) {
        return adminUserBackService.delete(ids);
    }

    @GetMapping("data")
    public Result<?> data(AdminUserQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int size) {
        return adminUserBackService.data(query, page, size);
    }

    @GetMapping("list")
    public Result<?> list(AdminUserQuery query) {
        return adminUserBackService.list(query);
    }

    @GetMapping("get")
    public Result<?> get(Long id) {
        return adminUserBackService.get(id);
    }
}