package com.idea.shower.admin.admin.controller;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.admin.pojo.AdminRoleVO;
import com.idea.shower.admin.admin.service.AdminRoleBackService;
import com.idea.shower.app.db.module.pojo.query.AdminRoleQuery;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-25 17:07
 */
@RestController
@RequestMapping("admin/role")
@AllArgsConstructor
@Validated
@Slf4j
public class AdminRoleController {
    private final AdminRoleBackService adminRoleBackService;

    @PostMapping("add")
    public Result<?> add(@RequestBody AdminRoleVO vo) {
        return adminRoleBackService.add(vo);
    }

    @PostMapping("update")
    public Result<?> update(@RequestBody AdminRoleVO vo) {
        return adminRoleBackService.update(vo);
    }

    @GetMapping("update/get")
    public Result<?> updateGet(Long id) {
        return adminRoleBackService.getForUpdate(id);
    }

    @PutMapping({"update", ""})
    public Result<?> updateRs(@RequestBody AdminRoleVO vo) {
        return adminRoleBackService.update(vo);
    }

    @GetMapping("delete")
    public Result<?> delete(List<Long> ids) {
        return adminRoleBackService.delete(ids);
    }

    @DeleteMapping({"delete/{id}", "{id}"})
    public Result<?> delete(@PathVariable Long id) {
        return adminRoleBackService.delete(Collections.singletonList(id));
    }

    @GetMapping("get")
    public Result<?> getOne(Long id) {
        return adminRoleBackService.get(id);
    }

    @GetMapping("id/{id}")
    public Result<?> getRs(@PathVariable String id) {
        return adminRoleBackService.get(Long.valueOf(id));
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