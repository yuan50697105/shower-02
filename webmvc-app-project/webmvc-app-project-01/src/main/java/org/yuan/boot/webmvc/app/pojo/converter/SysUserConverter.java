package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:26
 */
@Mapper(componentModel = "spring")
public interface SysUserConverter {

    @Mappings({
            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "enabled", ignore = true),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "updateUser", ignore = true)
    })
    SysUser convertForSave(SysUserVo sysUserVo);

    default List<SysUser> convertForSave(List<SysUserVo> sysUserVo) {
        return sysUserVo.stream().map(this::convertForSave).collect(Collectors.toList());
    }

    @Mappings({
            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "enabled", ignore = true),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "updateUser", ignore = true),
            @org.mapstruct.Mapping(target = "password", ignore = true)
    })
    SysUser convertForUpdate(SysUserVo sysUserVo);

    default List<SysUser> convertForUpdate(List<SysUserVo> sysUserVo) {
        return sysUserVo.stream().map(this::convertForUpdate).collect(Collectors.toList());
    }
}
