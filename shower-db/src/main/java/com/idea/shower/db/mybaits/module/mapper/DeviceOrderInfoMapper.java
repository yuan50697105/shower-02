package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrderInfo;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrderInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
<<<<<<< HEAD
public interface DeviceOrderInfoMapper extends BaseDaoMapper<DeviceOrderInfo> {
=======
public interface DeviceOrderInfoMapper extends BaseDaoMapper<DeviceOrderInfo>, BaseMapper<DeviceOrderInfo> {
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
    long countByExample(DeviceOrderInfoExample example);

    int deleteByExample(DeviceOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceOrderInfo record);

    int insertSelective(DeviceOrderInfo record);

    List<DeviceOrderInfo> selectByExample(DeviceOrderInfoExample example);

    DeviceOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceOrderInfo record, @Param("example") DeviceOrderInfoExample example);

    int updateByExample(@Param("record") DeviceOrderInfo record, @Param("example") DeviceOrderInfoExample example);

    int updateByPrimaryKeySelective(DeviceOrderInfo record);

    int updateByPrimaryKey(DeviceOrderInfo record);
}