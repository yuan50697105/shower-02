package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.db.dao.OrderInfoDao;
import org.yuan.boot.shower.db.dao.OrderItemDao;
import org.yuan.boot.shower.db.pojo.OrderInfoCondition;
import org.yuan.boot.shower.wx.converter.WxOrderInfoConverter;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.service.WxAppointmentOrderService;
import org.yuan.boot.shower.wx.service.WxCommonsOrderService;
import org.yuan.boot.shower.wx.service.WxOrderService;
import org.yuan.boot.shower.wx.service.WxPrepayOrderService;
import org.yuan.boot.webmvc.exception.DataParamsErrorResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

import static org.yuan.boot.shower.core.constant.OrderInfoConstants.OrderType.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:08
 */
@Service
@AllArgsConstructor
@Log4j2
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class WxOrderServiceImpl implements WxOrderService {
    private OrderInfoDao orderInfoDao;
    private OrderItemDao orderItemDao;
    private WxOrderInfoConverter wxOrderInfoConverter;
    private WxCommonsOrderService wxCommonsOrderService;
    private WxPrepayOrderService wxPrepayOrderService;
    private WxAppointmentOrderService wxAppointmentOrderService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderInfo wxOrderInfo) {
        switch (wxOrderInfo.getType()) {
            case COMMONS:
                return wxCommonsOrderService.addOrder(wxOrderInfo);
            case PREPAY:
                return wxPrepayOrderService.addOrder(wxOrderInfo);
            case APPOINTMENT:
                return wxAppointmentOrderService.addOrder(wxOrderInfo);
            default:
                throw new DataParamsErrorResultRuntimeException("订单类型错误");
        }
    }

    @Override
    public Result payOrder(WxOrderInfo wxOrderInfo) {
        // TODO: 2020/1/23  发起支付
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result payNotify(WxOrderInfo wxOrderInfo) {
        // TODO: 2020/1/23 支付回调
        return null;
    }

    @Override
    public Result data(OrderInfoCondition condition) {
        // TODO: 2020/1/23 查询订单信息
        return null;
    }


}