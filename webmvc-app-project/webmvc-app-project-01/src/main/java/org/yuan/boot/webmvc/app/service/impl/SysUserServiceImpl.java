package org.yuan.boot.webmvc.app.service.impl;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.hutool.core.lang.Snowflake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.mapper.SysUserMapper;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserConverter;
import org.yuan.boot.webmvc.app.pojo.dto.SysUserExcel;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.service.SysUserService;
import org.yuan.boot.webmvc.db.service.impl.BaseServiceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author yuane
 */
@SuppressWarnings("ALL")
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, SysUserMapper> implements SysUserService {
    @Autowired
    private SysUserConverter sysUserConverter;
    @Autowired
    private Snowflake snowflake;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveVo(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo).setId(snowflake.nextId()).setCreateTime(new Date());
        baseMapper().insertSelective(sysUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void modifyVo(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convert(sysUserVo).setUpdateTime(new Date());
        baseMapper().updateByPrimaryKeySelective(sysUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        baseMapper().deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<SysUser> selectPage(SysUserCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return new PageInfo<>(baseMapper().selectByCondition(condition));
    }

    @Override
    public List<SysUser> selectList(SysUserCondition condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public Optional<SysUser> selectOne(SysUser sysUser) {
        return baseMapper().selectOne(sysUser);
    }

    @Override
    public Optional<SysUser> selectById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    public Workbook exportWorkBook(SysUserCondition condition) {
        ExportParams exportParams = new ExportParams();
        exportParams.setTitle("用户表");
        exportParams.setSecondTitle("用户表");
        List<SysUser> sysUsers = selectList(condition);
        List<SysUserExcel> sysUserExcels = sysUserConverter.convertToExcel(sysUsers);
        return ExcelExportUtil.exportExcel(exportParams, SysUserExcel.class, sysUserExcels);
    }
}
