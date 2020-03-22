package com.idea.shower.app.wx.mp.service.impl;

import com.idea.shower.app.db.module.dao.AreaBuildingDao;
import com.idea.shower.app.db.module.dao.AreaInfoDao;
import com.idea.shower.app.db.module.dao.DeviceInfoDao;
import com.idea.shower.app.db.module.pojo.AreaBuilding;
import com.idea.shower.app.db.module.pojo.AreaInfo;
import com.idea.shower.app.wx.mp.service.WxDeviceInfoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-22 11:00
 */
@Service
@Transactional(rollbackFor = Exception.class)
@AllArgsConstructor
public class WxDeviceInfoServiceImpl implements WxDeviceInfoService {
    private DeviceInfoDao deviceInfoDao;
    private AreaInfoDao areaInfoDao;
    private AreaBuildingDao areaBuildingDao;

    /**
     * 获取所有的区域信息
     *
     * @return 区域信息列表
     */
    public List<AreaInfo> areaInfoList() {
        return areaInfoDao.selectAll();
    }

    /**
     * 根据区域信息ID获取所有楼宇信息
     *
     * @param areaId 区域ID
     *
     * @return
     */
    public List<AreaBuilding> areaBuildingList(Long areaId) {
        return areaBuildingDao.selectAllByAreaId(areaId);
    }
}