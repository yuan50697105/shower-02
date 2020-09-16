package com.idea.shower.admin.dashboard.service;

import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import io.renren.common.service.CrudService;
import io.renren.common.utils.Result;


/**
 * @author finch
 */
public interface DashboardService extends CrudService<DeviceInfo, DeviceInfoVo> {

    /**
     * 后去首页色块信息
     * @return
     */
    Result informationNumber();

    /**
     * 根据月份统计
     * @return
     */
    Result monthOrderData();

    /**
     * 根据设备获取订单统计
     * @return
     */
    Result deviceOrderData();
}
