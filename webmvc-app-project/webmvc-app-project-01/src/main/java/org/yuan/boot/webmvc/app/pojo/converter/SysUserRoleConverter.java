package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.yuan.boot.webmvc.app.pojo.SysUserRole;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 21:58
 */
@Mapper(componentModel = "spring")
public interface SysUserRoleConverter {

    @Mappings({

            @Mapping(target = "createTime", ignore = true),
            @Mapping(target = "createUser", ignore = true),
            @Mapping(target = "id", ignore = true)
    })
    SysUserRole convert(Long userId, Long roleId);

    default List<SysUserRole> convert(Long userId, List<Long> roleIds) {
        ArrayList<SysUserRole> sysUserRoles = new ArrayList<>(roleIds.size());
        for (Long roleId : roleIds) {
            sysUserRoles.add(convert(userId, roleId));
        }
        return sysUserRoles;
    }


}
