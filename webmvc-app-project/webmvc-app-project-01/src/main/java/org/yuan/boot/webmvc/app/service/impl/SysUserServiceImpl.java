package org.yuan.boot.webmvc.app.service.impl;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.http.HttpStatus;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.db.service.impl.BaseDbServiceImpl;
import org.yuan.boot.webmvc.app.mapper.SysUserMapper;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.service.SysUserService;
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
@AllArgsConstructor
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser,  SysUserMapper> implements SysUserService {
    private SysUserConverter sysUserConverter;
    private Snowflake snowflake;

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
    @Transactional(rollbackFor = Exception.class)
    public Result save(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo).setId(snowflake.nextId()).setCreateTime(new Date());
        baseMapper().insertSelective(sysUser);
        return Result.ok();
    }
}