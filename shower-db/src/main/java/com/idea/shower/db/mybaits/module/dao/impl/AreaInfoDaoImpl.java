package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.dao.AreaInfoDao;
import com.idea.shower.db.mybaits.module.mapper.AreaInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.AreaInfo;
import com.idea.shower.db.mybaits.module.pojo.AreaInfoExample;
import com.idea.shower.db.mybaits.module.pojo.query.AreaInfoQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 10:52
 */
@Component
@AllArgsConstructor
public class AreaInfoDaoImpl extends CommonsDaoImpl<AreaInfo, AreaInfoMapper> implements AreaInfoDao {
    @Override
    public QueryWrapper<AreaInfo> getWrapper(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<AreaInfo> selectAll() {
        AreaInfoExample example = new AreaInfoExample();
        return baseDao().selectByExample(example);
    }

    @Override
    public PageResult<AreaInfo> selectPageByQuery(AreaInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        return new PageResult<>(new PageInfo<>(baseDao().selectByQuery(query)));
    }

    @Override
    public List<AreaInfo> selectListByQuery(AreaInfoQuery query) {
        return baseDao().selectByQuery(query);
    }

    @Override
    public AreaInfo get(Long id) {
        return baseDao().selectByPrimaryKey(id);
    }

}