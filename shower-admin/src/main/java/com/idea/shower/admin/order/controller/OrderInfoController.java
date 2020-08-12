package com.idea.shower.admin.order.controller;

import com.idea.shower.admin.order.dto.OrderInfoDTO;
import com.idea.shower.admin.order.service.OrderInfoService;
import io.renren.common.page.PageData;
import io.renren.common.utils.Result;
import io.renren.common.validator.AssertUtils;
import io.renren.common.validator.ValidatorUtils;
import io.renren.common.validator.group.DefaultGroup;
import io.renren.common.validator.group.UpdateGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
public class OrderInfoController {
    @Autowired
    private OrderInfoService orderInfoService;

    @GetMapping("page")
    public Result<PageData<OrderInfoDTO>> page(@RequestParam Map<String, Object> params){
        PageData<OrderInfoDTO> page = orderInfoService.page(params);

        return new Result<PageData<OrderInfoDTO>>().ok(page);
    }

    @GetMapping("{id}")
    public Result<OrderInfoDTO> get(@PathVariable("id") Long id){
        OrderInfoDTO data = orderInfoService.get(id);
        return new Result<OrderInfoDTO>().ok(data);
    }

    @PostMapping
    public Result save(@RequestBody OrderInfoDTO dto){
        //效验数据
        orderInfoService.save(dto);
        return new Result();
    }

    @PutMapping
    public Result update(@RequestBody OrderInfoDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);
        orderInfoService.update(dto);
        return new Result();
    }

    @DeleteMapping
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");
        orderInfoService.delete(ids);
        return new Result();
    }


}