package com.idea.shower.shower.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.idea.shower.shower.commons.mapper.BaseMapper;
import com.idea.shower.shower.db.pojo.OrderInfo;
import com.idea.shower.shower.db.pojo.OrderInfoQueryBase;import com.idea.shower.shower.db.pojo.OrderInfoExample;

@Mapper
public interface OrderInfoMapper extends BaseMapper {
    long countByExample(OrderInfoExample example);

    int deleteByExample(OrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    List<OrderInfo> selectByCondition(OrderInfoQueryBase condition);
}