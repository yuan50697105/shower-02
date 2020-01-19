package org.yuan.boot.shower.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.shower.pojo.SysUserRolePermissionView;
import org.yuan.boot.shower.pojo.SysUserRolePermissionViewExample;

@Mapper
public interface SysUserRolePermissionViewMapper  extends BaseMapper<SysUserRolePermissionView> {
    long countByExample(SysUserRolePermissionViewExample example);

    int deleteByExample(SysUserRolePermissionViewExample example);

    int insert(SysUserRolePermissionView record);

    int insertSelective(SysUserRolePermissionView record);

    List<SysUserRolePermissionView> selectByExample(SysUserRolePermissionViewExample example);

    int updateByExampleSelective(@Param("record") SysUserRolePermissionView record, @Param("example") SysUserRolePermissionViewExample example);

    int updateByExample(@Param("record") SysUserRolePermissionView record, @Param("example") SysUserRolePermissionViewExample example);
}