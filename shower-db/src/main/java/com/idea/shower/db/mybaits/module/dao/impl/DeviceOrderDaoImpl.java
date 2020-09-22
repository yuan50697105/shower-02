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
<<<<<<< HEAD
public class DeviceOrderDaoImpl extends CommonsDaoImpl<DeviceOrder,DeviceOrder, DeviceOrderMapper> implements DeviceOrderDao {

    @Override
    public Optional<DeviceOrder> getByOrderNoOpt(String orderNo) {
        return Optional.ofNullable(baseDao().selectOneByOrderNo(orderNo));
=======
public class DeviceOrderDaoImpl extends BaseDaoImpl<DeviceOrder, DeviceOrderMapper> implements DeviceOrderDao {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(DeviceOrder deviceOrder) {
        baseMapper().insertSelective(deviceOrder);
    }

    @Override
    public Optional<DeviceOrder> getByOrderNoOpt(String orderNo) {
        return Optional.ofNullable(baseMapper().selectOneByOrderNo(orderNo));
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
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
<<<<<<< HEAD
    public QueryWrapper<DeviceOrder> getWrapper(Map<String, Object> params) {
        return null;
=======
    public Optional<DeviceOrder> getByOrderIdOpt(Long orderId) {
        return Optional.ofNullable(baseMapper().selectOneByOrderId(orderId));
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
    }
}