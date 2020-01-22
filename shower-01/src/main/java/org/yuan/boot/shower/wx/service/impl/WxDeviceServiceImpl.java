package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.utils.PageResults;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.DeviceInfoDao;
import org.yuan.boot.shower.db.pojo.DeviceInfoCondition;
import org.yuan.boot.shower.wx.service.WxDeviceService;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 22:56
 */
@Service
@AllArgsConstructor
public class WxDeviceServiceImpl implements WxDeviceService {
    private DeviceInfoDao deviceInfoDao;

    @Override
    public Result nearList(String point) {
        DeviceInfoCondition condition = new DeviceInfoCondition().setEnabled(1).setPoint(point);
        return Results.data(deviceInfoDao.selectPageByCondition(condition));
    }

    @Override
    public Result getDeviceInfo(Long id) {
        return Results.data(deviceInfoDao.getById(id));
    }

}