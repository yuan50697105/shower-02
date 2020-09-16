package com.idea.shower.db.mybaits.module.dao.impl;


import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.commons.utils.ResourceFileUtils;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.commons.pojo.WxPageResult;
import com.idea.shower.db.mybaits.commons.dao.impl.CommonsDaoImpl;
import com.idea.shower.db.mybaits.module.constants.OrderInfoConstants;
import com.idea.shower.db.mybaits.module.dao.OrderInfoDao;
import com.idea.shower.db.mybaits.module.mapper.OrderInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.OrderInfo;
import com.idea.shower.db.mybaits.module.pojo.ao.OrderInfoAo;
import com.idea.shower.db.mybaits.module.pojo.query.OrderInfoQuery;
import com.idea.shower.db.mybaits.module.pojo.vo.OrderInfoDeviceVO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:12
 */
@Component
@AllArgsConstructor
public class OrderInfoDaoImpl extends CommonsDaoImpl<OrderInfo, OrderInfoAo, OrderInfoMapper> implements OrderInfoDao {
    @Autowired
    private final OrderInfoMapper orderInfoMapper;
    private final ResourceFileUtils resourceFileUtils;

    @Override
    public Optional<OrderInfo> getByIdOpt(Long orderId) {
        return Optional.ofNullable(baseDao().selectByPrimaryKey(orderId));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateStatusCompleteByOrderNo(String outTradeNo) {
        baseDao().updateStatusByOrderNo(OrderInfoConstants.OrderStatus.ORDER_COMPLETED, outTradeNo);
    }

    @Override
    public PageResult<OrderInfo> selectPageByCondition(OrderInfoQuery condition) {
        PageHelper.startPage(condition.getPage(), condition.getLimit());
        return pageResult(PageInfo.of(baseDao().selectByCondition(condition)));
    }

    @Override
    public WxPageResult<OrderInfo> selectPageByConditionWeXin(OrderInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        PageInfo<OrderInfo> pageInfo = new PageInfo<>(baseDao().selectByConditionWeXin(query));
        return new WxPageResult<>(pageInfo);
    }

    @Override
    public Optional<OrderInfo> getByOrderNoOpt(String orderNo) {
        return Optional.ofNullable(baseDao().selectOneByOrderNo(orderNo));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateTotalPriceByOrderNo(BigDecimal totalprice, String orderNo) {
        baseDao().updateTotalPriceByOrderNo(totalprice, orderNo);
    }

    @Override
    public WxPageResult<OrderInfoDeviceVO> selectOrderInfoDeviceVOPageByCondition(OrderInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        List<OrderInfoDeviceVO> orderInfoDeviceVOS = orderInfoMapper.selectOrderInfoDeviceVOListByCondition(query);
        for (OrderInfoDeviceVO orderInfoDeviceVO : orderInfoDeviceVOS) {
            orderInfoDeviceVO.setPicture(resourceFileUtils.filePath(StrUtil.isNotBlank(orderInfoDeviceVO.getPicture()) ? orderInfoDeviceVO.getPicture() : ""));
        }
        return new WxPageResult<>(new PageInfo<>(orderInfoDeviceVOS));
    }

    @Override
    public void updateStatusUsingById(Long id) {
        baseDao().updateStatusById(OrderInfoConstants.OrderStatus.USING, id);
    }

    @Override
    public void updateStatusTimeOutById(Long id) {
        baseDao().updateStatusById(OrderInfoConstants.OrderStatus.ORDER_OUT_TIME, id);
    }

    @Override
    public void updateStatusEndUseById(Long id) {
        baseDao().updateStatusById(OrderInfoConstants.OrderStatus.END_USE, id);
    }

    @Override
    public Optional<OrderInfoDeviceVO> getByOrderNoDeviceVoOpt(String orderNo) {
        OrderInfoDeviceVO orderInfoDeviceVO = baseDao().selectOrderInfoDeviceVOListByOrderNo(orderNo);
        if (ObjectUtil.isNotEmpty(orderInfoDeviceVO)) {
            orderInfoDeviceVO.setPicture(resourceFileUtils.filePath(orderInfoDeviceVO.getPicture()));
        }
        return Optional.ofNullable(orderInfoDeviceVO);
    }

    @Override
    public void updateEndTimeByOrderId(Date date, Long id) {
        baseDao().updateUseEndTimeById(date, id);
    }


    @Override
    public void updateUseStartTime(Date date, Long id) {
        baseDao().updateUseStartTimeById(date, id);
    }

    @Override
    public void updateStatusCancelByOrderNo(String orderNo) {
        baseDao().updateStatusByOrderNo(OrderInfoConstants.OrderStatus.ORDER_CANCEL, orderNo);
    }

    @Override
    public void updateTransactionIdByOrderNo(String transactionId, String outTradeNo) {
        baseDao().updateTransactionIdByOrderNo(transactionId, outTradeNo);
    }

    @Override
    public QueryWrapper<OrderInfo> getWrapper(Map<String, Object> params) {
        return null;
    }
}