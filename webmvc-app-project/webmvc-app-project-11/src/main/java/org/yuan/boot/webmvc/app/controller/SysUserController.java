package org.yuan.boot.webmvc.app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.dao.SysUserService;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:35
 */
@EqualsAndHashCode(callSuper = true)
@Api("用户信息")
@RestController
@RequestMapping("sys/user")
@Value
public class SysUserController extends ResultController {
    private SysUserService sysUserService;

    @ApiOperation(value = "分页查询")
    @GetMapping("data")
    public Result data(SysUserCondition condition) {
        return sysUserService.page(condition);
    }

    @ApiOperation(value = "列表查询")
    @GetMapping("list")
    public Result list(SysUserCondition condition) {
        return sysUserService.list(condition);
    }

    @ApiOperation(value = "精确查询")
    @GetMapping("get")
    public Result get(SysUser condition) {
        return sysUserService.get(condition);
    }

    @ApiOperation(value = "主键查询")
    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        return sysUserService.get(id);
    }

    @ApiOperation(value = "保存", httpMethod = "POST", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping({"save", ""})
    public Result save(@RequestBody @Validated SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        return sysUserService.save(sysUserVo);
    }
}