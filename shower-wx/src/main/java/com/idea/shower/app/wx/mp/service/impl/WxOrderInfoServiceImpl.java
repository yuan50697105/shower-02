package com.idea.shower.app.wx.mp.service.impl;

import cn.hutool.core.lang.Snowflake;
import com.idea.shower.app.db.module.constants.order.OrderStatus;
import com.idea.shower.app.db.module.dao.*;
import com.idea.shower.app.db.module.pojo.*;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.app.wx.mp.pojo.WxOrderInfoRequest;
import com.idea.shower.app.wx.mp.pojo.WxPayOrderInfo;
import com.idea.shower.app.wx.mp.pojo.WxReturnInfo;
import com.idea.shower.app.wx.mp.service.WxOrderInfoService;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 15:20
 */
@Service
@AllArgsConstructor
public class WxOrderInfoServiceImpl implements WxOrderInfoService {
    private static final String NOTIFY_URL = "";
    private static final String PAY_BODY = "消费";
    private static final String PAY_SUCCESS = "SUCCESS";
    private static final String PAY_FAIL = "FAIL";
    private DeviceInfoDao deviceInfoDao;
    private CustomerInfoDao customerInfoDao;
    private PriceInfoDao priceInfoDao;
    private OrderInfoDao orderInfoDao;
    private OrderItemDao orderItemDao;
    private Snowflake snowflake;

    /**
     * 添加订单
     *
     * @param wxOrderInfoRequest 订单信息封装
     * @return 订单信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderInfoRequest wxOrderInfoRequest) {
        String deviceCode = wxOrderInfoRequest.getDeviceCode();
        String openId = wxOrderInfoRequest.getOpenId();
        Integer type = wxOrderInfoRequest.getType();
        DeviceInfo deviceInfo = deviceInfoDao.getByCode(deviceCode).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxDeviceNotFoundError()));
        CustomerInfo customerInfo = customerInfoDao.getByOpenId(openId).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxUserNotFoundError()));
        String priceCode = deviceInfo.getPriceCode();
        PriceInfo priceInfo = priceInfoDao.getStartingPricesByRangeCode(priceCode).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxPriceNotFoundError()));
        OrderInfo orderInfo = createOrder(customerInfo, type);
        orderInfoDao.save(orderInfo);
        List<OrderItem> orderItems = createOrderItem(orderInfo, deviceInfo, priceInfo);
        orderItemDao.batchSave(orderItems);
        return ResultUtils.data(orderInfo);
    }

    @Override
    public Result endOrder(WxOrderInfoRequest wxOrderInfoRequest) {
        return null;
    }

    @Override
    public Result payOrder(WxPayOrderInfo wxPayOrderInfo) {
        return null;
    }

    @Override
    public WxReturnInfo notify(String xml) {
        return null;
    }

    @Override
    public Result selectPage(OrderInfoQuery condition) {
        return null;
    }

    @Override
    public Result getOrderItem(Long orderId) {
        return null;
    }

    /**
     * 创建订单子方法
     *
     * @param customerInfo 用户信息
     * @param orderType    订单类型
     * @return 订单信息
     */
    private OrderInfo createOrder(CustomerInfo customerInfo, Integer orderType) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderNo(snowflake.nextIdStr());
        orderInfo.setType(orderType);
        orderInfo.setCustomerId(customerInfo.getId());
        orderInfo.setCustomerOpenId(customerInfo.getOpenId());
        orderInfo.setCustomerUnionId(customerInfo.getUnionId());
        orderInfo.setTotalPrice(new BigDecimal("0"));
        orderInfo.setStatus(OrderStatus.ADD_ORDER);
        return orderInfo;
    }

    /**
     * 创建订单子项
     *
     * @param orderInfo  订单信息
     * @param deviceInfo 设备信息
     * @param priceInfo  定价信息
     * @return 订单子项列表
     */
    private List<OrderItem> createOrderItem(OrderInfo orderInfo, DeviceInfo deviceInfo, PriceInfo priceInfo) {
        ArrayList<OrderItem> orderItems = new ArrayList<>();
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(orderInfo.getId());
        orderItem.setOrderNo(orderInfo.getOrderNo());
        orderItem.setDeviceId(deviceInfo.getId());
        orderItem.setDeviceCode(deviceInfo.getCode());
        orderItem.setDeviceType(deviceInfo.getType());
        orderItem.setPriceCode(priceInfo.getCode());
        orderItem.setPriceId(priceInfo.getId());
        orderItem.setPriceType(priceInfo.getType());
        orderItem.setTimePrice(new BigDecimal("0"));
        orderItem.setTimeInterval(priceInfo.getTimeInterval());
        orderItem.setTimeUnit(priceInfo.getTimeUnit());
        Date startTime = new Date();
        orderItem.setStartTime(startTime);
        orderItem.setEndTime(calculationEndTime(startTime, priceInfo));
        orderItem.setTimeUse(0.0D);
        orderItem.setWaterPrice(priceInfo.getWaterPrice());
        orderItem.setWaterInterval(0.0D);
        orderItem.setWaterUse(0.0D);
        orderItem.setTotalPrice(new BigDecimal("0"));
        orderItems.add(orderItem);
        return orderItems;
    }

    /**
     * 结算结束时间
     *
     * @param startTime 开始时间
     * @param priceInfo 定价信息
     * @return 结束时间
     */
    private Date calculationEndTime(Date startTime, PriceInfo priceInfo) {
        Double timeInterval = priceInfo.getTimeInterval();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        calendar.set(Calendar.MINUTE, timeInterval.intValue());
        return calendar.getTime();
    }
}