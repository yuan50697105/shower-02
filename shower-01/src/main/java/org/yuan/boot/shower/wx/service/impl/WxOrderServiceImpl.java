package org.yuan.boot.shower.wx.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.service.WxPayService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.WxOrderInfoDao;
import org.yuan.boot.shower.db.pojo.WxOrderInfoCondition;
import org.yuan.boot.shower.wx.converter.WxOrderConverter;
import org.yuan.boot.shower.wx.pojo.WxOrderVO;
import org.yuan.boot.shower.wx.service.WxAppointmentOrderService;
import org.yuan.boot.shower.wx.service.WxCommonsOrderService;
import org.yuan.boot.shower.wx.service.WxOrderService;
import org.yuan.boot.shower.wx.service.WxPrepayOrderService;
import org.yuan.boot.webmvc.exception.DataParamsErrorResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;

import static org.yuan.boot.shower.wx.pojo.WxOrderConstants.OrderType.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:44
 */
@Service
@AllArgsConstructor
public class WxOrderServiceImpl implements WxOrderService {
    private WxOrderInfoDao wxOrderInfoDao;
    private WxOrderConverter wxOrderConverter;
    private WxMaService wxMaService;
    private WxPayService wxPayService;
    private WxPrepayOrderService wxPrepayOrderService;
    private WxCommonsOrderService wxCommonsOrderService;
    private WxAppointmentOrderService wxAppointmentOrderService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result addOrder(WxOrderVO wxOrderVO) {
        switch (wxOrderVO.getType()) {
            case PREPAY:
                return wxPrepayOrderService.addOrder(wxOrderVO);
            case COMMONS:
                return wxCommonsOrderService.addOrder(wxOrderVO);
            case APPOINTMENT:
                return wxAppointmentOrderService.addOrder(wxOrderVO);
            default:
                throw new DataParamsErrorResultRuntimeException("订单类型错误");
        }
    }

    @Override
    public Result getOrderList(WxOrderInfoCondition wxOrderInfoCondition) {
        return Results.data(wxOrderInfoDao.selectPageOrderByCreateTimeDesc(wxOrderInfoCondition));
    }

    // TODO: 2020/1/20 支付需测试
    @SneakyThrows
    @Override
    public Result pay(Long orderId) {
// TODO: 2020/1/23  订单支付流程处理
        return null;
    }

    // TODO: 2020/1/20 回调需测试
    @SneakyThrows
    @Override
    public Result doNotify(HttpServletRequest request) {
        ServletInputStream inputStream = request.getInputStream();
        String xml = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        WxPayOrderNotifyResult result = wxPayService.parseOrderNotifyResult(xml);
        return Results.data(result);
    }

}