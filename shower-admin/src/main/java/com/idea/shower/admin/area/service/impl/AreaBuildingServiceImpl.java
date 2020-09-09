package com.idea.shower.admin.area.service.impl;

import ai.yue.library.base.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.admin.area.dao.AreaBuildingDao;
import com.idea.shower.admin.area.dto.AreaBuildingDTO;
import com.idea.shower.admin.area.service.AreaBuildingService;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;
import io.renren.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 楼宇信息
 *
 * @author finch 2410015564@qq.com
 * @since 1.0.0 2020-08-12
 */
@Service
public class AreaBuildingServiceImpl extends CrudServiceImpl<AreaBuildingDao, AreaBuilding, AreaBuildingDTO> implements AreaBuildingService {

    @Override
    public QueryWrapper<AreaBuilding> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<AreaBuilding> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}