package com.idea.shower.app.db.module.dao.impl;


import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idea.shower.app.db.commons.dao.impl.BaseDaoImpl;
import com.idea.shower.app.db.module.constants.OrderInfoConstants;
import com.idea.shower.app.db.module.dao.OrderInfoDao;
import com.idea.shower.app.db.module.mapper.OrderInfoMapper;
import com.idea.shower.app.db.module.pojo.OrderInfo;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.app.db.module.pojo.vo.OrderInfoDeviceVO;
import com.idea.shower.commons.utils.ResourceFileUtils;
import com.idea.shower.db.core.pojo.IWxPageResult;
import com.idea.shower.db.mybaits.pojo.PageResult;
import com.idea.shower.db.mybaits.pojo.WxPageResult;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
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
    @Autowired
    private final OrderInfoMapper orderInfoMapper;
    private final ResourceFileUtils resourceFileUtils;

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
        baseMapper().updateStatusByOrderNo(OrderInfoConstants.OrderStatus.ORDER_COMPLETED, outTradeNo);
    }

    @Override
    public PageResult<OrderInfo> selectPageByCondition(OrderInfoQuery condition) {
        PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        return pageResult(PageInfo.of(baseMapper().selectByCondition(condition)));
    }

    @Override
    public IWxPageResult<OrderInfo> selectPageByConditionWeXin(OrderInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        PageInfo<OrderInfo> pageInfo = new PageInfo<>(baseMapper().selectByConditionWeXin(query));
        return new WxPageResult(pageInfo);
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

    @Override
    public IWxPageResult<OrderInfoDeviceVO> selectOrderInfoDeviceVOPageByCondition(OrderInfoQuery query) {
        PageHelper.startPage(query.getPage(), query.getLimit());
        List<OrderInfoDeviceVO> orderInfoDeviceVOS = orderInfoMapper.selectOrderInfoDeviceVOListByCondition(query);
        for (OrderInfoDeviceVO orderInfoDeviceVO : orderInfoDeviceVOS) {
            orderInfoDeviceVO.setPicture(resourceFileUtils.filePath(StrUtil.isNotBlank(orderInfoDeviceVO.getPicture()) ? orderInfoDeviceVO.getPicture() : ""));
        }
        return new WxPageResult<>(new PageInfo<>(orderInfoDeviceVOS));
    }

    @Override
    public void updateStatusUsingById(Long id) {
        baseMapper().updateStatusById(OrderInfoConstants.OrderStatus.USING, id);
    }

    @Override
    public void updateStatusTimeOutById(Long id) {
        baseMapper().updateStatusById(OrderInfoConstants.OrderStatus.ORDER_OUT_TIME, id);
    }

    @Override
    public void updateStatusEndUseById(Long id) {
        baseMapper().updateStatusById(OrderInfoConstants.OrderStatus.END_USE, id);
    }

    @Override
    public Optional<OrderInfoDeviceVO> getByOrderNoDeviceVo(String orderNo) {
        OrderInfoDeviceVO orderInfoDeviceVO = baseMapper().selectOrderInfoDeviceVOListByOrderNo(orderNo);
        if (ObjectUtil.isNotEmpty(orderInfoDeviceVO)){
            orderInfoDeviceVO.setPicture(resourceFileUtils.filePath(orderInfoDeviceVO.getPicture()));
        }
        return Optional.ofNullable(orderInfoDeviceVO);
    }

    @Override
    public void updateEndTimeByOrderId(Date date, Long id) {
        baseMapper().updateUseEndTimeById(date, id);
    }


    @Override
    public void updateUseStartTime(Date date, Long id) {
        baseMapper().updateUseStartTimeById(date, id);
    }

    @Override
    public void updateStatusCancelByOrderNo(String orderNo) {
        baseMapper().updateStatusByOrderNo(OrderInfoConstants.OrderStatus.ORDER_CANCEL, orderNo);
    }
}