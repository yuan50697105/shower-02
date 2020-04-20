package com.idea.shower.app.wx.mp.service.impl;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.crypto.SecureUtil;
import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.bean.result.WxPayUnifiedOrderResult;
import com.github.binarywang.wxpay.constant.WxPayConstants;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import com.idea.shower.amqp.module.pojo.AmqpDeviceInfo;
import com.idea.shower.amqp.module.sender.DeviceInfoSender;
import com.idea.shower.app.db.module.constants.OrderInfoConstants;
import com.idea.shower.app.db.module.constants.PriceInfoConstants;
import com.idea.shower.app.db.module.dao.*;
import com.idea.shower.app.db.module.pojo.*;
import com.idea.shower.app.db.module.pojo.query.OrderInfoQuery;
import com.idea.shower.app.wx.mp.pojo.*;
import com.idea.shower.app.wx.mp.service.WxOrderInfoService;
import com.idea.shower.db.core.pojo.WxPageResult;
import com.idea.shower.redis.module.dao.OrderRediskDao;
import com.idea.shower.redis.module.pojo.OrderRedisEntity;
import com.idea.shower.web.webmvc.exception.ResultRuntimeException;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;
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
    public static final String SUCCESS = "SUCCESS";
    private final Snowflake snowflake;
    private final DeviceInfoDao deviceInfoDao;
    private final CustomerInfoDao customerInfoDao;
    private final PriceInfoDao priceInfoDao;
    private final OrderInfoDao orderInfoDao;
    private final OrderItemDao orderItemDao;
    private final OrderRediskDao orderRediskDao;
    private final DeviceOrderDao deviceOrderDao;
    private final DeviceInfoSender deviceInfoSender;
    private final WxPayService wxPayService;

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
                // TODO: 2020/4/1 处理普通订单，额外流程
//                创建普通订单
//                openRoom(orderInfo);
                updateOrderStatusToUsing(orderInfo.getId());
                break;
            case OrderInfoConstants.OrderType.RESERVATION:
                // TODO: 2020/4/1 处理预约订单，额外流程
                updateOrderStatusToUsing(orderInfo.getId());
