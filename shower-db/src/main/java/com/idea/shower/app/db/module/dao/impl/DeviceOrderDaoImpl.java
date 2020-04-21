package com.idea.shower.app.db.module.dao.impl;


import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.constants.OrderInfoConstants;
import com.idea.shower.app.db.module.dao.DeviceOrderDao;
import com.idea.shower.app.db.module.mapper.DeviceOrderMapper;
import com.idea.shower.app.db.module.pojo.DeviceOrder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 22:57
 */
@Component
@AllArgsConstructor
public class DeviceOrderDaoImpl extends BaseDaoImpl<DeviceOrder, DeviceOrderMapper> implements DeviceOrderDao {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(DeviceOrder deviceOrder) {
        baseMapper().insertSelective(deviceOrder);
    }

    @Override
    public Optional<DeviceOrder> getByOrderNo(String orderNo) {
        return Optional.ofNullable(baseMapper().selectOneByOrderNo(orderNo));
    }

    @Override
    public void updateStatusUsingById(Long id) {
        baseMapper().updateStatusById(OrderInfoConstants.OrderStatus.USING, id);
    }

    @Override
    public void updateStatusTimeOutByOrderId(Long orderId) {
        baseMapper().updateStatusByOrderId(OrderInfoConstants.OrderStatus.ORDER_OUT_TIME, orderId);
    }

    @Override
    public Optional<DeviceOrder> getByOrderId(Long orderId) {
        return Optional.ofNullable(baseMapper().selectOneByOrderId(orderId));
    }
}