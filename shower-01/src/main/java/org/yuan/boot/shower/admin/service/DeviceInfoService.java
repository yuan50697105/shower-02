package org.yuan.boot.shower.admin.service;

import org.yuan.boot.shower.admin.pojo.DeviceInfoVO;
import org.yuan.boot.shower.db.pojo.DeviceInfoCondition;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:16
 */
public interface DeviceInfoService {
    Result data(DeviceInfoCondition condition);

    Result list(DeviceInfoCondition condition);

    Result get(Long id);

    Result save(DeviceInfoVO deviceInfoVO);

    Result update(DeviceInfoVO deviceInfoVO);

    Result delete(Long id);

    Result delete(List<Long> ids);
}
