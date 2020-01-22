package org.yuan.boot.shower.admin.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.shower.admin.pojo.DeviceInfoVO;
import org.yuan.boot.shower.db.pojo.DeviceInfo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-22 16:01
 */
@Mapper(componentModel = "spring")
public interface DeviceInfoConverter {
    @Mappings({
            @org.mapstruct.Mapping(target = "point", source = "point"),
            @org.mapstruct.Mapping(target = "code", source = "deviceCode"),
            @org.mapstruct.Mapping(target = "address", ignore = true),
            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true)
    })
    DeviceInfo convertForSave(DeviceInfoVO deviceInfoVO);

    @Mappings({
            @org.mapstruct.Mapping(target = "point", source = "point"),
            @org.mapstruct.Mapping(target = "code", source = "deviceCode"),
            @org.mapstruct.Mapping(target = "address", ignore = true),
            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true)
    })
    DeviceInfo convertForUpdate(DeviceInfoVO deviceInfoVO);
}