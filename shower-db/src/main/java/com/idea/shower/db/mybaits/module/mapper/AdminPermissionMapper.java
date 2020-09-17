package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminPermission;
import com.idea.shower.db.mybaits.module.pojo.AdminPermissionExample;
import com.idea.shower.db.mybaits.module.pojo.query.AdminPermissionQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
<<<<<<< HEAD
public interface AdminPermissionMapper extends BaseDaoMapper<AdminPermission> {
=======
public interface AdminPermissionMapper extends BaseDaoMapper<AdminPermission>, BaseMapper<AdminPermission> {
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
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