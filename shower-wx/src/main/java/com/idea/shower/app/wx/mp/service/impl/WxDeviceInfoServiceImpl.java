package com.idea.shower.app.wx.mp.service.impl;

import cn.hutool.core.util.StrUtil;
import com.idea.shower.app.wx.mp.service.WxDeviceInfoService;
import com.idea.shower.commons.utils.ResourceFileUtils;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import com.idea.shower.db.mybaits.module.pojo.query.DeviceInfoQuery;
import com.idea.shower.commons.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 15:24
 */
@Service
@AllArgsConstructor
public class WxDeviceInfoServiceImpl implements WxDeviceInfoService {
    private final DeviceInfoDao deviceInfoDao;
    private final ResourceFileUtils resourceFileUtils;

    /**
     * @Author finch
     * @Description 获取设备列表
     * @date: 8:50 2020/3/24
     */
    @Override
    public Result deviceInfoList(DeviceInfoQuery deviceInfoQuery) {
        deviceInfoQuery.setPlatform(DeviceInfoQuery.Platform.WX);
        return ResultUtils.data(deviceInfoDao.selectAll(deviceInfoQuery));
    }

    @Override
    public Result sendInfo(String l) {
        Optional<DeviceInfo> deviceInfo = deviceInfoDao.getByIdOpt(Long.valueOf(l));
        DeviceInfo info = deviceInfo.get();
        info.setPicture(resourceFileUtils.filePath(StrUtil.isNotBlank(info.getPicture()) ? info.getPicture() : ""));
        return ResultUtils.ok().setData(deviceInfo.get());
    }
}