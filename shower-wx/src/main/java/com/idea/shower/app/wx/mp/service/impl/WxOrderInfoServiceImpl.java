package com.idea.shower.app.wx.mp.service.impl;

import cn.hutool.core.util.IdUtil;
import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.github.binarywang.wxpay.constant.WxPayConstants;
import com.github.binarywang.wxpay.service.WxPayService;
import com.idea.shower.app.db.module.constants.order.OrderStatus;
import com.idea.shower.app.db.module.constants.order.OrderType;
import com.idea.shower.app.db.module.dao.*;
import com.idea.shower.app.db.module.pojo.*;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.app.db.module.utils.goods.GoodsUtils;
import com.idea.shower.app.wx.mp.pojo.WxOrderInfo;
import com.idea.shower.app.wx.mp.pojo.WxPayOrderInfo;
import com.idea.shower.app.wx.mp.pojo.WxReturnInfo;
import com.idea.shower.app.wx.mp.service.WxOrderInfoService;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;


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
    private CustomerInfoDao customerInfoDao;
    private OrderInfoDao orderInfoDao;
    private PriceInfoDao priceInfoDao;
    private OrderItemDao orderItemDao;
    private WxPayService wxPayService;
    private DeviceOrderDao deviceOrderDao;

    /**
     * 添加订单
     *
     * @param wxOrderInfo 订单信息封装
     * @return 处理结果
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderInfo wxOrderInfo) {
        OrderInfo orderInfo;
        switch (wxOrderInfo.getType()) {
            case OrderType.COMMONS:
                orderInfo = addCommonsOrder(wxOrderInfo);
                break;
            case OrderType.RESERVATION:
                orderInfo = addReservationOrder(wxOrderInfo);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + wxOrderInfo.getType());
        }
        // TODO: 2020/2/14 需要细节化
        return ResultUtils.data(orderInfo);
    }

    /**
     * 结束订单
     *
     * @param wxOrderInfo 订单信息封装
     * @return 处理结果
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result endOrder(WxOrderInfo wxOrderInfo) {
        Long orderId = wxOrderInfo.getOrderId();
        Optional<OrderInfo> orderInfoOptional = orderInfoDao.getById(orderId);
        if (orderInfoOptional.isPresent()) {
            OrderInfo orderInfo = orderInfoOptional.get();
            Optional<OrderItem> orderItem = orderItemDao.getRentalItemByOrderId(wxOrderInfo.getOrderId());
            if (orderItem.isPresent()) {
                OrderItem item = orderItem.get();
                Date continueEndTime = new Date();
                if (GoodsUtils.isProduceContinueTimeUse(item.getEndTime(), continueEndTime) || GoodsUtils.isProduceContinueWaterUse(wxOrderInfo.getWaterUse(), item.getWaterUse())) {
                    PriceInfo priceInfo = priceInfoDao.getRenewalPriceByRangeCode(item.getRangeCode()).orElseThrow(() -> new ResultRuntimeException(ResultUtils.goodsInfoNotExistError()));
                    OrderItem continueOrderItem = createContinueOrderItem(item, continueEndTime, wxOrderInfo, orderInfo, priceInfo);
                    orderItemDao.save(continueOrderItem);
                }
            }
            orderInfo.setStatus(OrderStatus.END_USE);
        } else {
            throw new ResultRuntimeException(ResultUtils.wxOrderNotExistError());
        }
        updateStatusDeviceOrderEndUse(wxOrderInfo.getOrderId());
        return ResultUtils.data(orderInfoOptional);
    }

    @SneakyThrows
    @Override
    public Result payOrder(WxPayOrderInfo wxPayOrderInfo) {
        WxPayUnifiedOrderRequest.WxPayUnifiedOrderRequestBuilder requestBuilder = WxPayUnifiedOrderRequest.newBuilder();
        requestBuilder.body(PAY_BODY);
        requestBuilder.outTradeNo(wxPayOrderInfo.getOrderNo());
        requestBuilder.totalFee(WxPayUnifiedOrderRequest.yuanToFen(wxPayOrderInfo.getTotalPrice().toPlainString()));
        requestBuilder.notifyUrl(NOTIFY_URL);
        requestBuilder.tradeType(WxPayConstants.TradeType.JSAPI);
        WxPayUnifiedOrderResult orderResult = wxPayService.unifiedOrder(requestBuilder.build());
        return ResultUtils.data(orderResult);
    }

    @SneakyThrows
    @Override
    public WxReturnInfo notify(String xml) {
        WxReturnInfo.WxReturnInfoBuilder wxReturnInfoBuilder = WxReturnInfo.builder();
        WxPayOrderNotifyResult notifyResult = wxPayService.parseOrderNotifyResult(xml);
        String resultCode = notifyResult.getResultCode();
        if (resultCode.equals(PAY_SUCCESS)) {
            // TODO: 2020/2/14 处理支付锁
            updateOrderInfoStatusPaid(notifyResult.getOutTradeNo());
            updateDeviceOrderStatusPaid(notifyResult.getOutTradeNo());
            wxReturnInfoBuilder.return_code(PAY_SUCCESS);
            wxReturnInfoBuilder.return_msg("成功");
        } else {
            wxReturnInfoBuilder.return_code(PAY_FAIL);
        }
        return wxReturnInfoBuilder.build();
    }

    @Override
    public Result data(OrderInfoQuery condition) {
        return ResultUtils.data(orderInfoDao.selectPageByCondition(condition), condition);
    }

    @Override
    public Result getOrderItem(Long orderId) {
        return ResultUtils.data(orderItemDao.selectListByOrderId(orderId));
    }

    /**
     * 添加预约订单
     *
     * @param wxOrderInfo 订单信息封装
     * @return 订单信息
     */
    private OrderInfo addReservationOrder(WxOrderInfo wxOrderInfo) {
        OrderInfo orderInfo = createOrderInfo(wxOrderInfo);
        orderInfoDao.save(orderInfo);
        OrderItem orderItem = createRentalOrderItem(wxOrderInfo, orderInfo);
        orderItemDao.save(orderItem);
        DeviceOrder deviceOrder = createDeviceOrder(wxOrderInfo, orderInfo);
        deviceOrderDao.save(deviceOrder);
        return orderInfo;
    }

    /**
     * 添加普通订单
     *
     * @param wxOrderInfo 订单信息封装
     * @return 订单信息
     */
    private OrderInfo addCommonsOrder(WxOrderInfo wxOrderInfo) {
        OrderInfo orderInfo = createOrderInfo(wxOrderInfo);
        orderInfoDao.save(orderInfo);
        OrderItem orderItem = createRentalOrderItem(wxOrderInfo, orderInfo);
        orderItemDao.save(orderItem);
        DeviceOrder deviceOrder = createDeviceOrder(wxOrderInfo, orderInfo);
        deviceOrderDao.save(deviceOrder);
        return orderInfo;
    }

    /**
     * 保存订单
     *
     * @param wxOrderInfo 订单信息封装
     * @return 订单信息
     */
    private OrderInfo createOrderInfo(WxOrderInfo wxOrderInfo) {
        OrderInfo orderInfo = new OrderInfo();
        Optional<CustomerInfo> customerInfo = customerInfoDao.getByUnionId(wxOrderInfo.getUnionId());
        orderInfo.setOrderNo(IdUtil.getSnowflake(1, 2).nextIdStr());
        orderInfo.setType(String.valueOf(OrderType.COMMONS));
        if (customerInfo.isPresent()) {
            CustomerInfo value = customerInfo.get();
            orderInfo.setCustomerId(value.getId());
            orderInfo.setCustomerOpenId(value.getOpenId());
            orderInfo.setCustomerUnionId(value.getUnionId());
        } else {
            throw new ResultRuntimeException(ResultUtils.userNotExistError());
        }
        orderInfo.setTotalPrice(new BigDecimal("0"));
        orderInfo.setStatus(OrderStatus.ADD_ORDER);
        return orderInfo;
    }

    private DeviceOrder createDeviceOrder(WxOrderInfo wxOrderInfo, OrderInfo orderInfo) {
        DeviceOrder deviceOrder = new DeviceOrder();
        deviceOrder.setDeviceId(wxOrderInfo.getDeviceId());
        deviceOrder.setDeviceCode(wxOrderInfo.getDeviceCode());
        deviceOrder.setRangeCode(wxOrderInfo.getRangeCode());
        deviceOrder.setDeviceType(wxOrderInfo.getType());
        deviceOrder.setOrderId(orderInfo.getId());
        deviceOrder.setOrderNo(orderInfo.getOrderNo());
        deviceOrder.setCustomerId(orderInfo.getCustomerId());
        deviceOrder.setUnionId(orderInfo.getCustomerUnionId());
        deviceOrder.setOpenId(orderInfo.getCustomerOpenId());
        return deviceOrder;
    }

    /**
     * 保存起租价
     *
     * @param wxOrderInfo 订单信息封装
     * @param orderInfo   订单信息
     * @return
     */
    private OrderItem createRentalOrderItem(WxOrderInfo wxOrderInfo, OrderInfo orderInfo) {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(orderInfo.getId());
        orderItem.setOrderNo(orderInfo.getOrderNo());
        orderItem.setDeviceId(wxOrderInfo.getDeviceId());
        orderItem.setDeviceCode(wxOrderInfo.getDeviceCode());
        orderItem.setDeviceType(wxOrderInfo.getType());
        orderItem.setRangeCode(wxOrderInfo.getRangeCode());
        Optional<PriceInfo> goodsInfo = priceInfoDao.getFromTheirPricesByRangeCode(wxOrderInfo.getRangeCode());
        if (goodsInfo.isPresent()) {
            PriceInfo value = goodsInfo.get();
            orderItem.setGoodsId(value.getId());
            orderItem.setGoodsType(Integer.valueOf(value.getType()));
            orderItem.setTimePrice(value.getTimePrice());
            orderItem.setTimeInterval(value.getTimeInterval());
            orderItem.setTimeUnit(value.getTimeUnit());
            orderItem.setStartTime(new Date());
            orderItem.setEndTime(GoodsUtils.getEndTime(orderItem.getStartTime(), orderItem.getTimeInterval(), orderItem.getTimeUnit()));
            orderItem.setTimeUse(value.getTimeInterval());
            orderItem.setWaterPrice(value.getWaterPrice());
            orderItem.setWaterInterval(value.getWaterInterval());
            orderItem.setWaterUnit(value.getWaterUnit());
            orderItem.setWaterUse(value.getWaterInterval());
            orderItem.setTotalPrice(value.getTimePrice().add(value.getWaterPrice()));
        }
        return orderItem;
    }

    /**
     * 创建额外时间费用
     *
     * @param rentalOrderItem 起租子项
     * @param continueEndTime 结束时间
     * @param wxOrderInfo     订单信息封装
     * @param orderInfo       订单信息
     * @param priceInfo       定价信息
     * @return 额外费用子项
     */
    private OrderItem createContinueOrderItem(OrderItem rentalOrderItem, Date continueEndTime, WxOrderInfo wxOrderInfo, OrderInfo orderInfo, PriceInfo priceInfo) {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(orderInfo.getId());
        orderItem.setOrderNo(rentalOrderItem.getOrderNo());
        orderItem.setDeviceId(rentalOrderItem.getDeviceId());
        orderItem.setDeviceCode(rentalOrderItem.getDeviceCode());
        orderItem.setDeviceType(rentalOrderItem.getDeviceType());
        orderItem.setRangeCode(rentalOrderItem.getRangeCode());
        orderItem.setGoodsId(priceInfo.getId());
        orderItem.setGoodsType(Integer.valueOf(priceInfo.getType()));
        orderItem.setTimePrice(priceInfo.getTimePrice());
        orderItem.setTimeInterval(priceInfo.getTimeInterval());
        orderItem.setTimeUnit(priceInfo.getTimeUnit());
        orderItem.setStartTime(rentalOrderItem.getEndTime());
        orderItem.setEndTime(continueEndTime);
        orderItem.setTimeUse(GoodsUtils.getTimeUse(rentalOrderItem.getEndTime(), continueEndTime, orderItem.getTimeUnit()));
        orderItem.setWaterInterval(priceInfo.getWaterInterval());
        orderItem.setWaterUnit(priceInfo.getWaterUnit());
        orderItem.setWaterUse(GoodsUtils.getWaterUse(rentalOrderItem.getWaterUse(), wxOrderInfo.getWaterUse()));
        orderItem.setTotalPrice(GoodsUtils.getTotalPrice(orderItem.getWaterUse(), orderItem.getWaterInterval(), orderItem.getWaterPrice(), orderItem.getTimeUse(), orderItem.getTimeInterval(), orderItem.getTimePrice()));
        return orderItem;
    }

    /**
     * 更新订单状态为已支付
     *
     * @param outTradeNo 订单号
     */
    private void updateOrderInfoStatusPaid(String outTradeNo) {
        orderInfoDao.updateStatusPaidByOrderNo(outTradeNo);
    }

    /**
     * 跟新设备订单为已支付
     *
     * @param outTradeNo 订单号
     */
    private void updateDeviceOrderStatusPaid(String outTradeNo) {
        deviceOrderDao.updateStatusDeviceOrderPaid(outTradeNo);
    }

    /**
     * 跟新设备订单为结束使用
     *
     * @param orderId 订单ID
     */
    private void updateStatusDeviceOrderEndUse(Long orderId) {
        deviceOrderDao.updateStatusDeviceOrderEndUse(orderId);
    }
}