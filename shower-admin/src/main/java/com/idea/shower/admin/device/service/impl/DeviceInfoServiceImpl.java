package com.idea.shower.admin.device.service.impl;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.admin.device.service.DeviceInfoService;
import com.idea.shower.app.db.module.dao.DeviceInfoDao;
import com.idea.shower.app.db.module.pojo.DeviceInfo;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 16:58
 */
@Service
@Data
public class DeviceInfoServiceImpl implements DeviceInfoService {
    private DeviceInfoDao deviceInfoDao;


    @Override
    public Result<?> add(DeviceInfoVo deviceInfoVo) {
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.copyFrom(deviceInfoVo);
        checkExist(deviceInfo);
        deviceInfoDao.insert(deviceInfo);
        return ResultInfo.success();
    }

    /**
     * 检查设备是否存在
     *
     * @param deviceInfo 设备信息
     */
    private void checkExist(DeviceInfo deviceInfo) {

    }

}