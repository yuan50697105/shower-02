package org.yuan.boot.webmvc.app.controller;

import io.swagger.annotations.ApiOperation;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.dao.SysRoleService;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:13
 */
@EqualsAndHashCode(callSuper = true)
@RestController
@RequestMapping("sys/role")
@Value
public class SysRoleController extends ResultController {
    private SysRoleService sysRoleService;

    @ApiOperation("分页查询")
    @GetMapping("data")
    public Result data(SysRoleCondition condition) {
        return sysRoleService.page(condition);
    }

    @ApiOperation("列表查询")
    @GetMapping("list")
    public Result list(SysRoleCondition condition) {
        return sysRoleService.list(condition);
    }

    @ApiOperation("精确查询")
    @GetMapping("get")
    public Result get(SysRole sysRole) {
        return sysRoleService.get(sysRole);
    }

    @ApiOperation(value = "主键查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping("{id}")
    public Result get(@PathVariable("id") Long id) {
        return sysRoleService.get(id);
    }

    @ApiOperation(value = "主键保存", produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping({"save"})
    public Result save(@RequestBody @Validated SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        return sysRoleService.save(sysRoleVo);
    }

    @PostMapping("update")
    public Result update(@RequestBody @Validated SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        return sysRoleService.update(sysRoleVo);
    }

    @GetMapping(value = "delete", params = "ids")
    public Result delete(List<Long> ids) {
        return sysRoleService.delete(ids);
    }

    @GetMapping(value = "delete", params = "id")
    public Result delete(Long id) {
        return sysRoleService.delete(id);
    }
}
