package com.idea.shower.admin.device.service.impl;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.admin.device.service.DeviceInfoService;
import com.idea.shower.commons.qcode.QCodeService;
import com.idea.shower.commons.storage.CommonsOssService;
import com.idea.shower.commons.storage.StorageProperties;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import com.idea.shower.db.mybaits.module.mapper.DeviceInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import com.idea.shower.db.mybaits.module.pojo.query.DeviceInfoQuery;
import io.renren.common.service.impl.CrudServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.minbox.framework.api.boot.storage.response.ApiBootObjectStorageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;
import java.util.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 16:58
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
@Slf4j
public class DeviceInfoServiceImpl extends CrudServiceImpl<DeviceInfoMapper, DeviceInfo, DeviceInfoVo> implements DeviceInfoService {


    @Autowired
    private DeviceInfoDao deviceInfoDao;

    @Autowired(required = false)
    private QCodeService qCodeService;

    @Autowired
    private CommonsOssService ossService;
    @Autowired
    private StorageProperties storageProperties;

    @Override
    public QueryWrapper<DeviceInfo> getWrapper(Map<String, Object> params) {
        String orderNo = (String) params.get("orderNo");

        QueryWrapper<DeviceInfo> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(orderNo), "order_no", orderNo);

        return wrapper;
    }

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
     * 检查是否存在
     *
     * @param deviceInfo
     */
    private void checkExist(DeviceInfo deviceInfo) {
        deviceInfoDao.getByCodeOpt(deviceInfo.getCode()).orElseThrow();
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
        String pictureUrl = deviceInfoDao.getByIdOpt(deviceInfoVo.getId()).map(DeviceInfo::getPictureUrl).orElse("");
        ApiBootObjectStorageResponse response = qCodeService.createGoodShareImageResponse(deviceInfoVo.getId().toString(), pictureUrl, deviceInfoVo.getDeviceName());
        DeviceInfoVo infoVo = get(deviceInfoVo.getId());
        if (infoVo == null) {
            return ResultInfo.error("未找到设备");
        } else {
            //修改
            infoVo.setQrPictureUrl(response.getObjectUrl());
            infoVo.setQrPicture(response.getObjectName());
            update(infoVo);
            return ResultInfo.success();
        }


        /**
         * 检查设备是否存在
         *
         * @param deviceInfo 设备信息
         */


    }

    @Override
    public Map<String, Object> downPicture(Long id) {
        String qrPicture = deviceInfoDao.getByIdOpt(id).map(DeviceInfo::getQrPicture).orElse(null);
        String path = storageProperties.getDownloadPath() + qrPicture;
        InputStream inputStream = ossService.downloadFile(Objects.requireNonNull(qrPicture).replaceAll("/", ""));
        HashMap<String, Object> map = new HashMap<>();
        map.put("fileName", qrPicture);
        map.put("stream", inputStream);
        return map;
    }


    /**
     * 删除检查
     *
     * @param id
     */
    private void checkDelete(Long id) {

    }
}