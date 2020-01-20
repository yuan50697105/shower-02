package org.yuan.boot.shower.wx.converter;

import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.shower.db.pojo.WxCustomer;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 19:25
 */
@Mapper(componentModel = "spring")
public interface WxCustomerConverter {

    @Mappings({
            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "id", ignore = true),
            @org.mapstruct.Mapping(target = "openId", source = "userInfo.openId"),
            @org.mapstruct.Mapping(target = "phone", source = "phoneNoInfo.phoneNumber"),
            @org.mapstruct.Mapping(target = "unionId", source = "userInfo.unionId"),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true),
            @org.mapstruct.Mapping(target = "nickName", ignore = true),
            @org.mapstruct.Mapping(target = "gender", source = "userInfo.gender")
    })
    WxCustomer convertToWxCustomer(WxMaUserInfo userInfo, WxMaPhoneNumberInfo phoneNoInfo);
}
