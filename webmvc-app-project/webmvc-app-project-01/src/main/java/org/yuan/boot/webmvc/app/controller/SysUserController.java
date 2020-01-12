package org.yuan.boot.webmvc.app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.service.SysUserService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

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
@AllArgsConstructor
public class SysUserController extends ResultController {
    private SysUserService sysUserService;

    @ApiOperation(value = "分页查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "data", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result data(@ApiParam SysUserCondition condition) {
        return sysUserService.page(condition);
    }

    @ApiOperation(value = "列表查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result list(SysUserCondition condition) {
        return sysUserService.list(condition);
    }

    @ApiOperation(value = "列表查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "list/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result list(@PathVariable("name") String name) {
        return sysUserService.list(new SysUserCondition().setName(name));
    }

    @ApiOperation(value = "精确查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result get(SysUser condition) {
        return sysUserService.get(condition);
    }

    @ApiOperation(value = "主键查询")
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result get(@PathVariable("id") Long id) {
        return sysUserService.get(SysUser.builder().id(id).build());
    }

    @ApiOperation(value = "增加", httpMethod = HTTP_METHOD_POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = {"save"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Result save(@RequestBody @Validated(SysUserVo.Save.class) SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        return sysUserService.save(sysUserVo);
    }

    @ApiOperation(value = "修改", httpMethod = HTTP_METHOD_POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Result update(@RequestBody @Validated(SysUserVo.Update.class) SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        return sysUserService.update(sysUserVo);
    }

    @ApiOperation(value = "修改密码", consumes = MediaType.APPLICATION_JSON_VALUE, httpMethod = HTTP_METHOD_POST)
    @PostMapping(value = "update/pwd", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Result changePwd(@RequestBody @Validated(SysUserVo.ChangePwd.class) SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        return sysUserService.changePwd(sysUserVo);
    }

    @ApiOperation(value = "修改角色", httpMethod = HTTP_METHOD_POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "update/role", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Result changeRole(@RequestBody @Validated({SysUserVo.ChangeRole.class}) SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        return sysUserService.changeRole(sysUserVo);
    }

    @ApiOperation(value = "删除", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "delete", params = "ids", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result delete(List<Long> ids) {
        return sysUserService.delete(ids);
    }

    @ApiOperation(value = "删除", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "delete", params = "id", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result delete(Long id) {
        return sysUserService.delete(id);
    }
}