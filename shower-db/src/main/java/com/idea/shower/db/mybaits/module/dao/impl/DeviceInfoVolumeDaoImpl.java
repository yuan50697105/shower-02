package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.dao.DeviceInfoVolumeDao;
import com.idea.shower.db.mybaits.module.mapper.DeviceInfoVolumeMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfoVolume;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-05-13 13:44
 */
@Component
@AllArgsConstructor
@Transactional
public class DeviceInfoVolumeDaoImpl extends CommonsDaoImpl<DeviceInfoVolume,DeviceInfoVolume, DeviceInfoVolumeMapper> implements DeviceInfoVolumeDao {

    @Override
    public QueryWrapper<DeviceInfoVolume> getWrapper(Map<String, Object> params) {
        return null;
    }
}