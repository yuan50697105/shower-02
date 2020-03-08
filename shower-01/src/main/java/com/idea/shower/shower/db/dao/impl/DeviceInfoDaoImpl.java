package com.idea.shower.shower.db.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.idea.shower.db.mybaits.pojo.PageResult;
import com.idea.shower.shower.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.shower.db.dao.DeviceInfoDao;
import com.idea.shower.shower.db.mapper.DeviceInfoMapper;
import com.idea.shower.shower.db.pojo.DeviceInfo;
import com.idea.shower.shower.db.pojo.DeviceInfoQueryBase;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-28 12:42
 */
@Component
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class DeviceInfoDaoImpl extends BaseDaoImpl<DeviceInfo, DeviceInfoMapper> implements DeviceInfoDao {
    @Override
    public Optional<DeviceInfo> getById(Long deviceId) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(deviceId));
    }

    @Override
    public PageResult<DeviceInfo> selectPage(DeviceInfoQueryBase condition) {
        return pageResult(condition, baseMapper()::selectByCondition);
    }

}