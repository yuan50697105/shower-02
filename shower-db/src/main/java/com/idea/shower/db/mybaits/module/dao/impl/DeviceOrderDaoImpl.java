package com.idea.shower.db.mybaits.module.dao.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.constants.OrderInfoConstants;
import com.idea.shower.db.mybaits.module.dao.DeviceOrderDao;
import com.idea.shower.db.mybaits.module.mapper.DeviceOrderMapper;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 22:57
 */
@Component
@AllArgsConstructor
public class DeviceOrderDaoImpl extends CommonsDaoImpl<DeviceOrder, DeviceOrderMapper> implements DeviceOrderDao {

    @Override
    public Optional<DeviceOrder> getByOrderNoOpt(String orderNo) {
        return Optional.ofNullable(baseDao().selectOneByOrderNo(orderNo));
    }

    @Override
    public void updateStatusUsingById(Long id) {
        baseDao().updateStatusById(OrderInfoConstants.OrderStatus.USING, id);
    }

    @Override
    public void updateStatusTimeOutByOrderId(Long orderId) {
        baseDao().updateStatusByOrderId(OrderInfoConstants.OrderStatus.ORDER_OUT_TIME, orderId);
    }

    @Override
    public Optional<DeviceOrder> getByOrderIdOpt(Long orderId) {
        return Optional.ofNullable(baseDao().selectOneByOrderId(orderId));
    }

    @Override
    public QueryWrapper<DeviceOrder> getWrapper(Map<String, Object> params) {
        return null;
    }
}