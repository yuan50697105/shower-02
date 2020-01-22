package org.yuan.boot.shower.admin.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.shower.admin.pojo.AdminRoleVo;
import org.yuan.boot.shower.admin.service.AdminRoleService;
import org.yuan.boot.shower.db.pojo.AdminRoleCondition;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

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

    @GetMapping(value = "data", produces = APPLICATON_JSON_UTF8)
    public Result data(AdminRoleCondition condition) {
        return adminRoleService.data(condition);
    }

    @GetMapping(value = "list", produces = APPLICATON_JSON_UTF8)
    public Result list(AdminRoleCondition condition) {
        return adminRoleService.list(condition);
    }

    @GetMapping(value = "get", produces = APPLICATON_JSON_UTF8)
    public Result get(Long id) {
        return adminRoleService.get(id);
    }

    @PostMapping(value = "save", produces = APPLICATON_JSON_UTF8, consumes = APPLICATON_JSON_UTF8)
    public Result save(@RequestBody @Validated(AdminRoleVo.Save.class) AdminRoleVo adminRoleVo, BindingResult result) {
        validate(result);
        return adminRoleService.save(adminRoleVo);
    }

    @PostMapping(value = "update",produces = APPLICATON_JSON_UTF8,consumes = APPLICATON_JSON_UTF8)
    public Result update(@RequestBody @Validated(AdminRoleVo.Update.class) AdminRoleVo adminRoleVo, BindingResult result) {
        validate(result);
        return adminRoleService.update(adminRoleVo);
    }

    @GetMapping("delete/{id}")
    public Result delete(@PathVariable("id") Long id) {
        return adminRoleService.delete(id);
    }

}