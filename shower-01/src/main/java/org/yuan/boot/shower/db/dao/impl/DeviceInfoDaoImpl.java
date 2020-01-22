package org.yuan.boot.shower.db.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.db.utils.PageResults;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.DeviceInfoDao;
import org.yuan.boot.shower.db.mapper.DeviceInfoMapper;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.db.pojo.DeviceInfoCondition;

import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:12
 */
@Component
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class DeviceInfoDaoImpl extends BaseDaoImpl<DeviceInfo, DeviceInfoMapper> implements DeviceInfoDao {
    @Override
    public PageResult<DeviceInfo> selectPageByCondition(DeviceInfoCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return PageResults.of(PageInfo.of(baseMapper().selectByCondition(condition)));
    }

    @Override
    public List<DeviceInfo> selectListByCondition(DeviceInfoCondition condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public Optional<DeviceInfo> getById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(DeviceInfo deviceInfo) {
        baseMapper().insertSelective(deviceInfo);
    }
}