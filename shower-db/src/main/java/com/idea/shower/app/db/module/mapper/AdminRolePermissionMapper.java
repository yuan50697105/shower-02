package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.AdminRolePermission;
import com.idea.shower.app.db.module.pojo.AdminRolePermissionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminRolePermissionMapper extends BaseMapper {
    long countByExample(AdminRolePermissionExample example);

    int deleteByExample(AdminRolePermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminRolePermission record);

    int insertSelective(AdminRolePermission record);

    List<AdminRolePermission> selectByExample(AdminRolePermissionExample example);

    AdminRolePermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminRolePermission record, @Param("example") AdminRolePermissionExample example);

    int updateByExample(@Param("record") AdminRolePermission record, @Param("example") AdminRolePermissionExample example);

    int updateByPrimaryKeySelective(AdminRolePermission record);

    int updateByPrimaryKey(AdminRolePermission record);

    List<Long> selectPermissionIdByRoleId(@Param("roleId") Long roleId);

    int deleteByRoleId(@Param("roleId") Long roleId);

    int deleteByPermissionId(@Param("permissionId") Long permissionId);


}