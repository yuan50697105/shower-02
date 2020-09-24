package com.idea.shower.admin.device.service.impl;

import ai.yue.library.base.exception.ResultException;
import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.admin.device.service.DeviceInfoService;
import com.idea.shower.commons.qcode.QCodeService;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import com.idea.shower.db.mybaits.module.pojo.query.DeviceInfoQuery;
import org.minbox.framework.api.boot.oss.ApiBootOssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 16:58
 */
@Service
//@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class DeviceInfoServiceImpl implements DeviceInfoService {

    @Autowired
    private DeviceInfoDao deviceInfoDao;

    @Autowired(required = false)
    private QCodeService qCodeService;
    @Autowired
    private ApiBootOssService ossService;

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
        Optional<DeviceInfo> optional = deviceInfoDao.getByIdOpt(deviceInfoVo.getId());
        if (optional.isPresent()) {
            DeviceInfo deviceInfo = optional.get();
            deviceInfo.copyFrom(deviceInfoVo, "id", "code");
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
    @Transactional(propagation = Propagation.REQUIRED)
    public Result<?> delete(Long id) {
        checkDelete(id);
        deviceInfoDao.delete(id);

        return ResultInfo.success("success");
    }

    @Override
    public Result<?> getById(Long id) {
        Optional<DeviceInfo> deviceInfo = deviceInfoDao.getByIdOpt(id);
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

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Result<?> delete(List<Long> id) {
        id.forEach(this::delete);
        return ResultInfo.success();
    }

    @Override
    public Result<?> QRCode(DeviceInfoVo deviceInfoVo) {
        String url = qCodeService.createGoodShareImage(deviceInfoVo.getId().toString(), deviceInfoVo.getPicture(), deviceInfoVo.getDeviceName());
        System.out.println(url);
        return null;
    }

    @Override
    public InputStream downPicture(Long id) {
        String picture = deviceInfoDao.getByIdOpt(id).map(DeviceInfo::getPicture).orElse(null);
        ossService.download(picture, picture);

        return null;
    }

    /**
     * 检查设备是否存在
     *
     * @param deviceInfo 设备信息
     */
    private void checkExist(DeviceInfo deviceInfo) {
        Optional<DeviceInfo> optional = deviceInfoDao.getByCodeOpt(deviceInfo.getCode());
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