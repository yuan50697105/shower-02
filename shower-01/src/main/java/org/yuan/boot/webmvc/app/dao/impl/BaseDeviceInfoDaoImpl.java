package org.yuan.boot.webmvc.app.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.webmvc.app.dao.BaseDeviceInfoDao;
import org.yuan.boot.webmvc.app.mapper.BaseDeviceInfoMapper;
import org.yuan.boot.webmvc.app.pojo.BaseDeviceInfo;

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
