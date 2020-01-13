package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.webmvc.app.pojo.SysRolePermission;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 22:09
 */
@Mapper(componentModel = "spring")
public interface SysRolePermissionConverter {
    @Mappings({

            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "id", ignore = true)
    })
    SysRolePermission convert(Long roleId, Long permissionId);

    default List<SysRolePermission> convert(Long roleId, List<Long> permissionIds) {
        ArrayList<SysRolePermission> sysRolePermissions = new ArrayList<>(permissionIds.size());
        for (Long permissionId : permissionIds) {
            sysRolePermissions.add(convert(roleId, permissionId));
        }
        return sysRolePermissions;
    }
}
