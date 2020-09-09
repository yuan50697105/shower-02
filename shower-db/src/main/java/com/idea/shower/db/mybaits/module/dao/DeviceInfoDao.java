package com.idea.shower.db.mybaits.module.dao;

import com.idea.shower.db.mybaits.base.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import com.idea.shower.db.mybaits.module.pojo.query.DeviceInfoQuery;

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
     * 获取设备信息
     *
     * @param deviceId 设备ID
     * @return
     */
    Optional<DeviceInfo> getByIdOpt(Long deviceId);

    /**
     * 设备分页数据
     *
     * @param condition 查询条件
     * @return 分页数据
     */
    PageResult<DeviceInfo> selectPage(DeviceInfoQuery condition);

    List<DeviceInfo> selectList(DeviceInfoQuery query);

    /**
     * 获取设备列表
     *
     * @author finch
     * @date: 2020/3/24
     */
    PageResult<DeviceInfo> selectAll(DeviceInfoQuery deviceInfoQuery);

    /**
     * 通过编号获取设备信息
     *
     * @param code 设备编号
     * @return 设备新
     */
    Optional<DeviceInfo> getByCode(String code);

    /**
     * 获取可用设备信息
     * @param deviceCode 设备编号
     * @return 设备信息
     */
    Optional<DeviceInfo> getByCodeAvailable(String deviceCode);

    /**
     * 添加设备信息
     *
     * @param deviceInfo 设备信息实体
     * @return 受影响行数
     */
    int insert(DeviceInfo deviceInfo);

    /**
     * 更新设备信息
     *
     * @param deviceInfo 设备信息
     */
    void update(DeviceInfo deviceInfo);

    /**
     * 删除设备信息
     *
     * @param id id
     */
    void delete(Long id);

    /**
     * 更新状态到可用状态
     *
     * @param deviceId 设备ID
     */
    void updateStatusToAvail(Long deviceId);

    /**
     * 更新设备为使用中
     *
     * @param deviceId 设备ID
     */
    void updateStatusToUsing(Long deviceId);
}
