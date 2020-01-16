package org.yuan.boot.webmvc.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.webmvc.app.pojo.SysUserRoleView;
import org.yuan.boot.webmvc.app.pojo.SysUserRoleViewExample;

import java.util.List;

@Mapper
public interface SysUserRoleViewMapper {
    long countByExample(SysUserRoleViewExample example);

    int deleteByExample(SysUserRoleViewExample example);

    int insert(SysUserRoleView record);

    int insertSelective(SysUserRoleView record);

    List<SysUserRoleView> selectByExample(SysUserRoleViewExample example);

    int updateByExampleSelective(@Param("record") SysUserRoleView record, @Param("example") SysUserRoleViewExample example);

    int updateByExample(@Param("record") SysUserRoleView record, @Param("example") SysUserRoleViewExample example);
}