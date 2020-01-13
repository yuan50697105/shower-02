package org.yuan.boot.webmvc.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.webmvc.app.pojo.BaseDeviceInfo;
import org.yuan.boot.webmvc.app.pojo.BaseDeviceInfoExample;

import java.util.List;

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