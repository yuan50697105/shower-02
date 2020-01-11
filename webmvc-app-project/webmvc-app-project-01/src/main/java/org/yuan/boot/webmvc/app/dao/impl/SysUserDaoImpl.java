package org.yuan.boot.webmvc.app.dao.impl;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.http.HttpStatus;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.webmvc.app.dao.SysUserDao;
import org.yuan.boot.webmvc.app.mapper.SysUserMapper;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserConverter;
import org.yuan.boot.webmvc.app.pojo.example.SysUserExample;
import org.yuan.boot.webmvc.exception.NoValidateResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:31
 */
@AllArgsConstructor
@Component
public class SysUserDaoImpl extends BaseDaoImpl<SysUser, SysUserMapper> implements SysUserDao {
    private SysUserConverter sysUserConverter;
    private Snowflake snowflake;

    @Override
    public PageResult<SysUser> page(SysUserCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        List<SysUser> list = baseMapper().selectByCondition(condition);
        return new PageResult<>(PageInfo.of(list));
    }

    @Override
    public List<SysUser> list(SysUserCondition condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public Optional<SysUser> get(SysUser condition) throws NoValidateResultRuntimeException {
        try {
            return Optional.ofNullable(baseMapper().selectOne(condition));
        } catch (DataAccessException e) {
            e.printStackTrace();
            throw new NoValidateResultRuntimeException(Result.error(HttpStatus.HTTP_INTERNAL_ERROR, "访问错误"));
        }
    }

    @Override
    public Optional<SysUser> selectByUsername(String username) {
        return Optional.ofNullable(baseMapper().selectOneByUsername(username));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysUser sysUser) {
        sysUser = sysUser.setId(snowflake.nextId()).setCreateTime(new Date());
        baseMapper().insertSelective(sysUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(SysUser sysUser) {
        sysUser.setUpdateTime(new Date());
        baseMapper().updateByPrimaryKeySelective(sysUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> ids) {
        SysUserExample example = new SysUserExample();
        example.or().andIdIn(ids);
        baseMapper().deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        baseMapper().deleteByPrimaryKey(id);
    }
}