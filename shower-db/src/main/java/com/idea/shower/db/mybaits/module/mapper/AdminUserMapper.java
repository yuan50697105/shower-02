package com.idea.shower.db.mybaits.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminUser;
import com.idea.shower.db.mybaits.module.pojo.AdminUserExample;
import com.idea.shower.db.mybaits.module.pojo.query.AdminUserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminUserMapper extends BaseDaoMapper<AdminUser>, BaseMapper<AdminUser> {
    long countByExample(AdminUserExample example);

    int deleteByExample(AdminUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    List<AdminUser> selectByExample(AdminUserExample example);

    AdminUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    int updateByExample(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);

    List<AdminUser> selectByCondition(@Param("condition") AdminUserQuery condition);

    AdminUser selectOneByUsername(@Param("username") String username);

    Long selectOneIdByUsername(@Param("username") String username);
}