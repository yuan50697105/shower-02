package com.idea.shower.admin.dashboard.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.admin.dashboard.dao.DashboardDao;
import com.idea.shower.admin.dashboard.service.DashboardService;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.utils.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author finch
 */
@Service
public class DashboardServiceImpl extends CrudServiceImpl<DashboardDao, DeviceInfo, DeviceInfoVo> implements DashboardService {
    @Override
    public QueryWrapper<DeviceInfo> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<DeviceInfo> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    @Override
    public Result informationNumber() {
        Map<String,Object> map = new HashMap<>();
        //获取设备数量
        Integer deviceNum = baseDao.getDeviceNum();
        Integer peopleNum = baseDao.getPeopleNum();
        Integer buildingNum = baseDao.getBuildingNum();
        Integer orderNum = baseDao.getOrderNum();
        map.put("deviceNum",deviceNum);
        map.put("peopleNum",peopleNum);
        map.put("buildingNum",buildingNum);
        map.put("orderNum",orderNum);
        return new Result().ok(map);
    }

    @Override
    public Result monthOrderData() {
        List<Map<String,Object>> mapList = baseDao.monthOrderData();
        return new Result().ok(mapList);
    }

    @Override
    public Result deviceOrderData() {
        List<Map<String,Object>> mapList = baseDao.deviceOrderData();
        return new Result().ok(mapList);
    }
}
