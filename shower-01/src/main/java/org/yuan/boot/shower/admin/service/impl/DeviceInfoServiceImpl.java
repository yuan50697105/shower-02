package org.yuan.boot.shower.admin.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.admin.converter.DeviceInfoConverter;
import org.yuan.boot.shower.admin.pojo.DeviceInfoVO;
import org.yuan.boot.shower.admin.service.DeviceInfoService;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.DeviceInfoDao;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.db.pojo.DeviceInfoCondition;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:16
 */
@Service
@AllArgsConstructor
@Log4j2
public class DeviceInfoServiceImpl implements DeviceInfoService {
    private DeviceInfoDao deviceInfoDao;
    private DeviceInfoConverter deviceInfoConverter;

    @Override
    public Result data(DeviceInfoCondition condition) {
        return Results.data(deviceInfoDao.selectPageByCondition(condition));
    }

    @Override
    public Result list(DeviceInfoCondition condition) {
        return Results.data(deviceInfoDao.selectListByCondition(condition));
    }

    @Override
    public Result get(Long id) {
        return Results.data(deviceInfoDao.getById(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(DeviceInfoVO deviceInfoVO) {
        DeviceInfo deviceInfo = deviceInfoConverter.convertForSave(deviceInfoVO);
        deviceInfoDao.save(deviceInfo);
        return null;
    }

}