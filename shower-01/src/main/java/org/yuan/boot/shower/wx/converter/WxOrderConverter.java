package org.yuan.boot.shower.wx.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
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
    @Mappings({
            @Mapping(target = "customerOpenId", source = "openId"),
            @Mapping(target = "customerUnionId", source = "unionId"),
            @Mapping(target = "deviceCode", source = "deviceCode"),
            @Mapping(target = "predicateDecimal", source = "decimal", defaultValue = "0"),
            @Mapping(target = "orderType", source = "type"),
            @Mapping(target = "copyFrom", ignore = true),
            @Mapping(target = "copyFromIgnoreNull", ignore = true),
            @Mapping(target = "crateTime", ignore = true),
            @Mapping(target = "customerId", ignore = true),
            @Mapping(target = "customerName", ignore = true),
            @Mapping(target = "deviceId", ignore = true),
            @Mapping(target = "endTime", ignore = true),
            @Mapping(target = "extDecimal", ignore = true),
            @Mapping(target = "finalPayTime", ignore = true),
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "leaveTime", ignore = true),
            @Mapping(target = "minDecimal", ignore = true),
            @Mapping(target = "orderNo", ignore = true),
            @Mapping(target = "payStatus", ignore = true),
            @Mapping(target = "perDecimal", ignore = true),
            @Mapping(target = "predicatePayTime", ignore = true),
            @Mapping(target = "createTime", ignore = true),
            @Mapping(target = "remainDecimal", ignore = true),
            @Mapping(target = "spendTime", ignore = true),
            @Mapping(target = "startTime", ignore = true),
            @Mapping(target = "totalDecimal", ignore = true),
            @Mapping(target = "updateTime", ignore = true)
    })
    WxOrderInfo convertToWxOrderInfo(WxOrderVO wxOrderVO);
}
