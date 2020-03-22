package com.idea.shower.app.wx.mp.service.impl;

import com.idea.shower.app.db.module.dao.AreaBuildingDao;
import com.idea.shower.app.db.module.dao.AreaInfoDao;
import com.idea.shower.app.db.module.dao.DeviceInfoDao;
import com.idea.shower.app.wx.mp.service.WxAreaInfoService;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 11:00
 */
@Service
@Transactional(rollbackFor = Exception.class)
@AllArgsConstructor
public class WxAreaInfoServiceImpl implements WxAreaInfoService {
    private AreaInfoDao areaInfoDao;
    private AreaBuildingDao areaBuildingDao;

    /**
     * 获取所有的区域信息
     *
     * @return 区域信息列表
     */
    @Override
    public Result areaInfoList() {
        return ResultUtils.data(areaInfoDao.selectAll());
    }

    /**
     * 根据区域信息ID获取所有楼宇信息
     *
     * @param areaId 区域ID
     *
     * @return
     */
    @Override
    public Result areaBuildingList(Long areaId) {
        return ResultUtils.data(areaBuildingDao.selectAllByAreaId(areaId));
    }
}