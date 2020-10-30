package com.idea.shower.admin.area.controller;

import com.idea.shower.admin.area.service.AreaBuildingService;
import com.idea.shower.db.mybaits.module.pojo.ao.AreaBuildingAo;
import com.idea.shower.db.mybaits.module.pojo.ao.CustomerInfoAo;
import io.renren.common.page.PageData;
import io.renren.common.utils.Result;
import io.renren.common.validator.AssertUtils;
import io.renren.common.validator.ValidatorUtils;
import io.renren.common.validator.group.AddGroup;
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
 * Description: 楼宇信息
 * </p>  
 * 
 * @author finch  
 * @email  2410015564@qq.com  
 * @date   2020-08-12 ${time} 
 * @version 1.0.0
*/

@RestController
@RequestMapping("/area/areabuilding")
public class AreaBuildingController {
    @Autowired
    private AreaBuildingService areaBuildingService;

    @GetMapping("page")
    public Result<PageData<AreaBuildingAo>> page(@RequestParam Map<String, Object> params){
        PageData<AreaBuildingAo> page = areaBuildingService.page(params);
        return new Result<PageData<AreaBuildingAo>>().ok(page);
    }

    @GetMapping("{id}")
    public Result<AreaBuildingAo> get(@PathVariable("id") Long id){
        AreaBuildingAo data = areaBuildingService.get(id);
        return new Result().ok (data);
    }

    @PostMapping
    public Result save(@RequestBody AreaBuildingAo dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);
        areaBuildingService.save(dto);
        return new Result();
    }

    @PutMapping
    public Result update(@RequestBody AreaBuildingAo dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);
        areaBuildingService.update(dto);
        return new Result();
    }

    @DeleteMapping
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");
        areaBuildingService.delete(ids);
        return new Result();
    }

}