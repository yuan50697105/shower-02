package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-28 12:12
 */
@Mapper(componentModel = "spring")
public interface SysRoleConverter {
    //    @Mappings({
//
//            @org.mapstruct.Mapping(target = "updateUser", ignore = true),
//            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
//            @org.mapstruct.Mapping(target = "enabled", ignore = true),
//            @org.mapstruct.Mapping(target = "createUser", ignore = true),
//            @org.mapstruct.Mapping(target = "createUser", ignore = true),
//            @org.mapstruct.Mapping(target = "createTime", ignore = true)
//    })
    @SuppressWarnings("UnmappedTargetProperties")
    SysRole convert(SysRoleVo sysRoleVo);
}
