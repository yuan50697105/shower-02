package org.yuan.boot.shower.admin.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
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
@SuppressWarnings("deprecation")
@RestController
@RequestMapping("admin/user")
@AllArgsConstructor
public class AdminUserController extends AbstractResultController {
    private AdminUserService adminUserService;

    @GetMapping(value = "data", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result data(AdminUserCondition condition) {
        return adminUserService.data(condition);
    }

    @GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result list(AdminUserCondition condition) {
        return adminUserService.list(condition);
    }

    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result get(Long id) {
        return adminUserService.get(id);
    }

    @PostMapping(value = "save", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result save(@RequestBody @Validated(AdminUserVO.Save.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.save(adminUserVO);
    }

    @PostMapping(value = "change/info", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result changeInfo(@RequestBody @Validated(AdminUserVO.Update.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.changeInfo(adminUserVO);
    }

    @PostMapping(value = "change/pwd", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result changePwd(@RequestBody @Validated(AdminUserVO.ChangePwd.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.changePwd(adminUserVO);
    }

    @PostMapping(value = "change/role", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result changeRole(@RequestBody @Validated(AdminUserVO.ChangeRole.class) AdminUserVO adminUserVO, BindingResult result) {
        validate(result);
        return adminUserService.changeRole(adminUserVO);
    }


}