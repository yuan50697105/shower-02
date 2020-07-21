package com.idea.shower.admin.admin.service.impl;

import ai.yue.library.base.exception.ResultException;
import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import cn.hutool.core.map.MapUtil;
import com.idea.shower.admin.admin.converter.Converter;
import com.idea.shower.admin.admin.pojo.AdminRoleEditVo;
import com.idea.shower.admin.admin.pojo.AdminRoleVO;
import com.idea.shower.admin.admin.service.AdminRoleBackService;
import com.idea.shower.admin.route.pojo.RouteBean;
import com.idea.shower.admin.route.utils.RouteUtils;
import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import com.idea.shower.app.db.module.dao.AdminPermissionDao;
import com.idea.shower.app.db.module.dao.AdminRoleDao;
import com.idea.shower.app.db.module.dao.AdminRouteDao;
import com.idea.shower.app.db.module.dao.AdminUserRoleDao;
import com.idea.shower.app.db.module.pojo.AdminPermission;
import com.idea.shower.app.db.module.pojo.AdminRole;
import com.idea.shower.app.db.module.pojo.AdminRoute;
import com.idea.shower.app.db.module.pojo.query.AdminRoleQuery;
import com.idea.shower.db.mybaits.pojo.PageResult;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-25 17:15
 */
@Service
@AllArgsConstructor
@Transactional
@CacheConfig(cacheNames = "roles")
@Slf4j
public class AdminRoleBackServiceImpl implements AdminRoleBackService {
    private final AdminRoleDao adminRoleService;
    private final AdminUserRoleDao adminUserRoleDao;
    private final AdminPermissionDao adminPermissionDao;
    private final AdminRouteDao adminRouteDao;
    private final Converter converter;

    @Override
    @CachePut
    public Result<?> add(AdminRoleVO vo) {
        checkRoleExist(vo);
        AdminRole adminRole = createRole(vo);
        List<RouteBean> routes = vo.getRoutes();
        routes = RouteUtils.tree2listWithParent(routes);
        List<String> permissions = RouteUtils.tree2Permission(routes);
        List<String> tree2Name = RouteUtils.tree2Route(routes);
        createRolePermission(adminRole.getId(), permissions);
        createRoleRoute(adminRole.getId(), tree2Name);
        return ResultInfo.success(adminRole);
    }

    @Override
    @CachePut
    public Result<?> update(AdminRoleVO vo) {
        Long id = vo.getId();
        AdminRole adminRole = adminRoleService.getById(vo.getId());
        adminRole.copyFrom(vo);
        adminRoleService.updateSelective(adminRole);
        List<RouteBean> routes = RouteUtils.tree2listWithParent(vo.getRoutes());
        updateRolePermission(id, RouteUtils.tree2Permission(routes));
        updateRoleRoute(id, RouteUtils.tree2Route(routes));
        return ResultInfo.success();
    }

    @Override
    public Result<?> updateGet(Long id) {
        AdminRole adminRole = adminRoleService.getById(id);
        List<String> list = adminRouteDao.selectNameListByRoleId(id);
        Map<String, AdminRoleEditVo> role = MapUtil.builder("role", createRoleVo(adminRole, list)).build();
        return ResultInfo.success(role);
    }

    private void updateRoleRoute(Long id, List<String> routes) {
        List<AdminRoute> list = adminRouteDao.selectListByRoleId(id);
        List<String> urls = list.stream().map(AdminRoute::getUrl).collect(Collectors.toList());

        ArrayList<AdminRoute> adminRoutes = new ArrayList<>();
        for (String route : routes) {
            if (!urls.contains(route)) {
                adminRoutes.add(AdminRoute.builder().roleId(id).name(route).build());
            }
        }
        urls.removeAll(routes);
        List<Long> ids = list.stream().filter(adminRoute -> urls.contains(adminRoute.getUrl())).map(BaseDbEntity::getId).collect(Collectors.toList());
        ids.forEach(adminRouteDao::deleteById);
        for (AdminRoute adminRoute : adminRoutes) {
            adminRouteDao.insert(adminRoute);
        }
    }

