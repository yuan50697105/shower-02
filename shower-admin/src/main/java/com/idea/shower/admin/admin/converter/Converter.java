package com.idea.shower.admin.admin.converter;

import com.idea.shower.admin.admin.pojo.AdminRoleVO;
import com.idea.shower.app.db.module.pojo.AdminRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-19 22:49
 */
@Mapper(componentModel = "spring")
public interface Converter {
    @Mapping(target = "updateUser", source = "adminRole.updateUser")
    @Mapping(target = "updateTime", source = "adminRole.updateTime")
    @Mapping(target = "routes", ignore = true)
    @Mapping(target = "resources", source = "list")
    @Mapping(target = "name", source = "adminRole.name")
    @Mapping(target = "id", source = "adminRole.id")
    @Mapping(target = "enabled", source = "adminRole.enabled")
    @Mapping(target = "description", source = "adminRole.description")
    @Mapping(target = "deleted", source = "adminRole.deleted")
    @Mapping(target = "createUser", source = "adminRole.createUser")
    @Mapping(target = "createTime", source = "adminRole.createTime")
    AdminRoleVO adminRoleWithRoute(AdminRole adminRole, List<String> list);
}