package org.yuan.boot.shower.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.shower.pojo.BaseCustomerConsumeRecord;
import org.yuan.boot.shower.pojo.BaseCustomerInfo;
import org.yuan.boot.shower.pojo.BaseDeviceInfo;

import java.math.BigDecimal;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-19 20:57
 */
@Mapper(componentModel = "spring")
public interface BaseCustomerConsumeRecordConverter {
    @Mappings({

            @org.mapstruct.Mapping(target = "customerId", source = "customerInfo.id"),
            @org.mapstruct.Mapping(target = "customerName", source = "customerInfo.actualName"),
            @org.mapstruct.Mapping(target = "customerOpenId", ignore = true),
            @org.mapstruct.Mapping(target = "deviceCode", source = "deviceInfo.code"),
            @org.mapstruct.Mapping(target = "deviceId", source = "deviceInfo.id"),
            @org.mapstruct.Mapping(target = "id", ignore = true)
    })
    BaseCustomerConsumeRecord convertForSave(BaseCustomerInfo customerInfo, BaseDeviceInfo deviceInfo, BigDecimal price, BigDecimal time, BigDecimal totalPrice, String operation);
}
