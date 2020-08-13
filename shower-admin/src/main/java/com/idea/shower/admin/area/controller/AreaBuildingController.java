package com.idea.shower.admin.area.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.idea.shower.admin.area.dto.AreaBuildingDTO;
import com.idea.shower.admin.area.service.AreaBuildingService;
import io.renren.common.page.PageData;
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
@RequestMapping("area/areabuilding")
public class AreaBuildingController {
    @Autowired
    private AreaBuildingService areaBuildingService;

    @GetMapping("page")
    public Result<PageData<AreaBuildingDTO>> page(@RequestParam Map<String, Object> params){
        PageData<AreaBuildingDTO> page = areaBuildingService.page(params);

        return ResultInfo.success(page);
    }

    @GetMapping("{id}")
    public Result<AreaBuildingDTO> get(@PathVariable("id") Long id){
        AreaBuildingDTO data = areaBuildingService.get(id);
        return ResultInfo.success(data);
    }

    @PostMapping
    public Result save(@RequestBody AreaBuildingDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);
        areaBuildingService.save(dto);
        return new Result();
    }

    @PutMapping
    public Result update(@RequestBody AreaBuildingDTO dto){
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