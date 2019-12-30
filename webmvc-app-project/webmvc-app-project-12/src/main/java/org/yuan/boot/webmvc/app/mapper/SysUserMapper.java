package org.yuan.boot.webmvc.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.webmvc.app.pojo.SysUser;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:29
 */
@Repository
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
