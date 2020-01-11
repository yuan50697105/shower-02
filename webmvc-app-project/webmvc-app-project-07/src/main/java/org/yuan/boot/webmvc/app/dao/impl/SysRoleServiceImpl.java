package org.yuan.boot.webmvc.app.dao.impl;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.mapper.SysRoleMapper;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.dao.SysRoleService;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 22:28
 */
@EqualsAndHashCode(callSuper = true)
@Service
@Value
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole, SysRoleMapper> implements SysRoleService {
}