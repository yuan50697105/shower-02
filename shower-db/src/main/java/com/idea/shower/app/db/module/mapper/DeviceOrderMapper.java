package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.DeviceOrder;
import com.idea.shower.app.db.module.pojo.DeviceOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeviceOrderMapper extends BaseMapper {
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

    int updateStatusByOrderId(@Param("updatedStatus") Integer updatedStatus, @Param("orderId") Long orderId);

    int updateStatusByOrderNo(@Param("updatedStatus") Integer updatedStatus, @Param("orderNo") String orderNo);
}