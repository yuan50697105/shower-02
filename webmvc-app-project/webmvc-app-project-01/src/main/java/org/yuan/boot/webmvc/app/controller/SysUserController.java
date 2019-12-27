package org.yuan.boot.webmvc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.service.SysUserService;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.db.pojo.PageResult;
import org.yuan.boot.webmvc.pojo.DataResult;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @author yuane
 */
@RestController
@RequestMapping("sys/user")
public class SysUserController extends ResultController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("data")
    public Result data(SysUserCondition condition) {
        return new PageResult<>(sysUserService.selectPage(condition));
    }

    @GetMapping("list")
    public Result list(SysUserCondition condition) {
        return new DataResult<>(sysUserService.selectList(condition));
    }

    @GetMapping("list/{name}")
    public Result list(@PathVariable("name") String name) {
        return new DataResult<>(sysUserService.selectList(new SysUserCondition().setName(name)));
    }

    @GetMapping("get")
    public Result get(SysUser sysUser) {
        return new DataResult<>(sysUserService.selectOne(sysUser));
    }

    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        return new DataResult<>(sysUserService.selectById(id));
    }

    @PostMapping
    public Result save(@RequestBody @Validated SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        sysUserService.save(sysUserVo);
        return ok();
    }

    @PutMapping
    public Result modify(@RequestBody @Validated SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        sysUserService.modify(sysUserVo);
        return ok();
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable("id") Long id) {
        sysUserService.delete(id);
        return Result.ok();
    }

}
