package org.yuan.boot.shower.db.dao;

import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.DeviceOrderInfo;
import org.yuan.boot.shower.db.pojo.DeviceOrderInfoCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:13
 */
public interface DeviceOrderInfoDao extends BaseDao<DeviceOrderInfo> {
    PageResult<DeviceOrderInfo> selectPage(DeviceOrderInfoCondition condition);
}
