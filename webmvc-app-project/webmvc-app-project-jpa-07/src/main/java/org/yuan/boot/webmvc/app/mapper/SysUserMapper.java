package org.yuan.boot.webmvc.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.db.jpa.mapper.BaseMapper;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.example.SysUserExample;

import java.util.List;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Long id);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    List<SysUser> selectByCondition(SysUserCondition condition);

}