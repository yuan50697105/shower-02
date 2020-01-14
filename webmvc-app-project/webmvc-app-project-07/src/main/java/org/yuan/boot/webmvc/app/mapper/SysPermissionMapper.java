package org.yuan.boot.webmvc.app.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.db.mapper.BaseMapper;
import org.yuan.boot.webmvc.app.pojo.SysPermission;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 22:38
 */
@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
}
