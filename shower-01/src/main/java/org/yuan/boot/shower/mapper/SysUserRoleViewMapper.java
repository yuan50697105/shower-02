package org.yuan.boot.shower.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.shower.pojo.SysUserRoleView;
import org.yuan.boot.shower.pojo.SysUserRoleViewExample;

import java.util.List;

@Mapper
public interface SysUserRoleViewMapper extends BaseMapper<SysUserRoleView> {
    long countByExample(SysUserRoleViewExample example);

    int deleteByExample(SysUserRoleViewExample example);

    int insert(SysUserRoleView record);

    int insertSelective(SysUserRoleView record);

    List<SysUserRoleView> selectByExample(SysUserRoleViewExample example);

    int updateByExampleSelective(@Param("record") SysUserRoleView record, @Param("example") SysUserRoleViewExample example);

    int updateByExample(@Param("record") SysUserRoleView record, @Param("example") SysUserRoleViewExample example);
}