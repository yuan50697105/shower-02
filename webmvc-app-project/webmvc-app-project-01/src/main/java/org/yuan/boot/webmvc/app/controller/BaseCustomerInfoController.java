package org.yuan.boot.webmvc.app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.pojo.condition.BaseCustomerInfoCondition;
import org.yuan.boot.webmvc.app.pojo.vo.BaseCustomerInfoVo;
import org.yuan.boot.webmvc.app.service.BaseCustomerInfoService;
import org.yuan.boot.webmvc.controller.ResultController;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 23:09
 */
@Api("用户信息")
@RestController
@RequestMapping("base/customer/info")
@AllArgsConstructor
public class BaseCustomerInfoController extends ResultController {
    private BaseCustomerInfoService baseCustomerInfoService;

    @ApiOperation(value = "分页", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "data", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result data(BaseCustomerInfoCondition condition) {
        return baseCustomerInfoService.page(condition);
    }

    @ApiOperation(value = "列表", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result list(BaseCustomerInfoCondition condition) {
        return baseCustomerInfoService.list(condition);
    }

    @ApiOperation(value = "列表", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping("list/{name}")
    public Result list(@PathVariable("name") String name) {
        return baseCustomerInfoService.list(BaseCustomerInfoCondition.builder().name(name).build());
    }

    @ApiOperation(value = "查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Result get(BaseCustomerInfo customerInfo) {
        return baseCustomerInfoService.get(customerInfo);
    }

    @ApiOperation(value = "查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result get(@PathVariable("id") Long id) {
        return baseCustomerInfoService.get(id);
    }

    @ApiOperation(value = "增加", httpMethod = HTTP_METHOD_POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Result save(@RequestBody @Validated(BaseCustomerInfoVo.Save.class) BaseCustomerInfoVo baseCustomerInfoVo, BindingResult result) {
        validate(result);
        return baseCustomerInfoService.save(baseCustomerInfoVo);
    }

    @ApiOperation(value = "修改", httpMethod = HTTP_METHOD_POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Result update(@RequestBody @Validated(BaseCustomerInfoVo.Update.class) BaseCustomerInfoVo customerInfoVo, BindingResult result) {
        validate(result);
        return baseCustomerInfoService.update(customerInfoVo);
    }

    @ApiOperation(value = "删除", httpMethod = HTTP_METHOD_GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "delete", params = "id", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result delete(Long id) {
        return baseCustomerInfoService.delete(id);
    }

    @ApiOperation(value = "删除", httpMethod = HTTP_METHOD_GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "delete", params = "ids", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result delete(List<Long> ids) {
        return baseCustomerInfoService.delete(ids);
    }
}