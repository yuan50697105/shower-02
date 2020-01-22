package org.yuan.boot.shower.admin.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.yuan.boot.shower.admin.pojo.AdminUserQueryResult;
import org.yuan.boot.shower.admin.pojo.AdminUserVO;
import org.yuan.boot.shower.db.pojo.AdminRole;
import org.yuan.boot.shower.db.pojo.AdminUser;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:02
 */
@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdminUserConverter {
    @Mappings({

            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true),
            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "id", ignore = true),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true)
    })
    AdminUser convertForSave(AdminUserVO adminUserVO);

    @Mappings({

            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true),
            @org.mapstruct.Mapping(target = "createTime", ignore = true),
            @org.mapstruct.Mapping(target = "createUser", ignore = true),
            @org.mapstruct.Mapping(target = "updateTime", ignore = true),
            @Mapping(target = "password", ignore = true),
            @Mapping(target = "username", ignore = true)
    })
    AdminUser convertForChangeInfo(AdminUserVO adminUserVO);

    @Mappings({
            @org.mapstruct.Mapping(target = "copyFrom", ignore = true),
            @org.mapstruct.Mapping(target = "copyFromIgnoreNull", ignore = true),
            @org.mapstruct.Mapping(target = "createTime", source = "adminUser.createTime"),
            @org.mapstruct.Mapping(target = "createUser", source = "adminUser.createUser"),
            @org.mapstruct.Mapping(target = "id", source = "adminUser.id"),
            @org.mapstruct.Mapping(target = "realName", source = "adminUser.realName"),
            @org.mapstruct.Mapping(target = "updateTime", source = "adminUser.updateTime"),
            @org.mapstruct.Mapping(target = "username", source = "adminUser.username"),
            @org.mapstruct.Mapping(target = "password", ignore = true)
    })
    AdminUserQueryResult convert(AdminUser adminUser, List<AdminRole> roles);

}
