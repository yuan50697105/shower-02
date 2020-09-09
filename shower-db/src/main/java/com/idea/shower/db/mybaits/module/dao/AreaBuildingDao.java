package com.idea.shower.db.mybaits.module.dao;

import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 11:00
 */
public interface AreaBuildingDao extends BaseDao<AreaBuilding> {
    List<AreaBuilding> selectAllByAreaId(Long areaId);
}
