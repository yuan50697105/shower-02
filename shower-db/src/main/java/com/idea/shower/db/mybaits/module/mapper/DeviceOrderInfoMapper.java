package com.idea.shower.db.mybaits.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrderInfo;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrderInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeviceOrderInfoMapper extends BaseDaoMapper, BaseMapper<DeviceOrderInfo> {
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