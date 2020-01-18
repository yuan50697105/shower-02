package org.yuan.boot.shower.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.shower.dao.BaseDeviceInfoDao;
import org.yuan.boot.shower.pojo.converter.BaseDeviceInfoConverter;
import org.yuan.boot.shower.service.BaseDeviceInfoService;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 14:58
 **/
@Service
@AllArgsConstructor
public class BaseDeviceInfoServiceImpl implements BaseDeviceInfoService {
    private BaseDeviceInfoConverter baseDeviceInfoConverter;
    private BaseDeviceInfoDao baseDeviceInfoDao;
}
