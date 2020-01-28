package org.yuan.boot.shower.wx.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.service.WxPayService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.utils.Results;
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

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import java.nio.charset.StandardCharsets;

import static org.yuan.boot.shower.constant.core.OrderInfoConstants.OrderType.*;

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
    private WxMaService wxMaService;
    private WxPayService wxPayService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderInfo wxOrderInfo) {
        switch (wxOrderInfo.getType()) {
//            普通订单
            case COMMONS:
                return wxCommonsOrderService.addOrder(wxOrderInfo);
//                预付费订单
            case PREPAY:
                return wxPrepayOrderService.addOrder(wxOrderInfo);
//                预约订单
            case APPOINTMENT:
                return wxAppointmentOrderService.addOrder(wxOrderInfo);
            default:
                throw new DataParamsErrorResultRuntimeException("订单类型错误");
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result payNotify(WxOrderInfo wxOrderInfo) {
        return null;
    }

    @Override
    public Result data(OrderInfoCondition condition) {
        // TODO: 2020/1/23 查询订单信息
        return Results.data(orderInfoDao.selectPage(condition));
    }

    @SneakyThrows
    @Override
    public Result prepay(Long orderId) {
        // TODO: 2020/1/28 预支付
        WxPayUnifiedOrderRequest wxPayUnifiedOrderRequest = WxPayUnifiedOrderRequest.newBuilder().build();
        wxPayService.unifiedOrder(wxPayUnifiedOrderRequest);
        return Results.ok();
    }

    @Override
    public Result pay(Long orderId) {
        // TODO: 2020/1/28 支付费用
        return null;
    }

    @SneakyThrows
    @Override
    public Result payNotify(HttpServletRequest request) {
        ServletInputStream inputStream = request.getInputStream();
        String xmlResult = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        WxPayOrderNotifyResult wxPayOrderNotifyResult = wxPayService.parseOrderNotifyResult(xmlResult);
        // TODO: 2020/1/28 放入队列 防止重复
        return Results.ok();
    }


}