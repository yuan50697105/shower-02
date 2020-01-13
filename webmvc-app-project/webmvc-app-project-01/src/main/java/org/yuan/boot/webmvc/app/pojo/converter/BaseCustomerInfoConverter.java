package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.pojo.vo.BaseCustomerInfoVo;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 19:32
 */
@Mapper(componentModel = "spring")
public interface BaseCustomerInfoConverter {
    @Mappings({

            @Mapping(target = "createTime", ignore = true),
            @Mapping(target = "createUser", ignore = true),
            @Mapping(target = "enabled", ignore = true),
            @Mapping(target = "updateTime", ignore = true),
            @Mapping(target = "updateUser", ignore = true)
    })
    BaseCustomerInfo convert(BaseCustomerInfoVo baseCustomerInfoVo);
}
