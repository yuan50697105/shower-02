package org.yuan.boot.webmvc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.app.service.SysRoleService;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.db.pojo.PageResult;
import org.yuan.boot.webmvc.pojo.DataResult;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-28 12:21
 */
@RestController
@RequestMapping("sys/role")
public class SysRoleController extends ResultController {
    @Autowired
    private SysRoleService sysRoleService;

    @GetMapping("data")
    public Result data(SysRoleCondition condition) {
        return new PageResult<>(sysRoleService.selectPage(condition));
    }

    @GetMapping("list")
    public Result list(SysRoleCondition condition) {
        return new DataResult<>(sysRoleService.selectList(condition));
    }

    @GetMapping("list/{name}")
    public Result list(@PathVariable("name") String name) {
        return list(new SysRoleCondition().setName(name));
    }

    @GetMapping("get")
    public Result get(SysRole sysRole) {
        return new DataResult<>(sysRoleService.selectOne(sysRole));
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        return new DataResult<>(sysRoleService.selectById(id));
    }

    @PostMapping
    public Result save(@RequestBody @Validated SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        sysRoleService.saveVo(sysRoleVo);
        return Result.ok();
    }
}