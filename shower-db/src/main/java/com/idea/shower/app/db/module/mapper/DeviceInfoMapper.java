package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.DeviceInfo;
import com.idea.shower.app.db.module.pojo.DeviceInfoExample;
import com.idea.shower.app.db.module.pojo.query.DeviceInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    List<DeviceInfo> selectByCondition(DeviceInfoQuery query);

    DeviceInfo selectOneByCode(@Param("code") String code);
}