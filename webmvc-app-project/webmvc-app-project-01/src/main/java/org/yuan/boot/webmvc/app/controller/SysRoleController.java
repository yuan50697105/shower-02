package org.yuan.boot.webmvc.app.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.app.service.SysRoleService;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:13
 */
@RestController
@RequestMapping("sys/role")
public class SysRoleController extends ResultController {
    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("data")
    public Result data(SysRoleCondition condition) {
        return sysRoleService.page(condition);
    }

    @GetMapping("list")
    public Result list(SysRoleCondition condition) {
        return sysRoleService.list(condition);
    }

    @GetMapping("get")
    public Result get(SysRole sysRole) {
        return sysRoleService.get(sysRole);
    }
    @ApiOperation(value = "主键保存", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        return sysRoleService.get(id);
    }

    @ApiOperation(value = "保存", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping({"save", ""})
    public Result save(@RequestBody @Validated SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        return sysRoleService.save(sysRoleVo);
    }
}