//                创建预约订单
//                OrderRedisEntity orderRedisEntity = createOrderRedisEntity(orderInfo, deviceInfo);
//                orderRediskDao.setOrderInTime(orderRedisEntity);
                break;
            default:
                throw new ResultRuntimeException(ResultUtils.dataParamsError("错误订单类型"));
        }
        return ResultUtils.data(orderInfo);
    }

    /**
     * 使用设备
     *
     * @param request 使用设备请求实体
     * @return 处理通知
     */
    @Override
    public Result useOrder(WxUseOrderRequest request) {
        // TODO: 2020/4/1 使用订单，两种公用
        String orderNo = request.getOrderNo();
        String deviceCode = request.getDeviceCode();
        String openId = request.getOpenId();
        OrderInfo orderInfo = orderInfoDao.getByOrderNo(orderNo).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxOrderNotExistError()));
        if (!orderInfo.getCustomerOpenId().equals(openId)) {
//            验证通过
            throw new ResultRuntimeException(ResultUtils.wxOrderUserInfoError());
        }
        switch (orderInfo.getType()) {
            case OrderInfoConstants.OrderType.COMMONS:
//                openRoom(orderInfo);
                updateOrderStatusToUsing(orderInfo.getId());
                break;
            case OrderInfoConstants.OrderType.RESERVATION:
//                todo 检查超时
//                boolean result = checkOrderInTime(orderInfo);
                updateOrderStatusToUsing(orderInfo.getId());
                break;
            default:
                throw new ResultRuntimeException(ResultUtils.dataParamsError());
        }
        return null;
    }

    /**
     * 更新订单状态为使用中
     *
     * @param orderId 订单ID
     */
    private void updateOrderStatusToUsing(Long orderId) {
        orderInfoDao.updateStatusUsingByOrderId(orderId);
        deviceOrderDao.updateStatusUsingByOrderInfoId(orderId);
    }

    @Override
    public Result endOrder(WxEndOrderRequest wxAddOrderRequest) {
        Date finalTime = new Date();
        String orderNo = wxAddOrderRequest.getOrderNo();
        OrderInfo orderInfo = orderInfoDao.getByOrderNo(orderNo).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxOrderNotExistError()));
        OrderItem startingItem = orderItemDao.getStartingItemByOrderId(orderInfo.getId());
        Date endTime = startingItem.getEndTime();
        Double waterUse = startingItem.getWaterUse();
        Double deviceWaterUse = getDeviceWaterUse(orderInfo.getDeviceCode());
        if (checkHasExtPriceInfo(finalTime, endTime, waterUse, deviceWaterUse)) {
            addExtOrderItemPriceInfo(orderInfo, endTime, finalTime, deviceWaterUse - waterUse);
        }
        BigDecimal totalprice = calculationOrderFee(orderInfo);
        orderInfoDao.updateTotalPriceByOrderNo(totalprice, orderInfo.getOrderNo());
        HashMap<String, Object> map = new HashMap<>();
        map.put("orderNo", orderNo);
        map.put("totalPrice", totalprice);
        return ResultUtils.data(map);
    }

    /**
     * 支付订单
     *
     * @param wxPayOrderInfo 支付信息封装
     * @return 处理结果
     */
    @Override
    public Result payOrder(WxPayOrderInfo wxPayOrderInfo) throws WxPayException {
        String orderNo = wxPayOrderInfo.getOrderNo();
        OrderInfo orderInfo = orderInfoDao.getByOrderNo(orderNo).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxOrderNotExistError()));
        WxPayUnifiedOrderRequest request = createUnifiedPayRequest(orderInfo);
        WxPayUnifiedOrderResult wxPayUnifiedOrderResult = wxPayService.unifiedOrder(request);
        if (!wxPayUnifiedOrderResult.getReturnCode().equals(SUCCESS)) {
            throw new ResultRuntimeException(ResultUtils.wxError(wxPayUnifiedOrderResult.getReturnMsg()));
        } else {
            if (!wxPayUnifiedOrderResult.getResultCode().equals(SUCCESS)) {
                throw new ResultRuntimeException(ResultUtils.wxError(wxPayUnifiedOrderResult.getErrCode()));
            } else {
                Map<String, Object> payEntity = createPayEntity(wxPayUnifiedOrderResult);
                return ResultUtils.data(payEntity);
            }
        }
    }

    /**
     * 支付回调
     *
     * @param xml 回调信息
     * @return 处理结果
     */
    @Override
    public WxReturnInfo notify(String xml) throws WxPayException {
        WxPayOrderNotifyResult wxPayOrderNotifyResult = wxPayService.parseOrderNotifyResult(xml);
        String returnCode = wxPayOrderNotifyResult.getReturnCode();
        if (!returnCode.equals(SUCCESS)) {
            throw new ResultRuntimeException(ResultUtils.wxError(wxPayOrderNotifyResult.getReturnMsg()));
        } else {
            if (!wxPayOrderNotifyResult.getResultCode().equals(SUCCESS)) {
                throw new ResultRuntimeException(ResultUtils.wxError(wxPayOrderNotifyResult.getReturnMsg()));
            } else {
                WxReturnInfo wxReturnInfo = new WxReturnInfo();
                wxReturnInfo.setReturn_code(SUCCESS);
                wxReturnInfo.setReturn_msg(SUCCESS);
                return wxReturnInfo;
            }

        }
    }

    /**
     * 分页查询
     *
     * @param condition 条件
     * @return
     */
    @Override
    public Result selectPage(OrderInfoQuery condition) {
        WxPageResult<OrderInfo> pageResult = orderInfoDao.selectPageByConditionWeXin(condition);
        return ResultUtils.data(pageResult);
    }

    /**
     * 获取订单详情
     *
     * @param orderNo 订单号
     * @return
     */
    @Override
    public Result getOrderItemByOrderNo(String orderNo) {
        List<OrderItem> orderItems = orderItemDao.selectListByOrderNo(orderNo);
        return ResultUtils.data(orderItems);
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
        orderItem.setTimeUse(priceInfo.getTimeInterval());
        orderItem.setWaterPrice(priceInfo.getWaterPrice());
        orderItem.setWaterInterval(priceInfo.getWaterInterval());
        orderItem.setWaterUse(priceInfo.getWaterInterval());
        orderItem.setTotalPrice(priceInfo.getWaterPrice().add(priceInfo.getTimePrice()));
        orderItems.add(orderItem);
        return orderItems;
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
     * 计算起租结束时间
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

    /**
     * 推送开启房间信息
     *
     * @param orderInfo 订单信息
     */
    private void openRoom(OrderInfo orderInfo) {
        AmqpDeviceInfo amqpDeviceInfo = new AmqpDeviceInfo();
        amqpDeviceInfo.setDeviceCode(orderInfo.getDeviceCode());
        amqpDeviceInfo.setDeviceId(orderInfo.getDeviceId());
        amqpDeviceInfo.setOrderNo(orderInfo.getOrderNo());
        amqpDeviceInfo.setOrderId(orderInfo.getId());
        amqpDeviceInfo.setOpenId(orderInfo.getCustomerOpenId());
        deviceInfoSender.sendAndRec(amqpDeviceInfo);

    }

    /**
     * 检查订单是否超时
     *
     * @param orderInfo 订单信息
     * @return 超时true 未超时 false
     */
    private boolean checkOrderInTime(OrderInfo orderInfo) {
        return orderInfo.getStatus().equals(OrderInfoConstants.OrderStatus.ORDER_OUT_TIME);
    }

    /**
     * 检查是否有额外费用
     *
     * @param finalTime      最终时间
     * @param endTime        起租时间
     * @param waterUse       起租用水量
     * @param deviceWaterUse 实际用水量
     * @return 有 true 无 false
     */
    private boolean checkHasExtPriceInfo(Date finalTime, Date endTime, Double waterUse, Double deviceWaterUse) {
        return endTime.before(finalTime) || waterUse.doubleValue() > deviceWaterUse.doubleValue();
    }

    /**
     * 添加额外费用
     *
     * @param orderInfo 订单信息
     */
    private void addExtOrderItemPriceInfo(OrderInfo orderInfo, Date startTime, Date endTime, Double waterUse) {
        DeviceInfo deviceInfo = deviceInfoDao.getByCode(orderInfo.getDeviceCode()).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxDeviceNotFoundError()));
        PriceInfo priceInfo = priceInfoDao.getRenewalPriceByPriceCode(deviceInfo.getPriceCode()).orElseThrow(() -> new ResultRuntimeException(ResultUtils.wxPriceNotFoundError()));
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(orderInfo.getId());
        orderItem.setOrderNo(orderInfo.getOrderNo());
        orderItem.setDeviceId(orderInfo.getDeviceId());
        orderItem.setDeviceCode(orderInfo.getDeviceCode());
        orderItem.setDeviceType(orderInfo.getType());
        orderItem.setPriceCode(priceInfo.getCode());
        orderItem.setPriceId(priceInfo.getId());
        orderItem.setPriceType(priceInfo.getType());
        orderItem.setTimePrice(priceInfo.getTimePrice());
        orderItem.setTimeInterval(priceInfo.getTimeInterval());
        orderItem.setTimeUnit(priceInfo.getTimeUnit());
        orderItem.setStartTime(startTime);
        orderItem.setEndTime(endTime);
        orderItem.setTimeUse((double) calculationExtTimeUse(startTime, endTime, priceInfo.getTimeUnit()));
        orderItem.setWaterPrice(priceInfo.getWaterPrice());
        orderItem.setWaterInterval(priceInfo.getWaterInterval());
        orderItem.setWaterUnit(priceInfo.getWaterUnit());
        orderItem.setWaterUse(waterUse);
        orderItem.setTotalPrice(calculationExtTotalFee(orderItem.getTimeUse(), orderItem.getTimeInterval(), orderItem.getTimePrice(), orderItem.getWaterUse(), orderItem.getWaterInterval(), orderItem.getWaterPrice()));
        orderItemDao.save(orderItem);

    }

    /**
     * 计算额外总费用
     *
     * @return 额外费用
     */
    private BigDecimal calculationExtTotalFee(Double timeUse, Double timeInternal, BigDecimal timePrice, Double waterUse, Double waterInternal, BigDecimal waterPrice) {
        BigDecimal bigDecimal = new BigDecimal("0");
        bigDecimal.add(new BigDecimal(timeUse / timeInternal).multiply(timePrice));
        bigDecimal.add(new BigDecimal(waterUse / waterInternal).multiply(waterPrice));
        return bigDecimal;
    }

    /**
     * 计算额外时间使用
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param timeUnit  时间单位
     * @return 时间用量
     */
    private long calculationExtTimeUse(Date startTime, Date endTime, Integer timeUnit) {
        switch (timeUnit) {
            case PriceInfoConstants.PriceTimeUnit.MINUTE:
                return DateUtil.between(startTime, endTime, DateUnit.MINUTE);
            case PriceInfoConstants.PriceTimeUnit.HOUR:
                return DateUtil.between(startTime, endTime, DateUnit.HOUR);
            default:
                throw new ResultRuntimeException(ResultUtils.dataParamsError());
        }
    }

    /**
     * 获取设备的用水量
     *
     * @param deviceCode 设备号
     * @return 用户量
     */
    private Double getDeviceWaterUse(String deviceCode) {
        AmqpDeviceInfo amqpDeviceInfo = new AmqpDeviceInfo();
        amqpDeviceInfo.setDeviceCode(deviceCode);
        return deviceInfoSender.sendAndGetWaterUse(amqpDeviceInfo);
    }

    /**
     * 计算订单总费用
     *
     * @param orderInfo 订单信息
     */
    private BigDecimal calculationOrderFee(OrderInfo orderInfo) {
        BigDecimal bigDecimal = new BigDecimal("0");
        List<OrderItem> orderItems = orderItemDao.selectListByOrderNo(orderInfo.getOrderNo());
        bigDecimal.add(orderItems.stream().map(OrderItem::getTotalPrice).reduce(BigDecimal::add).orElse(new BigDecimal("0")));
        return bigDecimal;
    }

    /**
     * 创建统一下单实体
     *
     * @param orderInfo 订单信息
     * @return 统一下单实体
     */
    private WxPayUnifiedOrderRequest createUnifiedPayRequest(OrderInfo orderInfo) {
        WxPayUnifiedOrderRequest request = new WxPayUnifiedOrderRequest();
        request.setBody("订单" + orderInfo.getOrderNo() + "消费" + orderInfo.getTotalPrice() + "元");
        request.setOutTradeNo(orderInfo.getOrderNo());
        request.setTotalFee(WxPayUnifiedOrderRequest.yuanToFen(orderInfo.getTotalPrice().toPlainString()));
        request.setOpenid(orderInfo.getCustomerOpenId());
        request.setTradeType(WxPayConstants.TradeType.JSAPI);
        return request;
    }

    /**
     * 创建预支付订单信息
     *
     * @param wxPayUnifiedOrderResult 统一下单结果
     * @return 支付实体
     */
    private TreeMap<String, Object> createPayEntity(WxPayUnifiedOrderResult wxPayUnifiedOrderResult) {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("appId", wxPayUnifiedOrderResult.getAppid());
        treeMap.put("timeStamp", System.currentTimeMillis() / 1000);
        treeMap.put("nonceStr", wxPayUnifiedOrderResult.getNonceStr());
        treeMap.put("package", "prepay_id=" + wxPayUnifiedOrderResult.getPrepayId());
        treeMap.put("signType", "MD5");
        StringJoiner stringBuilder = new StringJoiner("&");
        for (Map.Entry<String, Object> entry : treeMap.entrySet()) {
            String value = entry.getKey() + "=" + entry.getValue();
            stringBuilder.add(value);
        }
        String paySign = SecureUtil.md5(stringBuilder.toString());
        treeMap.put("paySign", paySign);
        return treeMap;
    }


}