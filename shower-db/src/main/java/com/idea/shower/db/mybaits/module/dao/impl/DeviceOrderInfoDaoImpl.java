package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.mapper.DeviceOrderInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrderInfo;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:12
 */
@Component
@AllArgsConstructor
@Log4j2
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class DeviceOrderInfoDaoImpl extends CommonsDaoImpl<DeviceOrderInfo, DeviceOrderInfoMapper> implements CommonsDao<DeviceOrderInfo> {
    @Override
    public QueryWrapper<DeviceOrderInfo> getWrapper(Map<String, Object> params) {
        return null;
    }
}