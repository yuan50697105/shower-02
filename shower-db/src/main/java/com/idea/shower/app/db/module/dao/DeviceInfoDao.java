package com.idea.shower.app.db.module.dao;

import com.idea.shower.app.db.commons.dao.BaseDao;
import com.idea.shower.app.db.module.pojo.DeviceInfo;
import com.idea.shower.app.db.module.pojo.query.DeviceInfoQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;

import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-28 12:42
 */
public interface DeviceInfoDao extends BaseDao<DeviceInfo> {
    /**
     * @param deviceId
     * @return
     */
    Optional<DeviceInfo> getById(Long deviceId);

    /**
     * @param condition
     * @return
     */
    PageResult<DeviceInfo> selectPage(DeviceInfoQuery condition);

    /**
     * 获取设备列表
     *
     * @author finch
     * @date: 2020/3/24
     */
    PageResult<DeviceInfo> selectAll(DeviceInfoQuery deviceInfoQuery);

    /**
     * @param code
     * @return
     */
    Optional<DeviceInfo> getByCode(String code);

    /**
     * 更新设备为使用中
     *
     * @param deviceId
     */
    void updateStatusToUsing(Long deviceId);

    /**
     * @param deviceCode
     * @return
     */
    Optional<DeviceInfo> getByCodeAvailable(String deviceCode);

    /**
     * @param deviceInfo
     * @return
     */
    int insert(DeviceInfo deviceInfo);

    /**
     * @param deviceInfo 设备信息
     */
    void update(DeviceInfo deviceInfo);

    void delete(Long id);

    List<DeviceInfo> selectList(DeviceInfoQuery query);
}
