package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminRole;
import com.idea.shower.db.mybaits.module.pojo.AdminRoleExample;
import com.idea.shower.db.mybaits.module.pojo.query.AdminRoleQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
<<<<<<< HEAD
public interface AdminRoleMapper extends BaseDaoMapper<AdminRole> {
=======
public interface AdminRoleMapper extends BaseDaoMapper<AdminRole>, BaseMapper<AdminRole> {
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
    long countByExample(AdminRoleExample example);

    int deleteByExample(AdminRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminRole record);

    int insertSelective(AdminRole record);

    List<AdminRole> selectByExample(AdminRoleExample example);

    AdminRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    int updateByExample(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    int updateByPrimaryKeySelective(AdminRole record);

    int updateByPrimaryKey(AdminRole record);

    List<Long> selectIdByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<AdminRole> selectByIdIn(@Param("idCollection") Collection<Long> idCollection);

    List<AdminRole> selectByCondition(@Param("condition") AdminRoleQuery condition);
}