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
            @org.mapstruct.Mapping(target = "updateTime", source = "")
    })
    OrderInfo convert(OrderInfoVo orderInfoVo);
}
