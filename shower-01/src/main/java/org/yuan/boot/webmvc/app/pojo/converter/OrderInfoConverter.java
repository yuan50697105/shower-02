package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.webmvc.app.pojo.OrderInfo;
import org.yuan.boot.webmvc.app.pojo.vo.OrderInfoVo;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 21:49
 */
@Mapper(componentModel = "spring")
public interface OrderInfoConverter {
    @Mappings({
            @org.mapstruct.Mapping(target = "id", ignore = true),
            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "deviceAddress", ignore = true),
            @org.mapstruct.Mapping(target = "devicePoint", ignore = true),
            @org.mapstruct.Mapping(target = "orderNo", ignore = true),
            @org.mapstruct.Mapping(target = "orderPrice", ignore = true),
            @org.mapstruct.Mapping(target = "payStatus", ignore = true),
            @org.mapstruct.Mapping(target = "payTime", ignore = true),
            @org.mapstruct.Mapping(target = "startTime", ignore = true),
            @org.mapstruct.Mapping(target = "useEndTime", ignore = true),
            @org.mapstruct.Mapping(target = "useStartTime", ignore = true),
            @org.mapstruct.Mapping(target = "useStatus", ignore = true),
            @org.mapstruct.Mapping(target = "userName", ignore = true)
    })
    OrderInfo convert(OrderInfoVo orderInfoVo);
}
