package com.idea.shower.app.db.module.dao.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.constants.order.OrderStatus;
import com.idea.shower.app.db.module.dao.OrderInfoDao;
import com.idea.shower.app.db.module.mapper.OrderInfoMapper;
import com.idea.shower.app.db.module.pojo.OrderInfo;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:12
 */
@Component
@AllArgsConstructor
public class OrderInfoDaoImpl extends BaseDaoImpl<OrderInfo, OrderInfoMapper> implements OrderInfoDao {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(OrderInfo orderInfo) {
        baseMapper().insertSelective(orderInfo);
    }

    @Override
    public Optional<OrderInfo> getById(Long orderId) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(orderId));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateStatusPaidByOrderNo(String outTradeNo) {
        baseMapper().updateStatusByOrderNo(OrderStatus.PAID, outTradeNo);
    }

    @Override
    public PageResult<OrderInfo> selectPageByCondition(OrderInfoQuery condition) {
        PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        return pageResult(PageInfo.of(baseMapper().selectByCondition(condition)));
    }
}