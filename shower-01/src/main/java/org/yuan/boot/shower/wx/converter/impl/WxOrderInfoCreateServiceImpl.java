package org.yuan.boot.shower.wx.converter.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.shower.commons.constant.GoodsInfoConstants;
import org.yuan.boot.shower.commons.exception.CustomerInfoNotExistResultRuntimeException;
import org.yuan.boot.shower.commons.exception.DeviceInfoResultRuntimeException;
import org.yuan.boot.shower.commons.exception.GoodsInfoNotExistResultRuntimeException;
import org.yuan.boot.shower.db.pojo.*;
import org.yuan.boot.shower.wx.converter.WxOrderInfoCreateService;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.service.OrderCodeService;
import org.yuan.boot.shower.wx.service.WxCustomerService;
import org.yuan.boot.shower.wx.service.WxDeviceService;
import org.yuan.boot.shower.wx.service.WxGoodsService;
import org.yuan.boot.webmvc.exception.DataParamsErrorResultRuntimeException;

import java.math.BigDecimal;
import java.util.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 12:07
 */
@Component
@AllArgsConstructor
public class WxOrderInfoCreateServiceImpl implements WxOrderInfoCreateService {
    private OrderCodeService orderCodeService;
    private WxCustomerService wxCustomerService;
    private WxDeviceService wxDeviceService;
    private WxGoodsService wxGoodsService;

    @Override
    public OrderInfo createOrder(WxOrderInfo wxOrderInfo) {
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

    /**
     * 创建起租价
     *
     * @param wxOrderInfo
     * @param orderInfo
     * @return
     */
    @Override
    public List<OrderItem> creteBaseOrderItem(WxOrderInfo wxOrderInfo, OrderInfo orderInfo) {
        ArrayList<OrderItem> orderItems = new ArrayList<>(1);
        Long deviceId = wxOrderInfo.getDeviceId();
        String customerUnionId = wxOrderInfo.getCustomerUnionId();
        String rangeCode = wxOrderInfo.getRangeCode();
        Optional<GoodsInfo> goodsInfo = wxGoodsService.getByBaseGoodsInfoByRangeCode(rangeCode);
        Optional<DeviceInfo> deviceInfo = wxDeviceService.getById(deviceId);
        Optional<CustomerInfo> customerInfo = wxCustomerService.getByUnionId(customerUnionId);
        orderItems.add(createOrderItem(wxOrderInfo, orderInfo, customerInfo.orElseThrow(CustomerInfoNotExistResultRuntimeException::new), deviceInfo.orElseThrow(DeviceInfoResultRuntimeException::new), goodsInfo.orElseThrow(GoodsInfoNotExistResultRuntimeException::new)));
        return orderItems;
    }

    @Override
    public OrderItem createOrderItem(WxOrderInfo wxOrderInfo, OrderInfo orderInfo, CustomerInfo customerInfo, DeviceInfo deviceInfo, GoodsInfo goodsInfo) {
        OrderItem orderItem = new OrderItem();
        orderItem.setType(0);
        orderItem.setOrderId(0L);
        orderItem.setOrderNo(orderInfo.getOrderNo());
        orderItem.setCustomerId(orderInfo.getCustomerId());
        orderItem.setCustomerOpenId(orderInfo.getCustomerOpenId());
        orderItem.setCustomerUnionId(orderInfo.getCustomerUnionId());
        orderItem.setCustomerNickName(orderInfo.getCustomerNickName());
        orderItem.setItemType(0);
        orderItem.setItemOrderNo("");
        orderItem.setDeviceType(deviceInfo.getType());
        orderItem.setDeviceId(deviceInfo.getId());
        orderItem.setDeviceCode(deviceInfo.getCode());
        orderItem.setRangeCode(deviceInfo.getRangeCode());
        orderItem.setGoodsInfoId(goodsInfo.getId());
        orderItem.setGoodsInfoCode(goodsInfo.getCode());
        orderItem.setTimePrice(goodsInfo.getTimePrice());
        orderItem.setTimeInterval(goodsInfo.getTimeInterval());
        orderItem.setTimeTotalPrice(goodsInfo.getTimePrice());
        orderItem.setTimePriceUnit(goodsInfo.getTimeUnit());
        orderItem.setStartTime(new Date());
        orderItem.setEndTime(getEndTime(orderItem.getStartTime(), goodsInfo.getTimeInterval(), goodsInfo.getTimeUnit()));
        orderItem.setTimeUseAmount(new BigDecimal("0"));
        orderItem.setWaterPrice(goodsInfo.getWaterPrice());
        orderItem.setWaterSpace(goodsInfo.getWaterSpace());
        orderItem.setWaterUnit(goodsInfo.getWaterUnit());
        orderItem.setWaterTotalPrice(goodsInfo.getWaterPrice());
        orderItem.setTotalPrice(goodsInfo.getTimePrice().add(goodsInfo.getWaterPrice()));
        orderItem.setRemainPrice(new BigDecimal("0"));
        return orderItem;
    }


    /**
     * 计算结束时间
     *
     * @param startTime
     * @param timeInterval
     * @param timeUnit
     * @return
     */
    private Date getEndTime(Date startTime, BigDecimal timeInterval, int timeUnit) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        switch (timeUnit) {
            case GoodsInfoConstants.GoodsInfoTimeUnit.HOUR:
                calendar.set(Calendar.HOUR, timeInterval.intValue());
                break;
            case GoodsInfoConstants.GoodsInfoTimeUnit.MINUTE:
                calendar.set(Calendar.MINUTE, timeInterval.intValue());
                break;
            default:
                throw new DataParamsErrorResultRuntimeException();
        }
        return calendar.getTime();
    }

}
