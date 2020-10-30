package com.idea.shower.db.mybaits.module.mapper.query;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;
import com.idea.shower.db.mybaits.module.pojo.ao.AreaBuildingAo;
import com.idea.shower.db.mybaits.module.pojo.query.AreaBuildingQuery;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-10-30 12:01
 */
@Mapper
public interface AreaBuildingQueryMapper {
    IPage<AreaBuildingAo> selectPageByQuery(IPage<AreaBuilding> page, AreaBuildingQuery query);
}
