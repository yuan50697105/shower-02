package com.idea.shower.app.db.module.dao;

import com.idea.shower.db.mybaits.pojo.PageResult;
import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.DeviceInfo;
import com.idea.shower.app.db.module.pojo.DeviceInfoQuery;

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
}
