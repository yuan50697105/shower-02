package org.yuan.boot.shower.wx.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.shower.db.pojo.CustomerInfo;
import org.yuan.boot.shower.wx.pojo.WxUserInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:55
 */
@Mapper(componentModel = "spring")
public interface WxUserInfoConverter {
    // TODO: 2020/1/23 微信用户添加模型处理
    CustomerInfo convertForAdd(WxUserInfo wxUserInfo);
}
