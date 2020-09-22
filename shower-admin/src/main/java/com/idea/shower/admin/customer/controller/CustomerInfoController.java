package com.idea.shower.admin.customer.controller;

import com.idea.shower.admin.customer.service.CustomerInfoService;
import com.idea.shower.db.mybaits.module.pojo.ao.CustomerInfoAo;
import io.renren.common.constant.Constant;
import io.renren.common.page.PageData;
import io.renren.common.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

/**  
 * <p>
 * Title: ${file_name}
 * </p>  
 * <p>
 * Description: customer_info
 * </p>  
 * 
 * @author finch  
 * @email  2410015564@qq.com  
 * @date   2020-09-16 ${time} 
 * @version 1.0.0
*/

@RestController
@RequestMapping("customer/customerinfo")
@Api(tags="customer_info")
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    public Result<PageData<CustomerInfoAo>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<CustomerInfoAo> page = customerInfoService.page(params);

        return new Result<PageData<CustomerInfoAo>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    public Result<CustomerInfoAo> get(@PathVariable("id") Long id){
        CustomerInfoAo data = customerInfoService.get(id);
        return new Result<CustomerInfoAo>().ok(data);
    }


}