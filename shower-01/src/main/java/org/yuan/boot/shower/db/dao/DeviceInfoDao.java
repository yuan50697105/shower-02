package org.yuan.boot.shower.db.dao;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.db.pojo.DeviceInfoCondition;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:12
 */
public interface DeviceInfoDao extends BaseDao<DeviceInfo> {
    PageInfo<DeviceInfo> selectPage(DeviceInfoCondition condition);

    Optional<DeviceInfo> getById(String id);
}
