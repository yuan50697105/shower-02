package org.yuan.boot.shower.db.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.DeviceInfoDao;
import org.yuan.boot.shower.db.mapper.DeviceInfoMapper;
import org.yuan.boot.shower.db.pojo.DeviceInfo;

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
}