package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.dao.AreaBuildingDao;
import com.idea.shower.db.mybaits.module.mapper.AreaBuildingMapper;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;
import com.idea.shower.db.mybaits.module.pojo.AreaBuildingExample;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 11:01
 */
@Component
@AllArgsConstructor
public class AreaBuildingDaoImpl extends CommonsDaoImpl<AreaBuilding, AreaBuildingMapper> implements AreaBuildingDao {
    @Override
    public QueryWrapper<AreaBuilding> getWrapper(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<AreaBuilding> selectAllByAreaId(Long areaId) {
        AreaBuildingExample example = new AreaBuildingExample();
        example.or().andAreaIdEqualTo(areaId);
        return baseDao().selectByExample(example);
    }
}