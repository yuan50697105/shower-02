package com.idea.shower.admin.admin.service.impl;

import ai.yue.library.base.exception.ResultException;
import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.MapUtil;
import com.idea.shower.admin.admin.converter.AdminEntityConverter;
import com.idea.shower.admin.admin.pojo.AdminRoleEditVo;
import com.idea.shower.admin.admin.pojo.AdminRoleVO;
import com.idea.shower.admin.admin.service.AdminRoleService;
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

import java.util.Collection;
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
public class AdminRoleServiceImpl implements AdminRoleService {
    private final AdminRoleDao adminRoleService;
    private final AdminUserRoleDao adminUserRoleDao;
    private final AdminPermissionDao adminPermissionDao;
    private final AdminRouteDao adminRouteDao;
    private final AdminEntityConverter adminEntityConverter;

    @Override
    @CachePut
    public Result<?> add(AdminRoleVO vo) {
        validateRole(vo);
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
        List<RouteBean> routes = RouteUtils.tree2list(vo.getRoutes());
        updateRolePermission(id, RouteUtils.tree2Permission(routes));
        updateRoleRoute(id, RouteUtils.tree2Route(routes));
        return ResultInfo.success();
    }

    @Override
    public Result<?> getForUpdate(Long id) {
        AdminRole adminRole = adminRoleService.getById(id);
        List<String> list = adminRouteDao.selectNameListByRoleId(id);
        Map<String, AdminRoleEditVo> role = MapUtil.builder("role", createRoleVo(adminRole, list)).build();
        return ResultInfo.success(role);
    }

    /**
     * 更新角色路由
     *
     * @param roleId 角色id
     * @param routes 路由列表
     */
    private void updateRoleRoute(Long roleId, List<String> routes) {
        List<AdminRoute> list = adminRouteDao.selectListByRoleId(roleId);
        List<String> routesDb = list.stream().map(AdminRoute::getName).distinct().collect(Collectors.toList());
        Collection<String> intersection = CollUtil.intersection(routesDb, routes);
        routes.removeAll(intersection);
        for (String route : routes) {
            AdminRoute adminRoute = AdminRoute.builder().name(route).roleId(roleId).build();
            adminRouteDao.insert(adminRoute);
        }
        routesDb.removeAll(intersection);
        List<Long> routeIds = list.stream().filter(adminRoute -> routesDb.contains(adminRoute.getName())).map(BaseDbEntity::getId).collect(Collectors.toList());
        routeIds.forEach(adminRouteDao::deleteById);
    }


    /**
     * 更新角色权限列表
     *
     * @param roleId      角色Id
     * @param permissions 权限列表
     */
    private void updateRolePermission(Long roleId, List<String> permissions) {
        List<AdminPermission> adminPermissions = adminPermissionDao.selectListByRoleId(roleId);
        List<String> rolePermissions = adminPermissions.stream().map(AdminPermission::getName).collect(Collectors.toList());
        Collection<String> intersectionRolePermission = CollUtil.intersection(rolePermissions, permissions);
        permissions.removeAll(intersectionRolePermission);
        for (String permission : permissions) {
            adminPermissionDao.insert(new AdminPermission(permission, roleId));
        }
        rolePermissions.removeAll(intersectionRolePermission);
        List<Long> ids = adminPermissions.stream().filter(adminPermission -> rolePermissions.contains(adminPermission.getName())).map(BaseDbEntity::getId).collect(Collectors.toList());
        ids.forEach(adminPermissionDao::deleteById);
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

    /**
     * 验证角色存在
     * <p>验证表单</p>
     *
     * @param vo 表单模型
     */
    private void validateRole(AdminRoleVO vo) {
        String name = vo.getName();
        boolean exist = adminRoleService.checkExistByName(name);
        if (exist) {
            throw new ResultException(ResultInfo.param_check_not_pass());
        }
    }

    /**
     * 创建角色路由
     * <p>用于创建角色路有关联</p>
     *
     * @param roleId    角色id
     * @param routeList
     */
    private void createRoleRoute(Long roleId, List<String> routeList) {
        for (String name : routeList) {
            adminRouteDao.insert(AdminRoute.builder().name(name).roleId(roleId).build());
        }
    }

    /**
     * 创建角色权限
     * <p>用于创建角色权限关联</p>
     *
     * @param roleId      角色ID
     * @param permissions 权限列表
     */
    private void createRolePermission(Long roleId, List<String> permissions) {
        for (String permission : permissions) {
            AdminPermission adminPermission = new AdminPermission(permission, roleId);
            adminPermissionDao.insert(adminPermission);
        }
    }

    /**
     * 创建角色表单模型
     *
     * @param role   角色信息
     * @param routes 路由信息
     * @return 角色标记表单实体
     */
    private AdminRoleEditVo createRoleVo(AdminRole role, List<String> routes) {
        AdminRoleEditVo adminRoleEditVo = new AdminRoleEditVo();
        adminRoleEditVo.setRoutes(routes);
        adminRoleEditVo.setName(role.getName());
        adminRoleEditVo.setDescription(role.getDescription());
        adminRoleEditVo.setEnabled(role.getEnabled());
        adminRoleEditVo.setDeleted(role.getDeleted());
        adminRoleEditVo.setId(role.getId());
        adminRoleEditVo.setCreateTime(role.getCreateTime());
        adminRoleEditVo.setUpdateTime(role.getUpdateTime());
        adminRoleEditVo.setCreateUser(role.getCreateUser());
        adminRoleEditVo.setUpdateUser(role.getUpdateUser());
        return adminRoleEditVo;

    }
}