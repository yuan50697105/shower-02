package org.yuan.boot.shower.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.shower.pojo.SysRole;
import org.yuan.boot.shower.pojo.SysRoleExample;import org.yuan.boot.shower.pojo.condition.SysRoleCondition;

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
    long countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    List<SysRole> selectByCondition(SysRoleCondition condition);

    SysRole selectOne(SysRole sysRole);

    SysRole selectOneByName(@Param("name") String name);
}