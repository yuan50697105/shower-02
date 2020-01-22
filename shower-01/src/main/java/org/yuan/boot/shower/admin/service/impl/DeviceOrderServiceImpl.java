package org.yuan.boot.shower.admin.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.shower.admin.service.DeviceOrderService;
import org.yuan.boot.shower.db.dao.DeviceOrderInfoDao;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.db.pojo.DeviceOrderInfo;
import org.yuan.boot.shower.db.pojo.DeviceOrderInfoCondition;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:18
 */
@Service
@AllArgsConstructor
@Log4j2
public class DeviceOrderServiceImpl implements DeviceOrderService {
    private DeviceOrderInfoDao deviceOrderInfoDao;

    @Override
    public Result data(DeviceOrderInfoCondition condition) {
        PageResult<DeviceOrderInfo> pageResult = deviceOrderInfoDao.selectPage(condition);
        return null;
    }
}