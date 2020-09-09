package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminRoute;
import com.idea.shower.db.mybaits.module.pojo.AdminRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminRouteMapper extends BaseDaoMapper {
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