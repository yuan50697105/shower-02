package com.idea.shower.admin.admin.controller;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.admin.pojo.AdminUserVO;
import com.idea.shower.admin.admin.service.AdminUserService;
import com.idea.shower.app.db.module.pojo.query.AdminUserQuery;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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
    private final AdminUserService adminUserService;

    @PostMapping("add")
    public Result<?> add(@RequestBody AdminUserVO vo) {
        return adminUserService.add(vo);
    }

    @GetMapping("get/user")
    public Result<?> getUser(Long id) {
        return adminUserService.getUser(id);
    }

    @PostMapping("modify/user")
    public Result<?> modifyUser(@RequestBody AdminUserVO vo) {
        return adminUserService.modifyUser(vo);
    }

    @GetMapping("get/role")
    public Result<?> getRole(Long id) {
        return adminUserService.getRole(id);
    }

    @PostMapping("modify/role")
    public Result<?> modifyRole(@RequestBody AdminUserVO vo) {
        return adminUserService.modifyRole(vo);
    }

    @RequestMapping(value = "delete", method = {RequestMethod.GET})
    public Result<?> deleteList(List<Long> ids) {
        return adminUserService.delete(ids);
    }

    @RequestMapping(value = "delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public Result<?> delete(@PathVariable Long id) {
        return adminUserService.delete(Arrays.asList(id));
    }

    @GetMapping("data")
    public Result<?> data(AdminUserQuery query,
                          @RequestParam(defaultValue = "1") int page,
                          @RequestParam(defaultValue = "20") int limit) {
        return adminUserService.data(query, page, limit);
    }

    @GetMapping("list")
    public Result<?> list(AdminUserQuery query) {
        return adminUserService.list(query);
    }

    @GetMapping("get")
    public Result<?> get(Long id) {
        return adminUserService.get(id);
    }

    @PutMapping("modify")
    public Result<?> update(@RequestBody AdminUserVO adminUserVO) {
        return adminUserService.modify(adminUserVO);
    }
}