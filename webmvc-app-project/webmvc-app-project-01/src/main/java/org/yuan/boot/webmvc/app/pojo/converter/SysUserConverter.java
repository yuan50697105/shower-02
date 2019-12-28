package org.yuan.boot.webmvc.app.pojo.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.dto.SysUserExcel;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SysUserConverter {
    @SuppressWarnings("UnmappedTargetProperties")
    SysUser convert(SysUserVo sysUserVo);

    List<SysUser> convert(List<SysUserVo> sysUserVos);

    SysUserExcel convertToExcel(SysUser sysUser);

    List<SysUserExcel> convertToExcel(List<SysUser> sysUsers);
}
