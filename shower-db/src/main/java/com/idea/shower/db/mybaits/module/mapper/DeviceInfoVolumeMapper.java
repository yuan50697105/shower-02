package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfoVolume;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfoVolumeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeviceInfoVolumeMapper extends BaseDaoMapper<DeviceInfoVolume> {
    long countByExample(DeviceInfoVolumeExample example);

    int deleteByExample(DeviceInfoVolumeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceInfoVolume record);

    int insertSelective(DeviceInfoVolume record);

    List<DeviceInfoVolume> selectByExample(DeviceInfoVolumeExample example);

    DeviceInfoVolume selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceInfoVolume record, @Param("example") DeviceInfoVolumeExample example);

    int updateByExample(@Param("record") DeviceInfoVolume record, @Param("example") DeviceInfoVolumeExample example);

    int updateByPrimaryKeySelective(DeviceInfoVolume record);

    int updateByPrimaryKey(DeviceInfoVolume record);
}