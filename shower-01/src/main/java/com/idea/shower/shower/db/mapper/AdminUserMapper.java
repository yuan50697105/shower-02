package com.idea.shower.shower.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.idea.shower.shower.commons.mapper.BaseMapper;
import com.idea.shower.shower.db.pojo.AdminUser;
import com.idea.shower.shower.db.pojo.AdminUserQueryBase;import com.idea.shower.shower.db.pojo.AdminUserExample;

@Mapper
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

    List<AdminUser> selectByCondition(AdminUserQueryBase condition);
}