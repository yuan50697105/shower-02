package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminRoute;
import com.idea.shower.db.mybaits.module.pojo.AdminRouteExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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