package com.idea.shower.db.mybaits.module.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.constants.PriceInfoConstants;
import com.idea.shower.db.mybaits.module.dao.OrderItemDao;
import com.idea.shower.db.mybaits.module.mapper.OrderItemMapper;
import com.idea.shower.db.mybaits.module.pojo.OrderItem;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 19:56
 */
@Component
@AllArgsConstructor
public class OrderItemDaoImpl extends CommonsDaoImpl<OrderItem,OrderItem, OrderItemMapper> implements OrderItemDao {


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchSave(List<OrderItem> orderItems) {
        orderItems.forEach(baseDao()::insertSelective);
    }

    @Override
    public Optional<OrderItem> getRentalItemByOrderIdOpt(Long orderId) {
        return Optional.ofNullable(baseDao().selectOneByOrderIdAndGoodsType(orderId, PriceInfoConstants.PriceType.STARTING_PRICE));
    }

    @Override
    public List<OrderItem> selectListByOrderNo(String orderNo) {
        return baseDao().selectByOrderNo(orderNo);
    }

    @Override
    public OrderItem getStartingItemByOrderId(Long id) {
        return baseDao().selectOneByOrderIdAndPriceType(id, PriceInfoConstants.PriceType.STARTING_PRICE);
    }

    @Override
    public QueryWrapper<OrderItem> getWrapper(Map<String, Object> params) {
        return null;
    }
}