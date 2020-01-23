package org.yuan.boot.shower.wx.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.shower.db.pojo.WxOrderInfo;
import org.yuan.boot.shower.wx.pojo.WxOrderVO;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 23:08
 */
@Mapper(componentModel = "spring")
public interface WxOrderConverter {

    // TODO: 2020/1/23  处理预支付订单模型
    WxOrderInfo convertForAddPrepay(WxOrderVO wxOrderVO);

    // TODO: 2020/1/23  处理普通订单模型
    WxOrderInfo convertForAddCommons(WxOrderVO wxOrderVO);

    // TODO: 2020/1/23 处理预约订单
    WxOrderInfo convertForAddAppointment(WxOrderVO wxOrderVO);

}
