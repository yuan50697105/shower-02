package org.yuan.boot.shower.admin.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.shower.admin.pojo.AdminUserVO;
import org.yuan.boot.shower.admin.service.AdminUserService;
import org.yuan.boot.shower.db.pojo.AdminUserCondition;
import org.yuan.boot.webmvc.controller.AbstractResultController;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:00
 */
@RestController
@RequestMapping("admin/user")
@AllArgsConstructor
@Log4j2
public class AdminUserController extends AbstractResultController {
    private AdminUserService adminUserService;

    @GetMapping(value = "data", produces = APPLICATION_JSON_UTF8)
    public Result data(AdminUserCondition condition) {
        return adminUserService.data(condition);
    }

    @GetMapping(value = "list", produces = APPLICATION_JSON_UTF8)
    public Result list(AdminUserCondition condition) {
        return adminUserService.list(condition);
    }

    @GetMapping(value = "list/{name}", produces = APPLICATION_JSON_UTF8)
    public Result list(@PathVariable("name") String name) {
        return list(new AdminUserCondition().setName(name));
    }

    @GetMapping(value = "get", produces = APPLICATION_JSON_UTF8)
    public Result get(Long id) {
        return adminUserService.get(id);
    }

    @PostMapping(value = "save", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result save(@RequestBody @Validated(AdminUserVO.Save.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.save(adminUserVO);
    }

    @PostMapping(value = "change/info", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result changeInfo(@RequestBody @Validated(AdminUserVO.Update.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.changeInfo(adminUserVO);
    }

    @PostMapping(value = "change/pwd", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result changePwd(@RequestBody @Validated(AdminUserVO.ChangePwd.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.changePwd(adminUserVO);
    }

    @PostMapping(value = "change/role", produces = APPLICATION_JSON_UTF8, consumes = APPLICATION_JSON_UTF8)
    public Result changeRole(@RequestBody @Validated(AdminUserVO.ChangeRole.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.changeRole(adminUserVO);
    }

    @GetMapping(value = "delete", params = "id", produces = APPLICATION_JSON_UTF8)
    public Result delete(Long id) {
        return adminUserService.delete(id);
    }

    @GetMapping(value = "delete", params = "ids", produces = APPLICATION_JSON_UTF8)
    public Result delete(List<Long> ids) {
        return adminUserService.delete(ids);
    }


}