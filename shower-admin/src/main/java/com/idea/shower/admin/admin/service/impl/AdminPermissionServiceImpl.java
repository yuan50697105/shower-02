package com.idea.shower.admin.admin.service.impl;

import ai.yue.library.base.exception.ResultException;
import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import cn.hutool.core.util.ObjectUtil;
import com.idea.shower.admin.admin.pojo.AdminPermissionVO;
import com.idea.shower.admin.admin.service.AdminPermissionService;
import com.idea.shower.db.mybaits.base.pojo.PageResult;
import com.idea.shower.db.mybaits.module.dao.AdminPermissionDao;
import com.idea.shower.db.mybaits.module.pojo.AdminPermission;
import com.idea.shower.db.mybaits.module.pojo.query.AdminPermissionQuery;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-25 18:40
 */
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
@CacheConfig(cacheNames = "permissions")
public class AdminPermissionServiceImpl implements AdminPermissionService {
    private final AdminPermissionDao adminPermissionDao;

    @Override
    @CachePut
    public Result<?> add(AdminPermissionVO vo) {
        createPermission(vo);
        return ResultInfo.success();

    }

    @Override
    @CachePut
    public Result<?> modify(AdminPermissionVO vo) {
        AdminPermission adminPermission = adminPermissionDao.getById(vo.getId());
        checkPermissionNull(adminPermission);
        adminPermission.copyFrom(vo);
        adminPermissionDao.updateSelective(adminPermission);
        return ResultInfo.success();
    }

    @Override
    @CacheEvict
    public Result<?> delete(List<Long> ids) {
        adminPermissionDao.deleteByIds(ids);
        return ResultInfo.success();
    }

    @Override
    public Result<?> get(Long id) {
        AdminPermission adminPermission = adminPermissionDao.getById(id);
        return ResultInfo.success(Collections.singletonMap("perission", adminPermission));
    }

    @Override
    @Cacheable
    public Result<?> data(AdminPermissionQuery query, int page, int size) {
        PageResult<AdminPermission> pageResult = adminPermissionDao.selectPageByQuery(query, page, size);
        return ResultInfo.success(pageResult);
    }

    @Override
    @Cacheable
    public Result<?> list(AdminPermissionQuery query) {
        List<AdminPermission> list = adminPermissionDao.selectListByQuery(query);
        return ResultInfo.success(Collections.singletonMap("list", list));
    }

    private void checkPermissionNull(AdminPermission adminPermission) {
        if (ObjectUtil.isNull(adminPermission)) {
            throw new ResultException(ResultInfo.param_check_not_pass());
        }
    }

    private void createPermission(AdminPermissionVO vo) {
        AdminPermission adminPermission = new AdminPermission();
        adminPermission.copyFrom(vo);
        adminPermissionDao.insertSelective(adminPermission);
    }

}