package com.idea.shower.app.db.module.dao.impl;

import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.AreaInfoDao;
import com.idea.shower.app.db.module.mapper.AreaInfoMapper;
import com.idea.shower.app.db.module.pojo.AreaInfo;
import com.idea.shower.app.db.module.pojo.AreaInfoExample;
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
}