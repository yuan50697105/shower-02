package com.idea.shower.admin.order.controller;

import com.idea.shower.db.mybaits.module.pojo.ao.OrderInfoAo;
import com.idea.shower.admin.order.service.OrderInfoService;
import io.renren.common.constant.Constant;
import io.renren.common.page.PageData;
import io.renren.common.utils.Result;
import io.renren.common.validator.ValidatorUtils;
import io.renren.common.validator.group.DefaultGroup;
import io.renren.common.validator.group.UpdateGroup;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

/**  
 * <p>
 * Title: ${file_name}
 * </p>  
 * <p>
 * Description: order_info
 * </p>  
 * 
 * @author finch  
 * @email  2410015564@qq.com  
 * @date   2020-08-12 ${time} 
 * @version 1.0.0
*/

@RestController
@RequestMapping("order/orderinfo")
@AllArgsConstructor
public class OrderInfoController {
    private OrderInfoService orderInfoService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
            @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
            @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
            @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
            @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    public Result<PageData<OrderInfoAo>> page(@RequestParam Map<String, Object> params){
        PageData<OrderInfoAo> page = orderInfoService.page(params);

        return new Result<PageData<OrderInfoAo>>().ok(page);
    }


    @PutMapping("updateAo")
    @ApiOperation("修改")
    public Result updateAo(@RequestBody OrderInfoAo dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);
        orderInfoService.update(dto);
        return new Result();
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    public Result<OrderInfoAo> get(@PathVariable("id") Long id){
        OrderInfoAo data = orderInfoService.get(id);
        return new Result<OrderInfoAo>().ok(data);
    }

}