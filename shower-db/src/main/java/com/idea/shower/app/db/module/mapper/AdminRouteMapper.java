package com.idea.shower.app.db.module.mapper;

import com.idea.shower.app.db.commons.mapper.BaseMapper;
import com.idea.shower.app.db.module.pojo.AdminRoute;
import com.idea.shower.app.db.module.pojo.AdminRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminRouteMapper extends BaseMapper {
    long countByExample(AdminRouteExample example);

    int deleteByExample(AdminRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminRoute record);

    int insertSelective(AdminRoute record);

    List<AdminRoute> selectByExample(AdminRouteExample example);

    AdminRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdminRoute record, @Param("example") AdminRouteExample example);

    int updateByExample(@Param("record") AdminRoute record, @Param("example") AdminRouteExample example);

    int updateByPrimaryKeySelective(AdminRoute record);

    int updateByPrimaryKey(AdminRoute record);
}