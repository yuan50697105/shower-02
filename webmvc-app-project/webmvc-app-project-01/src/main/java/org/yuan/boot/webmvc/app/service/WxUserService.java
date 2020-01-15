package org.yuan.boot.webmvc.app.service;

import com.github.binarywang.wxpay.exception.WxPayException;
import org.yuan.boot.webmvc.app.pojo.vo.WxUserOrderVo;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 22:00
 */
public interface WxUserService {
    Result getInfoByOpenId(String openId);

    Result getOrderInfoByOpenId(String openId);

    Result addOrder(WxUserOrderVo wxUserOrderVo);

    Result payOrder(WxUserOrderVo orderVo) throws WxPayException;

    Result payNotify(WxUserOrderVo orderVo);
}
