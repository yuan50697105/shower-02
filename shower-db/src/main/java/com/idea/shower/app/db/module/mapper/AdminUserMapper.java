package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.AdminUser;
import com.idea.shower.app.db.module.pojo.AdminUserExample;
import java.util.List;
import com.idea.shower.app.db.module.pojo.query.AdminUserQuery;import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper extends BaseMapper {
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
}