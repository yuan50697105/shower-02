package com.idea.shower.app.db.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.constants.DeviceInfoConstants;
import com.idea.shower.app.db.module.dao.DeviceInfoDao;
import com.idea.shower.app.db.module.mapper.DeviceInfoMapper;
import com.idea.shower.app.db.module.pojo.DeviceInfo;
import com.idea.shower.app.db.module.pojo.DeviceInfoExample;
import com.idea.shower.app.db.module.pojo.query.DeviceInfoQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-28 12:42
 */
@Component
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class DeviceInfoDaoImpl extends BaseDaoImpl<DeviceInfo, DeviceInfoMapper> implements DeviceInfoDao {

    @Override
    public Optional<DeviceInfo> getById(Long deviceId) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(deviceId));
    }

    @Override
    public PageResult<DeviceInfo> selectPage(DeviceInfoQuery condition) {
        PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        return pageResult(PageInfo.of(baseMapper().selectByCondition(condition)));
    }

    @Override
    public PageResult<DeviceInfo> selectAll(DeviceInfoQuery deviceInfoQuery) {
        DeviceInfoExample example = new DeviceInfoExample();
        DeviceInfoExample.Criteria criteria = example.or();
        if (!StringUtils.isEmpty(deviceInfoQuery.getAreaId())) {
            criteria.andAreaIdEqualTo(deviceInfoQuery.getAreaId());
        }
        if (!StringUtils.isEmpty(deviceInfoQuery.getCode())) {
            criteria.andCodeLike("%" + deviceInfoQuery.getCode().trim() + "%");
        }
        //启用状态标识2：全部；0：未启用；1：已启用
        int allStatus = DeviceInfoConstants.DeviceRunningStatus.ALL_STATUS;
        if (!StringUtils.isEmpty(deviceInfoQuery.getEnabled()) && deviceInfoQuery.getEnabled().intValue() != allStatus) {
            criteria.andEnabledEqualTo(deviceInfoQuery.getEnabled());
        }
        PageHelper.startPage(deviceInfoQuery.getPage(), deviceInfoQuery.getLimit());
        return pageResult(PageInfo.of(baseMapper().selectByExample(example)));
    }

    @Override
    public Optional<DeviceInfo> getByCode(String code) {
        return Optional.ofNullable(baseMapper().selectOneByCode(code));
    }

}