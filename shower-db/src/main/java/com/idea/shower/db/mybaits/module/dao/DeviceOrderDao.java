package com.idea.shower.db.mybaits.module.dao;


import com.idea.shower.db.mybaits.commons.dao.CommonsDao;
import com.idea.shower.db.mybaits.module.pojo.DeviceOrder;

import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 22:57
 */
public interface DeviceOrderDao extends CommonsDao<DeviceOrder,DeviceOrder> {



    Optional<DeviceOrder> getByOrderNoOpt(String orderNo);

    Optional<DeviceOrder> getByOrderIdOpt(Long orderId);

    void updateStatusUsingById(Long id);

    void updateStatusTimeOutByOrderId(Long orderId);

    void updateStatusEndById(Long orderId, Long deviceId);
}
