package com.idea.shower.app.db.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.AreaInfoDao;
import com.idea.shower.app.db.module.mapper.AreaInfoMapper;
import com.idea.shower.app.db.module.pojo.AreaInfo;
import com.idea.shower.app.db.module.pojo.AreaInfoExample;
import com.idea.shower.app.db.module.pojo.query.AreaInfoQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 10:52
 */
@Component
@AllArgsConstructor
public class AreaInfoDaoImpl extends BaseDaoImpl<AreaInfo, AreaInfoMapper> implements AreaInfoDao {
    @Override
    public List<AreaInfo> selectAll() {
        AreaInfoExample example = new AreaInfoExample();
        return baseMapper().selectByExample(example);
    }

    @Override
    public PageResult<AreaInfo> selectPageByQuery(AreaInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new PageResult<>(new PageInfo<>(baseMapper().selectByQuery(query)));
    }

    @Override
    public List<AreaInfo> selectListByQuery(AreaInfoQuery query) {
        return baseMapper().selectByQuery(query);
    }

    @Override
    public AreaInfo get(Long id) {
        return baseMapper().selectByPrimaryKey(id);
    }

    @Override
    public int insert(AreaInfo areaInfo) {
        return baseMapper().insert(areaInfo);
    }
}