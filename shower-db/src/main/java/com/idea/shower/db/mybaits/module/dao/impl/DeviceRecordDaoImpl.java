package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.dao.DeviceRecordDao;
import com.idea.shower.db.mybaits.module.mapper.DeviceRecordMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceRecord;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-31 12:40
 */
@Component
public class DeviceRecordDaoImpl extends CommonsDaoImpl<DeviceRecord, DeviceRecordMapper> implements DeviceRecordDao {
    @Override
    public QueryWrapper<DeviceRecord> getWrapper(Map<String, Object> params) {
        return null;
    }
}