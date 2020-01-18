package org.yuan.boot.shower.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.shower.dao.SysPermissionDao;
import org.yuan.boot.shower.mapper.SysPermissionMapper;
import org.yuan.boot.shower.pojo.SysPermission;
import org.yuan.boot.shower.pojo.SysPermissionExample;
import org.yuan.boot.shower.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 13:15
 */
@AllArgsConstructor
@Component
public class SysPermissionDaoImpl extends BaseDaoImpl<SysPermission, SysPermissionMapper> implements SysPermissionDao {

    @Override
    public Result page(SysPermissionCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return new Result(new PageResult<>(new PageInfo<>(baseMapper().selectByCondition(condition))));
    }

    @Override
    public Result list(SysPermissionCondition condition) {
        return Result.data(baseMapper().selectByCondition(condition));
    }

    @Override
    public Result get(SysPermission sysPermission) {
        return Result.data(baseMapper().selectOne(sysPermission));
    }

    @Override
    public Result get(Long id) {
        return Result.data(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(SysPermission sysPermission) {
        sysPermission.setId(snowflake().nextId());
        sysPermission.setCreateTime(new Date());
        baseMapper().insertSelective(sysPermission);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result update(SysPermission sysPermission) {
        sysPermission.setUpdateTime(new Date());
        baseMapper().updateByPrimaryKeySelective(sysPermission);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(Long id) {
        baseMapper().deleteByPrimaryKey(id);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(List<Long> ids) {
        SysPermissionExample example = new SysPermissionExample();
        example.or().andIdIn(ids);
        baseMapper().deleteByExample(example);
        return Result.ok();
    }

    @Override
    public List<Long> selectByIds(List<Long> permissionIds) {
        SysPermissionExample example = new SysPermissionExample();
        example.or().andIdIn(permissionIds);
        List<SysPermission> sysPermissions = baseMapper().selectByExample(example);
        if (null != sysPermissions) {
            return sysPermissions.stream().map(SysPermission::getId).collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }
}