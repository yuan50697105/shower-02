package com.idea.shower.app.commons.db.module.dao.impl;

import com.idea.shower.app.commons.db.commons.dao.impl.BaseDaoImpl;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.idea.shower.db.mybaits.pojo.PageResult;
import com.idea.shower.app.commons.db.module.dao.OrderInfoDao;
import com.idea.shower.app.commons.db.module.mapper.OrderInfoMapper;
import com.idea.shower.app.commons.db.module.pojo.OrderInfo;
import com.idea.shower.app.commons.db.module.pojo.OrderInfoQuery;

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
    public PageResult<OrderInfo> selectPage(OrderInfoQuery condition) {
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