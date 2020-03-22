package com.idea.shower.app.db.module.dao;

import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.AreaBuilding;

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
