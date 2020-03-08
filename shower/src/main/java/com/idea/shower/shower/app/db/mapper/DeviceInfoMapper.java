package com.idea.shower.shower.app.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.idea.shower.shower.app.commons.mapper.BaseMapper;
import com.idea.shower.shower.app.db.pojo.DeviceInfo;
import com.idea.shower.shower.app.db.pojo.DeviceInfoQueryBaseConditionQuery;import com.idea.shower.shower.app.db.pojo.DeviceInfoExample;

@Mapper
public interface DeviceInfoMapper extends BaseMapper {
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

    List<DeviceInfo> selectByCondition(DeviceInfoQueryBaseConditionQuery condition);
}