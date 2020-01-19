package org.yuan.boot.shower.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.shower.dao.SysUserRolePermissionViewDao;
import org.yuan.boot.shower.pojo.SysUserRolePermissionView;
import org.yuan.boot.shower.pojo.converter.SysUserRolePermissionViewConverter;
import org.yuan.boot.shower.pojo.result.SysUserRolePermissionViewResult;
import org.yuan.boot.shower.service.SysUserRolePermissionViewService;
import org.yuan.boot.shower.utils.Results;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 23:38
 */
@Service
@AllArgsConstructor
public class SysUserRolePermissionViewServiceImpl implements SysUserRolePermissionViewService {
    private SysUserRolePermissionViewDao sysUserRolePermissionViewDao;
    private SysUserRolePermissionViewConverter sysUserRolePermissionViewConverter;

    @Override
    public Result list() {
        List<SysUserRolePermissionView> sysUserRolePermissionViews = sysUserRolePermissionViewDao.list();
        SysUserRolePermissionViewResult sysUserRolePermissionViewResult = sysUserRolePermissionViewConverter.convertOne(sysUserRolePermissionViews);
        return Results.data(sysUserRolePermissionViewResult);
    }

}