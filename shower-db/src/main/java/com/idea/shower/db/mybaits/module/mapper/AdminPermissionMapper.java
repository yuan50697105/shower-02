package com.idea.shower.db.mybaits.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminPermission;
import com.idea.shower.db.mybaits.module.pojo.AdminPermissionExample;
import com.idea.shower.db.mybaits.module.pojo.query.AdminPermissionQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface AdminPermissionMapper extends BaseDaoMapper, BaseMapper<AdminPermission> {
    long countByExample(AdminPermissionExample example);

    int deleteByExample(AdminPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminPermission record);

    int insertSelective(AdminPermission record);

    List<AdminPermission> selectByExample(AdminPermissionExample example);

    AdminPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminPermission record, @Param("example") AdminPermissionExample example);

    int updateByExample(@Param("record") AdminPermission record, @Param("example") AdminPermissionExample example);

    int updateByPrimaryKeySelective(AdminPermission record);

    int updateByPrimaryKey(AdminPermission record);

    Long selectIdById(@Param("id") Long id);

    List<AdminPermission> selectByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<Long> selectIdByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<AdminPermission> selectByCondition(@Param("condition") AdminPermissionQuery condition);

    List<AdminPermission> selectAllByRoleId(@Param("roleId") Long roleId);

    List<String> selectNameByRoleId(@Param("roleId") Long roleId);

    List<String> selectNameByRoleIdIn(@Param("roleIdCollection") Collection<Long> roleIdCollection);
}