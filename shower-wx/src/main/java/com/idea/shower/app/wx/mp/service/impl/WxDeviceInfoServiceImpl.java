package com.idea.shower.app.wx.mp.service.impl;

import com.idea.shower.app.db.module.dao.DeviceInfoDao;
import com.idea.shower.app.db.module.pojo.query.DeviceInfoQuery;
import com.idea.shower.app.wx.mp.service.WxDeviceInfoService;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 15:24
 */
@Service
@AllArgsConstructor
public class WxDeviceInfoServiceImpl implements WxDeviceInfoService {
    private DeviceInfoDao deviceInfoDao;

    /**
    *@Author finch
    *@Description 获取设备列表
    *@date: 8:50 2020/3/24
    */
    @Override
    public Result deviceInfoList(DeviceInfoQuery deviceInfoQuery) {
        return ResultUtils.data(deviceInfoDao.selectAll(deviceInfoQuery));
    }
}