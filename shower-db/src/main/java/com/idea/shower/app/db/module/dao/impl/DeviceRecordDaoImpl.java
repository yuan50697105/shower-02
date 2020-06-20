package com.idea.shower.app.db.module.dao.impl;

import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.dao.DeviceRecordDao;
import com.idea.shower.app.db.module.mapper.DeviceRecordMapper;
import com.idea.shower.app.db.module.pojo.DeviceRecord;
import org.springframework.stereotype.Component;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-31 12:40
 */
@Component
public class DeviceRecordDaoImpl extends BaseDaoImpl<DeviceRecord, DeviceRecordMapper> implements DeviceRecordDao {
}