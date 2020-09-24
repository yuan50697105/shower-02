package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfo;
import com.idea.shower.db.mybaits.module.pojo.DeviceInfoExample;
import com.idea.shower.db.mybaits.module.pojo.query.DeviceInfoQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeviceInfoMapper extends BaseDaoMapper<DeviceInfo> {
    long countByExample(DeviceInfoExample example);

    int deleteByExample(DeviceInfoExample example);

    int deleteByPrimaryKey(Long id);


    int insertSelective(DeviceInfo record);

    List<DeviceInfo> selectByExample(DeviceInfoExample example);

    DeviceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceInfo record, @Param("example") DeviceInfoExample example);

    int updateByExample(@Param("record") DeviceInfo record, @Param("example") DeviceInfoExample example);

    int updateByPrimaryKeySelective(DeviceInfo record);

    int updateByPrimaryKey(DeviceInfo record);

    int updateRunStatusById(@Param("updatedRunStatus") Integer updatedRunStatus, @Param("id") Long id);

    List<DeviceInfo> selectByCondition(DeviceInfoQuery query);

    DeviceInfo selectOneByCode(@Param("code") String code);

    DeviceInfo getOneByCodeAndRunStatus(@Param("code") String code, @Param("runStatus") Integer runStatus);
}