    private void updateRolePermission(Long id, List<String> permissions) {
        List<AdminPermission> adminPermissionList = adminPermissionDao.selectListByRoleId(id);
        List<String> strings = adminPermissionList.stream().map(AdminPermission::getName).collect(Collectors.toList());
        ArrayList<AdminPermission> adminPermissions = new ArrayList<>();
        for (String permission : permissions) {
            if (!strings.contains(permission)) {
                adminPermissions.add(new AdminPermission(permission, id));
            }
        }
        strings.removeAll(permissions);
        List<Long> ids = adminPermissionList.stream().filter(adminPermission -> strings.contains(adminPermission.getName())).map(BaseDbEntity::getId).collect(Collectors.toList());
        ids.forEach(adminPermissionDao::deleteById);
        for (AdminPermission adminPermission : adminPermissions) {
            adminPermissionDao.insert(adminPermission);
        }

    }

    @Override
    @CacheEvict
    public Result<?> delete(List<Long> id) {
        adminRoleService.deleteByIds(id);
        adminUserRoleDao.deleteByRoleIds(id);
        adminPermissionDao.deleteByRoleIds(id);
        adminRouteDao.deleteByRoleIds(id);
        return ResultInfo.success();
    }

    @Override
    public Result<?> get(Long id) {
        AdminRole adminRole = adminRoleService.getById(id);
        Map<String, AdminRole> role = MapUtil.builder("role", adminRole).build();
        return ResultInfo.success(role);
    }

    private AdminRoleEditVo createRoleVo(AdminRole adminRole, List<String> list) {
        AdminRoleEditVo adminRoleEditVo = new AdminRoleEditVo();
        adminRoleEditVo.setRoutes(list);
        adminRoleEditVo.setName(adminRole.getName());
        adminRoleEditVo.setDescription(adminRole.getDescription());
        adminRoleEditVo.setEnabled(adminRole.getEnabled());
        adminRoleEditVo.setDeleted(adminRole.getDeleted());
        adminRoleEditVo.setId(adminRole.getId());
        adminRoleEditVo.setCreateTime(adminRole.getCreateTime());
        adminRoleEditVo.setUpdateTime(adminRole.getUpdateTime());
        adminRoleEditVo.setCreateUser(adminRole.getCreateUser());
        adminRoleEditVo.setUpdateUser(adminRole.getUpdateUser());
        return adminRoleEditVo;

    }

    @Override
    @Cacheable
    public Result<?> data(AdminRoleQuery query, int page, int size) {
        PageResult<AdminRole> pageResult = adminRoleService.selectPageByQuery(query, page, size);
        return ResultInfo.success(pageResult);
    }

    @Override
    @Cacheable
    public Result<?> list(AdminRoleQuery query) {
        List<AdminRole> list = adminRoleService.selectListByQuery(query);
        return ResultInfo.success(Collections.singletonMap("list", list));
    }


    private AdminRole createRole(AdminRoleVO vo) {
        AdminRole adminRole = new AdminRole();
        adminRole.copyFrom(vo);
        adminRoleService.insertSelective(adminRole);
        return adminRole;
    }

    private void checkRoleExist(AdminRoleVO vo) {
        String name = vo.getName();
        boolean exist = adminRoleService.checkExistByName(name);
        if (exist) {
            throw new ResultException(ResultInfo.param_check_not_pass());
        }
    }

    private void createRoleRoute(Long id, List<String> tree2Name) {
        for (String name : tree2Name) {
            adminRouteDao.insert(AdminRoute.builder().url(name).roleId(id).build());
        }
    }

    private void createRolePermission(Long roleId, List<String> permissions) {
        for (String permission : permissions) {
            AdminPermission adminPermission = new AdminPermission(permission, roleId);
            adminPermissionDao.insert(adminPermission);
        }
    }
}