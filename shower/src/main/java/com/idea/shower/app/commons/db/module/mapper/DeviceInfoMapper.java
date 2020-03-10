package com.idea.shower.app.commons.db.module.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.idea.shower.app.commons.db.commons.mapper.BaseMapper;
import com.idea.shower.app.commons.db.module.pojo.DeviceInfo;
import com.idea.shower.app.commons.db.module.pojo.DeviceInfoQueryBaseConditionQuery;import com.idea.shower.app.commons.db.module.pojo.DeviceInfoExample;

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