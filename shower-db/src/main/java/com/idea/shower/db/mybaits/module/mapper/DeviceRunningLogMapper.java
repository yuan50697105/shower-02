package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceRunningLog;
import com.idea.shower.db.mybaits.module.pojo.DeviceRunningLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
<<<<<<< HEAD
public interface DeviceRunningLogMapper extends BaseDaoMapper<DeviceRunningLog> {
=======
public interface DeviceRunningLogMapper extends BaseDaoMapper<DeviceRunningLog>, BaseMapper<DeviceRunningLog> {
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
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