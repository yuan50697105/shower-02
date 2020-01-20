package org.yuan.boot.shower.admin.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.shower.admin.pojo.AdminUserVO;
import org.yuan.boot.shower.db.pojo.AdminUserRole;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 01:01
 */
@Mapper(componentModel = "spring")
public interface AdminUserRoleConverter {

    @Mappings({
            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true),
            @org.mapstruct.Mapping(target = "id", ignore = true)
    })
    AdminUserRole convertToUserRole(Long userId, Long roleId);

    default List<AdminUserRole> convertToUserRole(Long userId, List<Long> roleIds) {
        ArrayList<AdminUserRole> adminUserRoles = new ArrayList<>();
        roleIds = new ArrayList<>(new HashSet<>(roleIds));
        for (Long roleId : roleIds) {
            adminUserRoles.add(convertToUserRole(userId, roleId));
        }
        return adminUserRoles;
    }

    default List<AdminUserRole> convertToUserRole(AdminUserVO adminUserVO) {
        return convertToUserRole(adminUserVO.getId(), adminUserVO.getRoleIds());
    }

}