package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.dao.AreaBuildingDao;
import com.idea.shower.db.mybaits.module.mapper.AreaBuildingMapper;
import com.idea.shower.db.mybaits.module.mapper.query.AreaBuildingQueryMapper;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;
import com.idea.shower.db.mybaits.module.pojo.AreaBuildingExample;
import com.idea.shower.db.mybaits.module.pojo.ao.AreaBuildingAo;
import com.idea.shower.db.mybaits.module.pojo.query.AreaBuildingQuery;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
public class AreaBuildingDaoImpl extends CommonsDaoImpl<AreaBuilding, AreaBuilding, AreaBuildingMapper> implements AreaBuildingDao {
    @Autowired
    private AreaBuildingQueryMapper areaBuildingQueryMapper;

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

    @Override
    public IPage<AreaBuildingAo> selectPageByQuery(IPage<AreaBuilding> page, AreaBuildingQuery query) {
        return areaBuildingQueryMapper.selectPageByQuery(page, query);
    }
}