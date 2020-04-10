package com.idea.shower.app.db.module.dao.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.constants.OrderInfoConstants;
import com.idea.shower.app.db.module.dao.OrderInfoDao;
import com.idea.shower.app.db.module.mapper.OrderInfoMapper;
import com.idea.shower.app.db.module.pojo.OrderInfo;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.db.core.pojo.WxPageResult;
import com.idea.shower.db.mybaits.pojo.PageResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
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
        baseMapper().updateStatusByOrderNo(OrderInfoConstants.OrderStatus.PAID, outTradeNo);
    }

    @Override
    public PageResult<OrderInfo> selectPageByCondition(OrderInfoQuery condition) {
        PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        return pageResult(PageInfo.of(baseMapper().selectByCondition(condition)));
    }


    @Override
    public WxPageResult<OrderInfo> selectPageByConditionWeXin(OrderInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        new PageInfo<>(baseMapper().selectByConditionWeXin(query));
        return new WxPageResult<>();
    }

    @Override
    public Optional<OrderInfo> getByOrderNo(String orderNo) {
        return Optional.ofNullable(baseMapper().selectOneByOrderNo(orderNo));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateTotalPriceByOrderNo(BigDecimal totalprice, String orderNo) {
        baseMapper().updateTotalPriceByOrderNo(totalprice, orderNo);
    }
}