package org.yuan.boot.webmvc.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.webmvc.app.pojo.SysUserRolePermissionView;
import org.yuan.boot.webmvc.app.pojo.SysUserRolePermissionViewExample;

import java.util.List;

@Mapper
public interface SysUserRolePermissionViewMapper extends BaseMapper<SysUserRolePermissionView> {
    long countByExample(SysUserRolePermissionViewExample example);

    int deleteByExample(SysUserRolePermissionViewExample example);

    int insert(SysUserRolePermissionView record);

    int insertSelective(SysUserRolePermissionView record);

    List<SysUserRolePermissionView> selectByExample(SysUserRolePermissionViewExample example);

    int updateByExampleSelective(@Param("record") SysUserRolePermissionView record, @Param("example") SysUserRolePermissionViewExample example);

    int updateByExample(@Param("record") SysUserRolePermissionView record, @Param("example") SysUserRolePermissionViewExample example);
}