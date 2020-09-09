package com.idea.shower.db.mybaits.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.OrderItem;
import com.idea.shower.db.mybaits.module.pojo.OrderItemExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderItemMapper extends BaseDaoMapper, BaseMapper<OrderItem> {
    long countByExample(OrderItemExample example);

    int deleteByExample(OrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    List<OrderItem> selectByExample(OrderItemExample example);

    OrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    int updateByExample(@Param("record") OrderItem record, @Param("example") OrderItemExample example);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);

    OrderItem selectOneByOrderIdAndGoodsType(@Param("orderId") Long orderId, @Param("goodsType") Integer goodsType);

    List<OrderItem> selectByOrderId(@Param("orderId") String orderId);

    List<OrderItem> selectByOrderNo(@Param("orderNo") String orderNo);

    OrderItem selectOneByOrderIdAndPriceType(@Param("orderId") Long orderId, @Param("priceType") Integer priceType);
}