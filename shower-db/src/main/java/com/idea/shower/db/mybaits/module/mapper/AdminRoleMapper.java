package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminRole;
import com.idea.shower.db.mybaits.module.pojo.AdminRoleExample;
import com.idea.shower.db.mybaits.module.pojo.query.AdminRoleQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface AdminRoleMapper extends BaseMapper {
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