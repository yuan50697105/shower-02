package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.commons.dao.BaseDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrder;

import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 22:57
 */
public interface DeviceOrderDao extends BaseDao<DeviceOrder> {
    void save(DeviceOrder deviceOrder);

    Optional<DeviceOrder> getByOrderNo(String orderNo);

    Optional<DeviceOrder> getByOrderId(Long orderId);

    void updateStatusUsingById(Long id);

    void updateStatusTimeOutByOrderId(Long orderId);
}
