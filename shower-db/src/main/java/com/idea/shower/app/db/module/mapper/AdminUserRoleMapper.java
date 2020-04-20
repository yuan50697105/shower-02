package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.AdminUserRole;
import com.idea.shower.app.db.module.pojo.AdminUserRoleExample;
import java.util.Collection;import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AdminUserRoleMapper extends BaseMapper {
    long countByExample(AdminUserRoleExample example);

    int deleteByExample(AdminUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminUserRole record);

    int insertSelective(AdminUserRole record);

    List<AdminUserRole> selectByExample(AdminUserRoleExample example);

    AdminUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminUserRole record, @Param("example") AdminUserRoleExample example);

    int updateByExample(@Param("record") AdminUserRole record, @Param("example") AdminUserRoleExample example);

    int updateByPrimaryKeySelective(AdminUserRole record);

    int updateByPrimaryKey(AdminUserRole record);

    int deleteByRoleId(@Param("roleId") Long roleId);

    int deleteByRoleIdIn(@Param("roleIdCollection") Collection<Long> roleIdCollection);

    int deleteByUserId(@Param("userId") Long userId);

    int deleteByUserIdIn(@Param("userIdCollection") Collection<Long> userIdCollection);

    List<Long> selectRoleIdByUserId(@Param("userId") Long userId);

    List<Long> selectUserIdByRoleId(@Param("roleId") Long roleId);
}