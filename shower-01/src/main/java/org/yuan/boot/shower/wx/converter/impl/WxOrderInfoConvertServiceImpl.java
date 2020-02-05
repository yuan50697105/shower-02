package org.yuan.boot.shower.wx.converter.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.db.pojo.GoodsInfo;
import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderItem;
import org.yuan.boot.shower.wx.converter.WxOrderInfoConvertService;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.service.OrderCodeService;
import org.yuan.boot.shower.wx.service.WxCustomerService;
import org.yuan.boot.shower.wx.service.WxDeviceService;
import org.yuan.boot.shower.wx.service.WxGoodsService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 12:07
 */
@Component
@AllArgsConstructor
public class WxOrderInfoConvertServiceImpl implements WxOrderInfoConvertService {
    private OrderCodeService orderCodeService;
    private WxCustomerService wxCustomerService;
    private WxDeviceService wxDeviceService;
    private WxGoodsService wxGoodsService;

    @Override
    public OrderInfo addOrder(WxOrderInfo wxOrderInfo) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setType(0);
        orderInfo.setOrderNo(orderCodeService.generateOrderNo());
        orderInfo.setCustomerId(wxOrderInfo.getCustomerId());
        orderInfo.setCustomerOpenId(wxOrderInfo.getCustomerOpenId());
        orderInfo.setCustomerUnionId(wxOrderInfo.getCustomerUnionId());
        orderInfo.setCustomerNickName(wxCustomerService.getCustomerNameByUnionId(wxOrderInfo.getCustomerUnionId()));
        orderInfo.setOrderStatus(0);
        orderInfo.setTotalPrice(new BigDecimal("0"));
        return orderInfo;
    }

    @Override
    public OrderItem addOrderItem(WxOrderInfo wxOrderInfo, OrderInfo orderInfo) {
        OrderItem orderItem = new OrderItem();
        orderItem.setType(orderInfo.getType());
        orderItem.setOrderId(orderInfo.getId());
        orderItem.setOrderNo(orderInfo.getOrderNo());
        orderItem.setCustomerId(orderInfo.getCustomerId());
        orderItem.setCustomerOpenId(orderInfo.getCustomerOpenId());
        orderItem.setCustomerUnionId(orderInfo.getCustomerUnionId());
        orderItem.setCustomerNickName(wxCustomerService.getCustomerNameByUnionId(wxOrderInfo.getCustomerUnionId()));
        orderItem.setItemType(0);
        orderItem.setItemOrderNo("");
        Optional<DeviceInfo> deviceInfoOptional = wxDeviceService.getById(wxOrderInfo.getDeviceId());
        deviceInfoOptional.ifPresent(deviceInfo -> {
            orderItem.setDeviceType(deviceInfo.getType());
            orderItem.setDeviceId(deviceInfo.getId());
            orderItem.setDeviceCode(deviceInfo.getCode());
            orderItem.setRangeCode(deviceInfo.getRangeCode());
        });
        Optional<GoodsInfo> goodsInfoOptional = wxGoodsService.getByBaseGoodsInfoByRangeCode(orderItem.getRangeCode());
        goodsInfoOptional.ifPresent(goodsInfo -> {
            orderItem.setGoodsInfoId(goodsInfo.getId());
            orderItem.setGoodsInfoCode(goodsInfo.getCode());
            orderItem.setTimePrice(goodsInfo.getTimePrice());
            orderItem.setTimeInterval(goodsInfo.getTimeInterval());
            orderItem.setTimePriceUnit(goodsInfo.getTimeUnit());
            orderItem.setWaterPrice(goodsInfo.getWaterPrice());
            orderItem.setWaterSpace(goodsInfo.getWaterSpace());
            orderItem.setWaterUnit(goodsInfo.getWaterUnit());
        });
        return orderItem;
    }


    @Override
    public List<OrderItem> addBaseOrderItems(WxOrderInfo wxOrderInfo, OrderInfo orderInfo) {
        ArrayList<OrderItem> orderItems = new ArrayList<>(1);
        return orderItems;
    }

}
