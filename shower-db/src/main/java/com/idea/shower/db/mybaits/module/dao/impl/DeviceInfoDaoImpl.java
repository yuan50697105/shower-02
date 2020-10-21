package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.constants.DeviceInfoConstants;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoDao;
import com.idea.shower.db.mybaits.module.mapper.DeviceInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfoExample;
import com.idea.shower.db.mybaits.module.pojo.query.DeviceInfoQuery;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;
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
public class DeviceInfoDaoImpl extends CommonsDaoImpl<DeviceInfo,DeviceInfo, DeviceInfoMapper> implements DeviceInfoDao {
    @Override
    public QueryWrapper<DeviceInfo> getWrapper(Map<String, Object> params) {
        return null;
    }


    @Override
    public Optional<DeviceInfo> getByIdOpt(Long deviceId) {
        return Optional.ofNullable(baseDao().selectById(deviceId));
    }

    @Override
    public PageResult<DeviceInfo> selectPage(DeviceInfoQuery condition) {
        PageHelper.startPage(condition.getPage(), condition.getLimit());
        return pageResult(PageInfo.of(baseDao().selectByCondition(condition)));
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
        criteria.andRunStatusEqualTo(DeviceInfoConstants.DeviceRunningStatus.AVALI);
        //启用状态标识2：全部；0：未启用；1：已启用
        int allStatus = DeviceInfoConstants.DeviceRunningStatus.ALL_STATUS;
        if (!StringUtils.isEmpty(deviceInfoQuery.getEnabled()) && deviceInfoQuery.getEnabled().intValue() != allStatus) {
            criteria.andEnabledEqualTo(deviceInfoQuery.getEnabled());
        }
        PageHelper.startPage(deviceInfoQuery.getPage(), deviceInfoQuery.getLimit());
        return pageResult(PageInfo.of(baseDao().selectByExample(example)));
    }

    @Override
    public Optional<DeviceInfo> getByCodeOpt(String code) {
        return Optional.ofNullable(baseDao().selectOneByCode(code));
    }

    @Override
    public void updateStatusToUsing(Long deviceId) {
        baseDao().updateRunStatusById(DeviceInfoConstants.DeviceRunningStatus.RUNNING, deviceId);
    }

    @Override
    public Optional<DeviceInfo> getByCodeAvailable(String deviceCode) {
        return Optional.ofNullable(baseDao().getOneByCodeAndRunStatus(deviceCode, DeviceInfoConstants.DeviceRunningStatus.AVALI));
    }


    @Override
    public void update(DeviceInfo deviceInfo) {
        baseDao().updateByPrimaryKeySelective(deviceInfo);
    }

    @Override
    public void delete(Long id) {
        baseDao().deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void updateStatusToAvail(Long deviceId) {
        baseDao().updateRunStatusById(DeviceInfoConstants.DeviceRunningStatus.AVALI, deviceId);
    }

    @Override
    public List<DeviceInfo> selectList(DeviceInfoQuery query) {
        return baseDao().selectByCondition(query);
    }


}