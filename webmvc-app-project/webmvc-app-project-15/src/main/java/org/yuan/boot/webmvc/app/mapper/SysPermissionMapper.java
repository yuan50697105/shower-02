package org.yuan.boot.webmvc.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.jpa.mapper.BaseMapper;
import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.app.pojo.example.SysPermissionExample;

import java.util.List;

@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    long countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Long id);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    List<SysPermission> selectByCondition(SysPermissionCondition condition);

}