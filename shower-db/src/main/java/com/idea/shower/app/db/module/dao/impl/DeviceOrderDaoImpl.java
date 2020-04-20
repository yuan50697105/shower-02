package com.idea.shower.app.db.module.dao.impl;


import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.constants.OrderInfoConstants;
import com.idea.shower.app.db.module.dao.DeviceOrderDao;
import com.idea.shower.app.db.module.mapper.DeviceOrderMapper;
import com.idea.shower.app.db.module.pojo.DeviceOrder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(rollbackFor = Exception.class)
    public void updateStatusDeviceOrderPaid(String orderNo) {
        baseMapper().updateStatusByOrderNo(OrderInfoConstants.OrderStatus.PAID, orderNo);
    }

    @Override
    public void updateStatusDeviceOrderEndUse(Long orderId) {
        baseMapper().updateStatusByOrderId(OrderInfoConstants.OrderStatus.END_USE, orderId);
    }

    @Override
    public void updateStatusUsingByOrderInfoId(Long orderId) {
        baseMapper().updateStatusByOrderId(OrderInfoConstants.OrderStatus.USING, orderId);
    }
}