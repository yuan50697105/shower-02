package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.OrderItem;
import com.idea.shower.app.db.module.pojo.OrderItemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrderItemMapper extends BaseMapper {
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