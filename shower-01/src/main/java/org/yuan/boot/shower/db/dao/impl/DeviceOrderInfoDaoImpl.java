package org.yuan.boot.shower.db.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.db.utils.PageResults;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.DeviceOrderInfoDao;
import org.yuan.boot.shower.db.mapper.DeviceOrderInfoMapper;
import org.yuan.boot.shower.db.pojo.DeviceOrderInfo;
import org.yuan.boot.shower.db.pojo.DeviceOrderInfoCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:13
 */
@Component
@AllArgsConstructor
public class DeviceOrderInfoDaoImpl extends BaseDaoImpl<DeviceOrderInfo, DeviceOrderInfoMapper> implements DeviceOrderInfoDao {
    @Override
    public PageResult<DeviceOrderInfo> selectPage(DeviceOrderInfoCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return PageResults.of(PageInfo.of(baseMapper().selectByCondition(condition)));
    }
}