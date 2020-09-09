package com.idea.shower.db.mybaits.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceRecord;
import com.idea.shower.db.mybaits.module.pojo.DeviceRecordExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeviceRecordMapper extends BaseDaoMapper<DeviceRecord>, BaseMapper<DeviceRecord> {
    long countByExample(DeviceRecordExample example);

    int deleteByExample(DeviceRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceRecord record);

    int insertSelective(DeviceRecord record);

    List<DeviceRecord> selectByExample(DeviceRecordExample example);

    DeviceRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceRecord record, @Param("example") DeviceRecordExample example);

    int updateByExample(@Param("record") DeviceRecord record, @Param("example") DeviceRecordExample example);

    int updateByPrimaryKeySelective(DeviceRecord record);

    int updateByPrimaryKey(DeviceRecord record);
}