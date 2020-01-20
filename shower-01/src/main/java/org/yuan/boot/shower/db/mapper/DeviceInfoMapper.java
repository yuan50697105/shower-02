package org.yuan.boot.shower.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.shower.commons.mapper.BaseMapper;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.db.pojo.DeviceInfoExample;

@Mapper
public interface DeviceInfoMapper extends BaseMapper<DeviceInfo> {
    long countByExample(DeviceInfoExample example);

    int deleteByExample(DeviceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceInfo record);

    int insertSelective(DeviceInfo record);

    List<DeviceInfo> selectByExample(DeviceInfoExample example);

    DeviceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceInfo record, @Param("example") DeviceInfoExample example);

    int updateByExample(@Param("record") DeviceInfo record, @Param("example") DeviceInfoExample example);

    int updateByPrimaryKeySelective(DeviceInfo record);

    int updateByPrimaryKey(DeviceInfo record);
}