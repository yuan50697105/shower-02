package org.yuan.boot.webmvc.app.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.jpa.pojo.PageResult;
import org.yuan.boot.webmvc.app.dao.SysRoleService;
import org.yuan.boot.webmvc.app.mapper.SysRoleMapper;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysRoleConverter;
import org.yuan.boot.webmvc.app.pojo.example.SysRoleExample;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.app.repository.SysRoleRepository;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.Date;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:13
 */
@EqualsAndHashCode(callSuper = true)
@Value
@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole, SysRoleRepository, SysRoleMapper> implements SysRoleService {
    private SysRoleConverter sysRoleConverter;

    @Override
    public Result page(SysRoleCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return Result.data(new PageResult<>(PageInfo.of(baseMapper().selectByCondition(condition))));
    }

    @Override
    public Result list(SysRoleCondition condition) {
        return Result.data(baseMapper().selectByCondition(condition));
    }

    @Override
    public Result get(SysRole sysRole) {
        return Result.data(baseMapper().selectOne(sysRole));
    }

    @Override
    public Result get(Long id) {
        return Result.data(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo).setCreateTime(new Date());
        baseMapper().insertSelective(sysRole);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result update(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo).setUpdateTime(new Date());
        baseMapper().updateByPrimaryKeySelective(sysRole);
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
        SysRoleExample example = new SysRoleExample();
        example.createCriteria().andIdIn(ids);
        baseMapper().deleteByExample(example);
        return Result.ok();
    }

}