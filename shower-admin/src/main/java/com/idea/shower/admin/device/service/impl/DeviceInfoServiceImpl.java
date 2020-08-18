package com.idea.shower.admin.device.service.impl;

import ai.yue.library.base.exception.ResultException;
import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.admin.device.service.DeviceInfoService;
import com.idea.shower.app.db.module.dao.DeviceInfoDao;
import com.idea.shower.app.db.module.pojo.DeviceInfo;
import com.idea.shower.app.db.module.pojo.query.DeviceInfoQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 16:58
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class DeviceInfoServiceImpl implements DeviceInfoService {
    private final DeviceInfoDao deviceInfoDao;


    /**
     * 添加设备
     *
     * @param deviceInfoVo 表单处理
     * @return 通知结果
     */
    @Override
    @Transactional
    public Result<?> add(DeviceInfoVo deviceInfoVo) {
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.copyFrom(deviceInfoVo);
        checkExist(deviceInfo);
        deviceInfoDao.insert(deviceInfo);
        return ResultInfo.success();
    }

    /**
     * 更新设备信息
     *
     * @param deviceInfoVo 表单处理
     * @return 通知结果
     */
    @Override
    @Transactional
    public Result<?> modify(DeviceInfoVo deviceInfoVo) {
        Optional<DeviceInfo> optional = deviceInfoDao.getById(deviceInfoVo.getId());
        if (optional.isPresent()) {
            DeviceInfo deviceInfo = optional.get();
            deviceInfo.copyFrom(deviceInfo, "id", "code");
            deviceInfoDao.update(deviceInfo);
        }
        return ResultInfo.success();
    }

    /**
     * 删除设备信息
     *
     * @param id 主键
     * @return
     */
    @Override
    @Transactional
    public Result<?> delete(Long id) {
        checkDelete(id);
        deviceInfoDao.delete(id);
        return ResultInfo.success();
    }

    @Override
    public Result<?> getById(Long id) {
        Optional<DeviceInfo> deviceInfo = deviceInfoDao.getById(id);
        return ResultInfo.success(deviceInfo);
    }

    @Override
    public Result<?> data(DeviceInfoQuery query) {
        PageResult<DeviceInfo> pageResult = deviceInfoDao.selectPage(query);
        return ResultInfo.success(pageResult);
    }

    @Override
    public Result<?> list(DeviceInfoQuery query) {
        return ResultInfo.success(deviceInfoDao.selectList(query));
    }

    /**
     * 检查设备是否存在
     *
     * @param deviceInfo 设备信息
     */
    private void checkExist(DeviceInfo deviceInfo) {
        Optional<DeviceInfo> optional = deviceInfoDao.getByCode(deviceInfo.getCode());
        if (optional.isPresent()) {
            throw new ResultException(ResultInfo.param_check_not_pass(deviceInfo.getCode() + "已存在"));
        }
    }

    /**
     * 检查设备是否可以删除
     *
     * @param id 主键
     */
    private void checkDelete(Long id) {
//        throw new ResultException(ResultInfo.dev_defined(""));
    }

}