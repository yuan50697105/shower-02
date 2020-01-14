package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 22:33
 */
@Mapper(componentModel = "spring")
public interface SysRoleConverter {
    @Mappings({

            @org.mapstruct.Mapping(target = "updateUser", ignore = true),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @org.mapstruct.Mapping(target = "enabled", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "createTime", ignore = true)
    })
    SysRole convert(SysRoleVo sysRoleVo);

    List<SysRole> convert(List<SysRoleVo> sysRoleVos);
}
