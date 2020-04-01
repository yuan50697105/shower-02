package com.idea.shower.app.wx.mp.service.impl;

import cn.hutool.core.lang.Snowflake;
import com.idea.shower.app.db.module.constants.OrderInfoConstants;
import com.idea.shower.app.db.module.dao.*;
import com.idea.shower.app.db.module.pojo.*;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.app.wx.mp.pojo.*;
import com.idea.shower.app.wx.mp.service.WxOrderInfoService;
import com.idea.shower.redis.module.dao.OrderRediskDao;
import com.idea.shower.redis.module.pojo.OrderRedisEntity;
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
import java.util.concurrent.TimeUnit;


/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 15:20
 */
@Service
@AllArgsConstructor
public class WxOrderInfoServiceImpl implements WxOrderInfoService {
    /**
     * 默认预约等待时间
     */
    public static final int DEFAULT_TIME = 10;
    private Snowflake snowflake;
    private DeviceInfoDao deviceInfoDao;
    private CustomerInfoDao customerInfoDao;
    private PriceInfoDao priceInfoDao;
    private OrderInfoDao orderInfoDao;
    private OrderItemDao orderItemDao;
    private OrderRediskDao orderRediskDao;
    private DeviceOrderDao deviceOrderDao;

    /**
     * 添加订单
     *
     * @param wxAddOrderRequest 订单信息封装
     * @return 订单信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxAddOrderRequest wxAddOrderRequest) {
        String deviceCode = wxAddOrderRequest.getDeviceCode();
        String openId = wxAddOrderRequest.getOpenId();
        Integer type = wxAddOrderRequest.getType();
//        设备信息
        DeviceInfo deviceInfo = deviceInfoDao.getByCode(deviceCode).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxDeviceNotFoundError()));
//        用户信息
        CustomerInfo customerInfo = customerInfoDao.getByOpenId(openId).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxUserNotFoundError()));
//        计费编号
        String priceCode = deviceInfo.getPriceCode();
//        起租价计费信息
        PriceInfo priceInfo = priceInfoDao.getStartingPricesPriceCode(priceCode).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxPriceNotFoundError()));
        OrderInfo orderInfo = createOrder(customerInfo, deviceInfo, type);
        orderInfoDao.save(orderInfo);
        List<OrderItem> orderItems = createOrderItem(orderInfo, deviceInfo, priceInfo);
        orderItemDao.batchSave(orderItems);
        DeviceOrder deviceOrder = createDeviceOrder(deviceInfo, orderInfo);
        deviceOrderDao.save(deviceOrder);
        switch (type) {
            case OrderInfoConstants.OrderType.COMMONS:
//                创建普通订单
                break;
            case OrderInfoConstants.OrderType.RESERVATION:
//                创建预约订单
//                OrderRedisEntity orderRedisEntity = createOrderRedisEntity(orderInfo, deviceInfo);
//                orderRediskDao.addOrderKeepTime(orderRedisEntity);
                break;
            default:
                throw new ResultRuntimeException(ResultUtils.dataParamsError("错误订单类型"));
        }
        return ResultUtils.data(orderInfo);
    }

    @Override
    public Result endOrder(WxEndOrderRequest wxAddOrderRequest) {
        // TODO: 2020/4/1 处理结束订单，微信发起
        String orderNo = wxAddOrderRequest.getOrderNo();
        String openId = wxAddOrderRequest.getOpenId();
        OrderInfo orderInfo = orderInfoDao.getByIdOrOrderNo(orderNo).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxOrderNotExistError()));
        // TODO: 2020/4/1 需要获取水用量
        calculationFee(orderInfo);
        return null;
    }

    @Override
    public Result useOrder(WxUseOrderRequest request) {
        // TODO: 2020/4/1 使用订单，两种公用
        String orderNo = request.getOrderNo();
        String deviceCode = request.getDeviceCode();
        String openId = request.getOpenId();
        return null;
    }

    /**
     * 计算费用
     *
     * @param orderInfo 订单信息
     */
    private void calculationFee(OrderInfo orderInfo) {
//        结束时间
        Date endTime = new Date();
        Long id = orderInfo.getId();
        OrderItem orderItem = orderItemDao.getStartingItemByOrderId(orderInfo.getId());
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
     * @param deviceInfo   设备信息
     * @param orderType    订单类型
     * @return 订单信息
     */
    private OrderInfo createOrder(CustomerInfo customerInfo, DeviceInfo deviceInfo, Integer orderType) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderNo(snowflake.nextIdStr());
        orderInfo.setType(orderType);
        orderInfo.setCustomerId(customerInfo.getId());
        orderInfo.setCustomerOpenId(customerInfo.getOpenId());
        orderInfo.setCustomerUnionId(customerInfo.getUnionId());
        orderInfo.setDeviceCode(deviceInfo.getCode());
        orderInfo.setDeviceId(deviceInfo.getId());
        orderInfo.setTotalPrice(new BigDecimal("0"));
        orderInfo.setStatus(OrderInfoConstants.OrderStatus.ADD_ORDER);
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

    /**
     * 创建设备订单
     *
     * @param deviceInfo 设备信息
     * @param orderInfo  订单信息
     * @return 设备订单实体
     */
    private DeviceOrder createDeviceOrder(DeviceInfo deviceInfo, OrderInfo orderInfo) {
        DeviceOrder deviceOrder = new DeviceOrder();
        deviceOrder.setDeviceId(deviceInfo.getId());
        deviceOrder.setDeviceCode(deviceInfo.getCode());
        deviceOrder.setRangeCode(deviceInfo.getPriceCode());
        deviceOrder.setDeviceType(deviceInfo.getType());
        deviceOrder.setOrderId(orderInfo.getId());
        deviceOrder.setOrderNo(orderInfo.getOrderNo());
        deviceOrder.setOrderType(orderInfo.getType());
        deviceOrder.setCustomerId(orderInfo.getCustomerId());
        deviceOrder.setUnionId(orderInfo.getCustomerUnionId());
        deviceOrder.setOpenId(orderInfo.getCustomerOpenId());
        deviceOrder.setStatus(orderInfo.getStatus());
        deviceOrder.setStartTime(orderInfo.getCreateTime());
        deviceOrder.setEndTime(null);
        return deviceOrder;
    }

    /**
     * 创建订单计时
     *
     * @param orderInfo  订单信息
     * @param deviceInfo 设备信息
     * @return 计时实体
     */
    private OrderRedisEntity createOrderRedisEntity(OrderInfo orderInfo, DeviceInfo deviceInfo) {
        OrderRedisEntity entity = new OrderRedisEntity();
        entity.setOrderId(orderInfo.getId());
        entity.setOrderNo(orderInfo.getOrderNo());
        entity.setDeviceId(deviceInfo.getId());
        entity.setDeviceCode(deviceInfo.getCode());
        entity.setCustomerId(orderInfo.getCustomerId());
        entity.setOpenId(orderInfo.getCustomerOpenId());
        entity.setTime(DEFAULT_TIME);
        entity.setUnit(TimeUnit.MINUTES);
        return entity;
    }
}