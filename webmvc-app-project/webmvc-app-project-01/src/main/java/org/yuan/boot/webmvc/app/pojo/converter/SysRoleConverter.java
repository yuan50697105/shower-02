package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:17
 */
@Mapper(componentModel = "spring")
public interface SysRoleConverter {
    @Mappings({

            @org.mapstruct.Mapping(target = "updateUser", ignore = true),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "enabled", ignore = true)
    })
    SysRole convert(SysRoleVo sysRoleVo);
}
