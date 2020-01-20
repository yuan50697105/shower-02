package org.yuan.boot.shower.db.dao.impl;

import org.springframework.stereotype.Component;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.DeviceInfoDao;
import org.yuan.boot.shower.db.mapper.DeviceInfoMapper;
import org.yuan.boot.shower.db.pojo.DeviceInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:12
 */
@Component
public class DeviceInfoDaoImpl extends BaseDaoImpl<DeviceInfo, DeviceInfoMapper> implements DeviceInfoDao {
}