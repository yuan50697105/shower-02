package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminUserRole;
import com.idea.shower.db.mybaits.module.pojo.AdminUserRoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

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

    List<String> selectRoleNameByUsername(@Param("username") String username);



}