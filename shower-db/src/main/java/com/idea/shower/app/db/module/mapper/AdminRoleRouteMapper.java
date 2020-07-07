package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.module.pojo.AdminRoleRoute;
import com.idea.shower.app.db.module.pojo.AdminRoleRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminRoleRouteMapper {
    long countByExample(AdminRoleRouteExample example);

    int deleteByExample(AdminRoleRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminRoleRoute record);

    int insertSelective(AdminRoleRoute record);

    List<AdminRoleRoute> selectByExample(AdminRoleRouteExample example);

    AdminRoleRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminRoleRoute record, @Param("example") AdminRoleRouteExample example);

    int updateByExample(@Param("record") AdminRoleRoute record, @Param("example") AdminRoleRouteExample example);

    int updateByPrimaryKeySelective(AdminRoleRoute record);

    int updateByPrimaryKey(AdminRoleRoute record);
}