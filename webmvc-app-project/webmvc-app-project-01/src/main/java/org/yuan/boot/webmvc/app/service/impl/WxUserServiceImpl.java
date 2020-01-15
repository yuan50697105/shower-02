package org.yuan.boot.webmvc.app.service.impl;

import cn.hutool.json.JSONUtil;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.constant.WxPayConstants;
import com.github.binarywang.wxpay.service.WxPayService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import me.chanjar.weixin.mp.api.WxMpAiOpenService;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.dao.BaseCustomerInfoDao;
import org.yuan.boot.webmvc.app.dao.BaseDeviceInfoDao;
import org.yuan.boot.webmvc.app.dao.BaseGoodsInfoDao;
import org.yuan.boot.webmvc.app.dao.OrderInfoDao;
import org.yuan.boot.webmvc.app.pojo.converter.BaseCustomerInfoConverter;
import org.yuan.boot.webmvc.app.pojo.converter.OrderInfoConverter;
import org.yuan.boot.webmvc.app.pojo.dto.ConsumeInfoDTO;
import org.yuan.boot.webmvc.app.pojo.vo.WxUserOrderVo;
import org.yuan.boot.webmvc.app.service.BaseCodeService;
import org.yuan.boot.webmvc.app.service.WxUserService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.HashMap;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 22:00
 */
@Service
@AllArgsConstructor
public class WxUserServiceImpl implements WxUserService {
    private BaseCustomerInfoDao baseCustomerInfoDao;
    private BaseCustomerInfoConverter baseCustomerInfoConverter;
    private OrderInfoDao orderInfoDao;
    private OrderInfoConverter orderInfoConverter;
    private BaseGoodsInfoDao baseGoodsInfoDao;
    private BaseDeviceInfoDao baseDeviceInfoDao;
    private WxPayService wxPayService;
    private WxMpAiOpenService wxMpAiOpenService;
    private BaseCodeService baseCodeService;

    @SneakyThrows
    private Result getOpenIdByAuthCode(String authCode) {
        return null;
    }

    @Override
    public Result getInfoByOpenId(String openId) {

        return null;
    }

    @Override
    public Result getOrderInfoByOpenId(String openId) {
        return null;
    }

    @Override
    public Result addOrder(WxUserOrderVo wxUserOrderVo) {
        return null;
    }

    @Override
    public Result payOrder(WxUserOrderVo orderVo) {
        String orderSn = baseCodeService.getOrderSn();
        WxPayUnifiedOrderRequest wxPayUnifiedOrderRequest = new WxPayUnifiedOrderRequest();
        wxPayUnifiedOrderRequest.setTradeType(WxPayConstants.TradeType.JSAPI);
        wxPayUnifiedOrderRequest.setOutTradeNo(orderSn);
        wxPayUnifiedOrderRequest.setDetail("商品消费");
        wxPayUnifiedOrderRequest.setBody(JSONUtil.toJsonPrettyStr(new ConsumeInfoDTO()));

        return null;
    }

    @Override
    public Result payNotify(WxUserOrderVo orderVo) {
        return null;
    }

}