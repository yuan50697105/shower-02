package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.vo.SysPermissionVo;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-28 13:12
 */
@Mapper(componentModel = "spring")
public interface SysPermissionConverter {
    @SuppressWarnings("UnmappedTargetProperties")
    SysPermission convert(SysPermissionVo sysPermissionVo);

    List<SysPermission> convert(List<SysPermissionVo> sysPermissionVos);

}