package com.idea.shower.admin.dashboard.dao;

import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import io.renren.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DashboardDao extends BaseDao<DeviceInfo> {
    /**
     * 获取设备数量
     * @return
     */
    Integer getDeviceNum();

    /**
     * 获取客户数量
     * @return
     */
    Integer getPeopleNum();

    /**
     * 获取楼宇数量
     * @return
     */
    Integer getBuildingNum();

    /**
     * 获取订单数量
     * @return
     */
    Integer getOrderNum();

    /**
     * 统计月份订单量
     * @return
     */
    List<Map<String, Object>> monthOrderData();

    /**
     * 根据设备获取订单统计
     * @return
     */
    List<Map<String, Object>> deviceOrderData();
}
