package org.yuan.boot.shower.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.shower.pojo.SysPermission;
import org.yuan.boot.shower.pojo.vo.SysPermissionVo;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-02 22:15
 */
@Mapper(componentModel = "spring")
public interface SysPermissionConverter {

    @Mappings({

            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "updateUser", ignore = true),
            @org.mapstruct.Mapping(target = "enabled", ignore = true)
    })
    SysPermission convert(SysPermissionVo sysPermissionVo);
}
