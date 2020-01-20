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

            @org.mapstruct.Mapping(target = "createTime", source = "", ignore = true),
            @org.mapstruct.Mapping(target = "id", source = "", ignore = true),
            @org.mapstruct.Mapping(target = "idNum", source = "", ignore = true),
            @org.mapstruct.Mapping(target = "openId", source = "userInfo.openId"),
            @org.mapstruct.Mapping(target = "phone", source = "phoneNoInfo.phoneNumber"),
            @org.mapstruct.Mapping(target = "unionId", source = "userInfo.unionId"),
            @org.mapstruct.Mapping(target = "updateTime", source = "", ignore = true),
            @org.mapstruct.Mapping(target = "username", source = "userInfo.nickName")
    })
    WxCustomer convertToWxCustomer(WxMaUserInfo userInfo, WxMaPhoneNumberInfo phoneNoInfo);
}
