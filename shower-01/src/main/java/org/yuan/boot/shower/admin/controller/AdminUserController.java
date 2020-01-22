package org.yuan.boot.shower.admin.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.shower.admin.pojo.AdminUserVO;
import org.yuan.boot.shower.admin.service.AdminUserService;
import org.yuan.boot.shower.db.pojo.AdminUserCondition;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:00
 */
@RestController
@RequestMapping("admin/user")
@AllArgsConstructor
public class AdminUserController extends AbstractResultController {
    private AdminUserService adminUserService;

    @GetMapping(value = "data", produces = APPLICATON_JSON_UTF8)
    public Result data(AdminUserCondition condition) {
        return adminUserService.data(condition);
    }

    @GetMapping(value = "list", produces = APPLICATON_JSON_UTF8)
    public Result list(AdminUserCondition condition) {
        return adminUserService.list(condition);
    }

    @GetMapping(value = "list/{name}", produces = APPLICATON_JSON_UTF8)
    public Result list(@PathVariable("name") String name) {
        return list(new AdminUserCondition().setName(name));
    }

    @GetMapping(value = "get", produces = APPLICATON_JSON_UTF8)
    public Result get(Long id) {
        return adminUserService.get(id);
    }

    @PostMapping(value = "save", produces = APPLICATON_JSON_UTF8, consumes = APPLICATON_JSON_UTF8)
    public Result save(@RequestBody @Validated(AdminUserVO.Save.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.save(adminUserVO);
    }

    @PostMapping(value = "change/info", produces = APPLICATON_JSON_UTF8, consumes = APPLICATON_JSON_UTF8)
    public Result changeInfo(@RequestBody @Validated(AdminUserVO.Update.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.changeInfo(adminUserVO);
    }

    @PostMapping(value = "change/pwd", produces = APPLICATON_JSON_UTF8, consumes = APPLICATON_JSON_UTF8)
    public Result changePwd(@RequestBody @Validated(AdminUserVO.ChangePwd.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.changePwd(adminUserVO);
    }

    @PostMapping(value = "change/role", produces = APPLICATON_JSON_UTF8, consumes = APPLICATON_JSON_UTF8)
    public Result changeRole(@RequestBody @Validated(AdminUserVO.ChangeRole.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.changeRole(adminUserVO);
    }


}