package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.yuan.boot.shower.commons.constant.GoodsInfoConstants;
import org.yuan.boot.shower.db.pojo.DeviceInfo;
import org.yuan.boot.shower.db.pojo.GoodsInfo;
import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderItem;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.service.*;
import org.yuan.boot.webmvc.exception.DataParamsErrorResultRuntimeException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
    private WxOrderService wxOrderService;

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
    public List<OrderItem> createRentalOrderItem(WxOrderInfo wxOrderInfo, OrderInfo orderInfo) {
        ArrayList<OrderItem> orderItems = new ArrayList<>(1);
        Long deviceId = wxOrderInfo.getDeviceId();
        String rangeCode = wxOrderInfo.getRangeCode();
        GoodsInfo goodsInfo = wxGoodsService.getRentalGoodsInfoByRangeCode(rangeCode).orElseThrow(DataParamsErrorResultRuntimeException::new);
        DeviceInfo deviceInfo = wxDeviceService.getById(deviceId).orElseThrow(DataParamsErrorResultRuntimeException::new);
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
        orderItems.add(orderItem);
        return orderItems;
    }

    @Override
    public List<OrderItem> createContinueOrderItem(WxOrderInfo wxOrderInfo) {
        ArrayList<OrderItem> orderItems = new ArrayList<>();
        Long deviceId = wxOrderInfo.getDeviceId();
        String rangeCode = wxOrderInfo.getRangeCode();
        Long orderId = wxOrderInfo.getOrderId();
        DeviceInfo deviceInfo = wxDeviceService.getById(deviceId).orElseThrow(DataParamsErrorResultRuntimeException::new);
        GoodsInfo goodsInfo = wxGoodsService.getContinueGoodsInfoByRangeCode(rangeCode).orElseThrow(DataParamsErrorResultRuntimeException::new);
        OrderInfo orderInfo = wxOrderService.getById(orderId).orElseThrow(DataParamsErrorResultRuntimeException::new);
        OrderItem orderItem = new OrderItem();
        orderItem.setType(0);
        orderItem.setOrderId(orderInfo.getId());
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
        Date endTime = getEndTime(orderItem.getStartTime(), goodsInfo.getTimeInterval(), goodsInfo.getTimeUnit());
        orderItem.setEndTime(endTime);
        orderItem.setTimeUseAmount(getTimeUse(orderItem.getStartTime(), endTime));
        orderItem.setWaterPrice(goodsInfo.getWaterPrice());
        orderItem.setWaterSpace(wxOrderInfo.getWaterCost());
        orderItem.setWaterUnit(goodsInfo.getWaterUnit());
        orderItem.setWaterTotalPrice(getWaterCost(wxOrderInfo.getWaterCost(), goodsInfo.getWaterPrice(), goodsInfo.getWaterSpace(), goodsInfo.getWaterUnit()));
        orderItem.setTotalPrice(goodsInfo.getTimePrice().add(goodsInfo.getWaterPrice()));
        orderItem.setRemainPrice(new BigDecimal("0"));
        return orderItems;
    }

    private BigDecimal getTimeUse(Date startTime, Date endTime) {
        return new BigDecimal((endTime.getTime() - startTime.getTime()) / 1000 / 60);
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

    private BigDecimal getWaterCost(BigDecimal space, BigDecimal price, BigDecimal internal, Integer unit) {
        return space.divide(internal, 3).multiply(price);
    }

}
