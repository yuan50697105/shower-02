package com.idea.shower.db.mybaits.module.dao.impl;

import com.idea.shower.db.mybaits.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.db.mybaits.module.dao.AreaBuildingDao;
import com.idea.shower.db.mybaits.module.mapper.AreaBuildingMapper;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;
import com.idea.shower.db.mybaits.module.pojo.AreaBuildingExample;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 11:01
 */
@Component
@AllArgsConstructor
public class AreaBuildingDaoImpl extends BaseDaoImpl<AreaBuilding, AreaBuildingMapper> implements AreaBuildingDao {
    @Override
    public List<AreaBuilding> selectAllByAreaId(Long areaId) {
        AreaBuildingExample example = new AreaBuildingExample();
        example.or().andAreaIdEqualTo(areaId);
        return baseMapper().selectByExample(example);
    }
}