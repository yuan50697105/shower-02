package org.yuan.boot.shower.db.dao;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.shower.commons.dao.BaseDao;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.db.pojo.DeviceInfoCondition;

import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:12
 */
public interface DeviceInfoDao extends BaseDao<DeviceInfo> {
    PageResult<DeviceInfo> selectPageByCondition(DeviceInfoCondition condition);

    List<DeviceInfo> selectListByCondition(DeviceInfoCondition condition);

    Optional<DeviceInfo> getById(Long id);

    void save(DeviceInfo deviceInfo);
}
