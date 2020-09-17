package com.idea.shower.db.mybaits.module.mapper;

import com.idea.shower.db.mybaits.commons.mapper.BaseDaoMapper;
import com.idea.shower.db.mybaits.module.pojo.AdminRoute;
import com.idea.shower.db.mybaits.module.pojo.AdminRouteExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
<<<<<<< HEAD
public interface AdminRouteMapper extends BaseDaoMapper<AdminRoute> {
=======
public interface AdminRouteMapper extends BaseDaoMapper<AdminRoute>, BaseMapper<AdminRoute> {
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
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