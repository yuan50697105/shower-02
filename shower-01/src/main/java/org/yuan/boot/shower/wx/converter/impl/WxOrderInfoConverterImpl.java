package org.yuan.boot.shower.wx.converter.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.shower.db.dao.CustomerInfoDao;
import org.yuan.boot.shower.db.dao.DeviceInfoDao;
import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderItem;
import org.yuan.boot.shower.wx.converter.WxOrderInfoConverter;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.service.WxOrderNoService;

import java.math.BigDecimal;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-28 12:13
 */
@Component
@AllArgsConstructor
public class WxOrderInfoConverterImpl implements WxOrderInfoConverter {
    private WxOrderNoService wxOrderNoService;
    private CustomerInfoDao customerInfoDao;
    private DeviceInfoDao deviceInfoDao;

    @Override
    public OrderInfo convertForAddOrder(WxOrderInfo wxOrderInfo) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setType(wxOrderInfo.getType());
        orderInfo.setOrderNo(wxOrderNoService.getOrderNo());
        orderInfo.setCustomerId(wxOrderInfo.getCustomerId());
        orderInfo.setCustomerOpenId(wxOrderInfo.getCustomerOpenId());
        orderInfo.setCustomerUnionId(wxOrderInfo.getCustomerUnionId());
        customerInfoDao.getById(wxOrderInfo.getCustomerId()).ifPresent(customerInfo -> {
            orderInfo.setCustomerNickName(customerInfo.getNickName());
        });
        orderInfo.setOrderStatus(0);
        orderInfo.setTotalPrice(new BigDecimal("0"));
        return orderInfo;
    }

    @Override
    public OrderItem convertForAddOrderItem(OrderInfo orderInfo, WxOrderInfo wxOrderInfo) {
        OrderItem orderItem = new OrderItem();
        orderItem.setType(orderInfo.getType());
        orderItem.setOrderId(orderInfo.getId());
        orderItem.setOrderNo(orderInfo.getOrderNo());
        orderItem.setCustomerId(orderInfo.getCustomerId());
        orderItem.setCustomerOpenId(orderInfo.getCustomerOpenId());
        orderItem.setCustomerUnionId(orderInfo.getCustomerUnionId());
        orderItem.setCustomerNickName(orderInfo.getCustomerNickName());
        orderItem.setItemType(0);
        orderItem.setItemOrderNo(wxOrderNoService.getOrderNo());
        Long deviceId = wxOrderInfo.getDeviceId();
        deviceInfoDao.getById(deviceId).ifPresent(deviceInfo -> {
            orderItem.setDeviceType(deviceInfo.getType());
            orderItem.setDeviceId(deviceInfo.getId());
            orderItem.setDeviceCode(deviceInfo.getCode());
        });
        orderItem.setPrice(wxOrderInfo.getPrepayDecimal());
        orderItem.setPriceUnit(0);
        return orderItem;
    }

}