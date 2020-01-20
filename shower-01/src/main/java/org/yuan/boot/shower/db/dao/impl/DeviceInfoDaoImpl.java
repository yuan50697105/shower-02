package org.yuan.boot.shower.db.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.DeviceInfoDao;
import org.yuan.boot.shower.db.mapper.DeviceInfoMapper;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.db.pojo.DeviceInfoCondition;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:12
 */
@Component
@AllArgsConstructor
public class DeviceInfoDaoImpl extends BaseDaoImpl<DeviceInfo, DeviceInfoMapper> implements DeviceInfoDao {
    @Override
    public PageInfo<DeviceInfo> selectPage(DeviceInfoCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return PageInfo.of(baseMapper().selectByCondition(condition));
    }

    @Override
    public Optional<DeviceInfo> getById(String id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }
}