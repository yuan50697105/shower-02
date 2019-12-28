package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.dto.SysUserExcel;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SysUserConverter {
    @Mappings({

            @org.mapstruct.Mapping(target = "updateUser", ignore = true),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "enabled", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "createTime", ignore = true)
    })
    SysUser convert(SysUserVo sysUserVo);

    List<SysUser> convert(List<SysUserVo> sysUserVos);

    SysUserExcel convertToExcel(SysUser sysUser);

    List<SysUserExcel> convertToExcel(List<SysUser> sysUsers);
}
