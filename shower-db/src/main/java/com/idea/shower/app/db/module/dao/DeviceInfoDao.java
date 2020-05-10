package com.idea.shower.app.db.module.dao;

import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.DeviceInfo;
import com.idea.shower.app.db.module.pojo.query.DeviceInfoQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-28 12:42
 */
public interface DeviceInfoDao extends BaseDao<DeviceInfo> {
    Optional<DeviceInfo> getById(Long deviceId);

    PageResult<DeviceInfo> selectPage(DeviceInfoQuery condition);

    /**
    *获取设备列表
    *@author finch
    *@date: 2020/3/24
    */
    PageResult<DeviceInfo> selectAll(DeviceInfoQuery deviceInfoQuery);

    Optional<DeviceInfo> getByCode(String code);

    /**
     * 更新设备为使用中
     * @param deviceId
     */
    void updateStatusToUsing(Long deviceId);

    Optional<DeviceInfo> getByCodeAvailable(String deviceCode);
}
