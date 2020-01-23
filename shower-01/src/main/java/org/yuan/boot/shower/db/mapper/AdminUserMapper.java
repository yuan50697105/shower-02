package org.yuan.boot.shower.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.shower.commons.mapper.BaseMapper;
import org.yuan.boot.shower.db.pojo.AdminUser;
import org.yuan.boot.shower.db.pojo.AdminUserCondition;import org.yuan.boot.shower.db.pojo.AdminUserExample;

@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser> {
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

    List<AdminUser> selectByCondtion(AdminUserCondition condition);
}