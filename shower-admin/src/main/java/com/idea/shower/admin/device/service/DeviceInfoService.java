package com.idea.shower.admin.device.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.device.pojo.DeviceInfoVo;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import com.idea.shower.db.mybaits.module.pojo.query.DeviceInfoQuery;
import io.renren.common.service.BaseService;
import io.renren.common.service.CrudService;

import java.util.List;
import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 17:01
 */
public interface DeviceInfoService extends CrudService<DeviceInfo,DeviceInfoVo> {
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

    /**
     * @Description 
     * @Param 生成二维码图片
     * @Author finch
     * @Date 2020/8/30 12:36
     **/
    
    Result<?> QRCode(DeviceInfoVo deviceInfoVo);

    Map<String, Object> downPicture(Long id);
}
