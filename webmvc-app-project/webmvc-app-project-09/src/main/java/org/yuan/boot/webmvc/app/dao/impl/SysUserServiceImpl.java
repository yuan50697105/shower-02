package org.yuan.boot.webmvc.app.dao.impl;

import cn.hutool.http.HttpStatus;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.jpa.pojo.PageResult;
import org.yuan.boot.webmvc.app.dao.SysUserService;
import org.yuan.boot.webmvc.app.mapper.SysUserMapper;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.repository.SysUserRepository;
import org.yuan.boot.webmvc.exception.NoValidateResultRuntimeException;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.Date;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:31
 */
@EqualsAndHashCode(callSuper = true)
@Service
@Value
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserRepository, SysUserMapper> implements SysUserService {
    private SysUserConverter sysUserConverter;

    @Override
    public Result page(SysUserCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        List<SysUser> list = baseMapper().selectByCondition(condition);
        return Result.data(new PageResult<>(PageInfo.of(list)));
    }

    @Override
    public Result list(SysUserCondition condition) {
        return Result.data(baseMapper().selectByCondition(condition));
    }

    @Override
    public Result get(SysUser condition) throws NoValidateResultRuntimeException {
        try {
            return Result.data(baseMapper().selectOne(condition));
        } catch (DataAccessException e) {
            e.printStackTrace();
            throw new NoValidateResultRuntimeException(Result.error(HttpStatus.HTTP_INTERNAL_ERROR, "访问错误"));
        }
    }

    @Override
    public Result get(Long id) {
        return Result.data(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo).setCreateTime(new Date());
        baseMapper().insertSelective(sysUser);
        return Result.ok();
    }
}