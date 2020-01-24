package org.yuan.boot.shower.wx.converter;

import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.shower.db.pojo.CustomerInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:55
 */
@Mapper(componentModel = "spring")
public interface WxUserInfoConverter {
    // TODO: 2020/1/23 微信用户添加模型处理

    @Mappings({

            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true),
            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "gender", source = "userInfo.gender"),
            @org.mapstruct.Mapping(target = "id", ignore = true),
            @org.mapstruct.Mapping(target = "nickName", source = "userInfo.nickName"),
            @org.mapstruct.Mapping(target = "openId", source = "userInfo.openId"),
            @org.mapstruct.Mapping(target = "phone", source = "phoneNumberInfo.phoneNumber"),
            @org.mapstruct.Mapping(target = "unionId", source = "userInfo.unionId"),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "updateUser", ignore = true)
    })
    CustomerInfo convertForSave(WxMaUserInfo userInfo, WxMaPhoneNumberInfo phoneNumberInfo);


    @Mappings({

            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true),
            @org.mapstruct.Mapping(target = "createTime", source = "customerInfo.createTime"),
            @org.mapstruct.Mapping(target = "createUser", source = "customerInfo.createUser"),
            @org.mapstruct.Mapping(target = "gender", source = "userInfo.gender"),
            @org.mapstruct.Mapping(target = "nickName", source = "userInfo.nickName"),
            @org.mapstruct.Mapping(target = "openId", source = "userInfo.openId"),
            @org.mapstruct.Mapping(target = "phone", source = "phoneNoInfo.phoneNumber"),
            @org.mapstruct.Mapping(target = "unionId", source = "userInfo.unionId"),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "updateUser", ignore = true),
            @org.mapstruct.Mapping(target = "id", ignore = true)
    })
    CustomerInfo convertForUpdate(CustomerInfo customerInfo, WxMaUserInfo userInfo, WxMaPhoneNumberInfo phoneNoInfo);
}
