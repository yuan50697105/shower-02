package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.webmvc.app.pojo.SysUserRolePermissionView;
import org.yuan.boot.webmvc.app.pojo.result.SysUserRolePermissionViewResult;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 23:10
 */
@Mapper(componentModel = "spring")
public interface SysUserRolePermissionViewConverter {

    @Mappings({
            @org.mapstruct.Mapping(target = "roles", ignore = true),
            @org.mapstruct.Mapping(target = "permissions", ignore = true)
    })
    SysUserRolePermissionViewResult convert(SysUserRolePermissionView sysUserRolePermissionView);

    default SysUserRolePermissionViewResult convertOne(List<SysUserRolePermissionView> sysUserRolePermissionViews) {
        return Optional.ofNullable(convertList(sysUserRolePermissionViews).get(0)).orElse(null);
    }

    default List<SysUserRolePermissionViewResult> convertList(List<SysUserRolePermissionView> sysUserRolePermissionViews) {
        ArrayList<SysUserRolePermissionViewResult> sysUserRolePermissions = new ArrayList<>();
        for (SysUserRolePermissionView sysUserRolePermissionView : sysUserRolePermissionViews) {
            SysUserRolePermissionViewResult sysUserRolePermission = convert(sysUserRolePermissionView);
            Set<String> roleNames = sysUserRolePermissionViews.stream().filter(view -> view.getId().equals(sysUserRolePermission.getId())).map(SysUserRolePermissionView::getRoleName).collect(Collectors.toSet());
            Set<String> permissionNames = sysUserRolePermissionViews.stream().filter(view -> view.getId().equals(sysUserRolePermission.getId())).map(SysUserRolePermissionView::getPermissionName).collect(Collectors.toSet());
            HashSet<SysUserRolePermissionViewResult.SysRoleResult> sysRoles = new HashSet<>(roleNames.size());
            for (String roleName : roleNames) {
                SysUserRolePermissionViewResult.SysRoleResult sysRole = new SysUserRolePermissionViewResult.SysRoleResult();
                sysRole.setName(roleName);
                sysRoles.add(sysRole);
            }
            HashSet<SysUserRolePermissionViewResult.SysPermissionResult> sysPermissions = new HashSet<>(permissionNames.size());
            for (String permissionName : permissionNames) {
                SysUserRolePermissionViewResult.SysPermissionResult sysPermission = new SysUserRolePermissionViewResult.SysPermissionResult();
                sysPermission.setName(permissionName);
                sysPermissions.add(sysPermission);
            }
            sysUserRolePermission.setRoles(sysRoles);
            sysUserRolePermission.setPermissions(sysPermissions);
            sysUserRolePermissions.add(sysUserRolePermission);
        }
        return sysUserRolePermissions;
    }

}
