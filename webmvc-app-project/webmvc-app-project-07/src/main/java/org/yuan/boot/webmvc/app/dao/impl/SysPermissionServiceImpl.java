package org.yuan.boot.webmvc.app.dao.impl;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.dao.SysPermissionService;
import org.yuan.boot.webmvc.app.mapper.SysPermissionMapper;
import org.yuan.boot.webmvc.app.pojo.SysPermission;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 22:38
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Service
public class SysPermissionServiceImpl extends BaseServiceImpl<SysPermission, SysPermissionMapper> implements SysPermissionService {
}