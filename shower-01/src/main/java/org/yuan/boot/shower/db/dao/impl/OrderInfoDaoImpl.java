package org.yuan.boot.shower.db.dao.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.OrderInfoDao;
import org.yuan.boot.shower.db.mapper.OrderInfoMapper;
import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderInfoCondition;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:34
 */
@Component
@AllArgsConstructor
@Log4j2
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class OrderInfoDaoImpl extends BaseDaoImpl<OrderInfo, OrderInfoMapper> implements OrderInfoDao {
    @Override
    public PageResult<OrderInfo> selectPage(OrderInfoCondition condition) {
        return pageResult(condition,baseMapper()::selectByCondition);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(OrderInfo orderInfo) {
        baseMapper().insertSelective(orderInfo);
    }

    @Override
    public Optional<OrderInfo> selectById(Long orderId) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(orderId));
    }

}