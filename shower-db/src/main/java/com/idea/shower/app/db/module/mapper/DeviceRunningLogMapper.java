package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.DeviceRunningLog;
import com.idea.shower.app.db.module.pojo.DeviceRunningLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeviceRunningLogMapper extends BaseMapper {
    long countByExample(DeviceRunningLogExample example);

    int deleteByExample(DeviceRunningLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceRunningLog record);

    int insertSelective(DeviceRunningLog record);

    List<DeviceRunningLog> selectByExample(DeviceRunningLogExample example);

    DeviceRunningLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceRunningLog record, @Param("example") DeviceRunningLogExample example);

    int updateByExample(@Param("record") DeviceRunningLog record, @Param("example") DeviceRunningLogExample example);

    int updateByPrimaryKeySelective(DeviceRunningLog record);

    int updateByPrimaryKey(DeviceRunningLog record);
}