package org.yuan.boot.shower.admin.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.yuan.boot.shower.admin.pojo.AdminRoleVo;
import org.yuan.boot.shower.db.pojo.AdminRole;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-22 08:48
 */
@Mapper(componentModel = "spring")
public interface AdminRoleConverter {
    @Mappings({

            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true),
            @org.mapstruct.Mapping(target = "id", ignore = true)
    })
    AdminRole convertForSave(AdminRoleVo adminRoleVo);

    @Mappings({

            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true),
            @org.mapstruct.Mapping(target = "id", ignore = true)
    })
    AdminRole convertForUpdate(AdminRoleVo adminRoleVo);
}
