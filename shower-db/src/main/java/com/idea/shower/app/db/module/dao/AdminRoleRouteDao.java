package com.idea.shower.app.db.module.dao;

import com.idea.shower.app.db.module.pojo.AdminRoleRouteExample;
import java.util.List;
import com.idea.shower.app.db.module.pojo.AdminRoleRoute;
public interface AdminRoleRouteDao {


    long countByExample(AdminRoleRouteExample example);

    int deleteByExample(AdminRoleRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdminRoleRoute record);

    int insertSelective(AdminRoleRoute record);

    List<AdminRoleRoute> selectByExample(AdminRoleRouteExample example);

    AdminRoleRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(AdminRoleRoute record,AdminRoleRouteExample example);

    int updateByExample(AdminRoleRoute record,AdminRoleRouteExample example);

    int updateByPrimaryKeySelective(AdminRoleRoute record);

    int updateByPrimaryKey(AdminRoleRoute record);

    int deleteByRoleIds(List<Long> ids);

    int deleteByRoleId(Long id);
}
