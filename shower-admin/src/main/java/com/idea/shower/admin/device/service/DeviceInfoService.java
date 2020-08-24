package com.idea.shower.admin.device.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.app.db.module.pojo.query.DeviceInfoQuery;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 17:01
 */
public interface DeviceInfoService {
    /**
     * 添加设备
     *
     * @param deviceInfoVo 表单处理
     * @return 通知结果
     */
    Result<?> add(DeviceInfoVo deviceInfoVo);

    /**
     * @param deviceInfoVo 表单处理
     * @return 通知结果
     */
    Result<?> modify(DeviceInfoVo deviceInfoVo);

    /**
     * 删除设备
     *
     * @param id 主键
     * @return 通知结果
     */
    Result<?> delete(Long id);

    /**
     * 通过Id获取设备信息
     *
     * @param id ID
     * @return 通知结果
     */
    Result<?> getById(Long id);

    /**
     * 分页查询
     *
     * @param query 条件封装
     * @return 通知结果，分页
     */
    Result<?> data(DeviceInfoQuery query);

    /**
     * 列表查询
     *
     * @param query 条件封装
     * @return 通知结果，列表
     */
    Result<?> list(DeviceInfoQuery query);

    Result<?> delete(List<Long> id);
}
