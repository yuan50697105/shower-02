package com.idea.shower.shower.app.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.idea.shower.shower.app.commons.mapper.BaseMapper;
import com.idea.shower.shower.app.db.pojo.DeviceRecord;
import com.idea.shower.shower.app.db.pojo.DeviceRecordExample;

@Mapper
public interface DeviceRecordMapper extends BaseMapper {
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