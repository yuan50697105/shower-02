package org.yuan.boot.shower.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.shower.dao.BaseDeviceInfoDao;
import org.yuan.boot.shower.mapper.BaseDeviceInfoMapper;
import org.yuan.boot.shower.pojo.BaseDeviceInfo;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 14:55
 **/
@Component
@AllArgsConstructor
public class BaseDeviceInfoDaoImpl extends BaseDaoImpl<BaseDeviceInfo, BaseDeviceInfoMapper> implements BaseDeviceInfoDao {

}
