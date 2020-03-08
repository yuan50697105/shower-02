package com.idea.shower.shower.app.db.dao;

import com.idea.shower.db.mybaits.pojo.PageResult;
import com.idea.shower.shower.app.commons.dao.BaseDao;
import com.idea.shower.shower.app.db.pojo.DeviceInfo;
import com.idea.shower.shower.app.db.pojo.DeviceInfoQueryBaseConditionQuery;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-28 12:42
 */
public interface DeviceInfoDao extends BaseDao<DeviceInfo> {
    Optional<DeviceInfo> getById(Long deviceId);

    PageResult<DeviceInfo> selectPage(DeviceInfoQueryBaseConditionQuery condition);
}
