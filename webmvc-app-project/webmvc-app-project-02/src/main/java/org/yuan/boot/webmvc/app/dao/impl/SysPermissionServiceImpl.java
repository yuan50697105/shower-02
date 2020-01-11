package org.yuan.boot.webmvc.app.dao.impl;

import cn.hutool.core.lang.Snowflake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.db.dao.impl.BaseDaoImpl;
import org.yuan.boot.webmvc.app.mapper.SysPermissionMapper;
import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysPermissionConverter;
import org.yuan.boot.webmvc.app.pojo.example.SysPermissionExample;
import org.yuan.boot.webmvc.app.pojo.vo.SysPermissionVo;
import org.yuan.boot.webmvc.app.dao.SysPermissionService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.Arrays;
import java.util.Date;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 13:15
 */
@Service
public class SysPermissionServiceImpl extends BaseDaoImpl<SysPermission, Long, SysPermissionMapper> implements SysPermissionService {
    @Autowired
    private SysPermissionConverter sysPermissionConverter;
    @Autowired
    private Snowflake snowflake;

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
    public Result save(SysPermissionVo sysPermissionVo) {
        SysPermission sysPermission = sysPermissionConverter.convert(sysPermissionVo);
        sysPermission.setId(snowflake.nextId());
        sysPermission.setCreateTime(new Date());
        baseMapper().insertSelective(sysPermission);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result update(SysPermissionVo sysPermissionVo) {
        SysPermission sysPermission = sysPermissionConverter.convert(sysPermissionVo);
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
    public Result delete(Long[] ids) {
        SysPermissionExample example = new SysPermissionExample();
        example.or().andIdIn(Arrays.asList(ids));
        baseMapper().deleteByExample(example);
        return Result.ok();
    }
}