package com.idea.shower.db.mybaits.module.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;
import com.idea.shower.db.mybaits.module.pojo.ao.AreaBuildingAo;
import com.idea.shower.db.mybaits.module.pojo.query.AreaBuildingQuery;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 11:00
 */
public interface AreaBuildingDao extends CommonsDao<AreaBuilding,AreaBuilding> {
    List<AreaBuilding> selectAllByAreaId(Long areaId);

    IPage<AreaBuildingAo> selectPageByQuery(IPage<AreaBuilding> page, AreaBuildingQuery query);
}
