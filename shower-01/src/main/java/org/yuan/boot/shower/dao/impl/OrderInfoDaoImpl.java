package org.yuan.boot.shower.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.shower.dao.OrderInfoDao;
import org.yuan.boot.shower.mapper.OrderInfoMapper;
import org.yuan.boot.shower.pojo.OrderInfo;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 21:53
 */
@Component
@AllArgsConstructor
public class OrderInfoDaoImpl extends BaseDaoImpl<OrderInfo, OrderInfoMapper> implements OrderInfoDao {
}