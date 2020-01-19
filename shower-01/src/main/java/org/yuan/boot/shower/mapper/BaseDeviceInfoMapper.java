package org.yuan.boot.shower.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.shower.pojo.BaseDeviceInfo;
import org.yuan.boot.shower.pojo.BaseDeviceInfoExample;

@Mapper
public interface BaseDeviceInfoMapper extends BaseMapper<BaseDeviceInfo> {
    long countByExample(BaseDeviceInfoExample example);

    int deleteByExample(BaseDeviceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseDeviceInfo record);

    int insertSelective(BaseDeviceInfo record);

    List<BaseDeviceInfo> selectByExample(BaseDeviceInfoExample example);

    BaseDeviceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseDeviceInfo record, @Param("example") BaseDeviceInfoExample example);

    int updateByExample(@Param("record") BaseDeviceInfo record, @Param("example") BaseDeviceInfoExample example);

    int updateByPrimaryKeySelective(BaseDeviceInfo record);

    int updateByPrimaryKey(BaseDeviceInfo record);
}