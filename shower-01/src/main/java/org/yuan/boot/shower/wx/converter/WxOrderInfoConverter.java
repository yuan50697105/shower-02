package org.yuan.boot.shower.wx.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.wx.pojo.WxOrderInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:09
 */
@Mapper(componentModel = "spring")
public interface WxOrderInfoConverter {

    @Mappings({

            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true),
            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "orderNo", ignore = true),
            @org.mapstruct.Mapping(target = "id", ignore = true),
            @org.mapstruct.Mapping(target = "customerNickName", ignore = true),
            @org.mapstruct.Mapping(target = "orderStatus", ignore = true),
            @org.mapstruct.Mapping(target = "totalPrice", ignore = true),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "updateUser", ignore = true)
    })
    OrderInfo convertForCommonsOrder(WxOrderInfo wxOrderInfo);

}
