package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.DeviceInfoVolume;
import com.idea.shower.app.db.module.pojo.DeviceInfoVolumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeviceInfoVolumeMapper extends BaseMapper {
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