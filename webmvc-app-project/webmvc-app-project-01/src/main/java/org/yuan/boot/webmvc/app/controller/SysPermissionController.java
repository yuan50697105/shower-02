package org.yuan.boot.webmvc.app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.dao.SysPermissionDao;
import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysPermissionVo;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 13:31
 */
@EqualsAndHashCode(callSuper = true)
@RestController
@RequestMapping("sys/permission")
@AllArgsConstructor
@Api("权限信息")
public class SysPermissionController extends ResultController {
    private SysPermissionDao sysPermissionService;


    @ApiOperation(value = "分页查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "data", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result data(SysPermissionCondition condition) {
        return sysPermissionService.page(condition);
    }

    @ApiOperation(value = "列表查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result list(SysPermissionCondition condition) {
        return sysPermissionService.list(condition);
    }

    @ApiOperation(value = "列表查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "list/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result list(@PathVariable("name") String name) {
        return list(SysPermissionCondition.builder().name(name).build());
    }

    @ApiOperation(value = "查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "get", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result get(SysPermission permission) {
        return sysPermissionService.get(permission);
    }

    @ApiOperation(value = "查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result get(@PathVariable("id") Long id) {
        return sysPermissionService.get(id);
    }

    @ApiOperation(value = "增加", httpMethod = HTTP_METHOD_POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result save(SysPermissionVo sysPermissionVo, BindingResult result) {
        validate(result);
        return sysPermissionService.save(sysPermissionVo);
    }
}