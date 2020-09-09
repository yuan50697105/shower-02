package com.idea.shower.db.mybaits.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrder;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrderExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeviceOrderMapper extends BaseDaoMapper, BaseMapper<DeviceOrder> {
    long countByExample(DeviceOrderExample example);

    int deleteByExample(DeviceOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeviceOrder record);

    int insertSelective(DeviceOrder record);

    List<DeviceOrder> selectByExample(DeviceOrderExample example);

    DeviceOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeviceOrder record, @Param("example") DeviceOrderExample example);

    int updateByExample(@Param("record") DeviceOrder record, @Param("example") DeviceOrderExample example);

    int updateByPrimaryKeySelective(DeviceOrder record);

    int updateByPrimaryKey(DeviceOrder record);

    DeviceOrder selectOneByOrderNo(@Param("orderNo") String orderNo);

    DeviceOrder selectOneByOrderId(@Param("orderId") Long orderId);

    int updateStatusByOrderId(@Param("updatedStatus") Integer updatedStatus, @Param("orderId") Long orderId);

    int updateStatusByOrderNo(@Param("updatedStatus") Integer updatedStatus, @Param("orderNo") String orderNo);

    int updateStatusById(@Param("updatedStatus") Integer updatedStatus, @Param("id") Long id);
}