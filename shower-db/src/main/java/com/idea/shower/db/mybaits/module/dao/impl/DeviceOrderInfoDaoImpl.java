package com.idea.shower.db.mybaits.module.dao.impl;

import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.db.mybaits.module.mapper.DeviceOrderInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrderInfo;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
public class DeviceOrderInfoDaoImpl extends BaseDaoImpl<DeviceOrderInfo, DeviceOrderInfoMapper> implements BaseDao<DeviceOrderInfo> {
}