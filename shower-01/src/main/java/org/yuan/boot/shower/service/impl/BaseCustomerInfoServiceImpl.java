package org.yuan.boot.shower.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.dao.BaseCustomerInfoDao;
import org.yuan.boot.shower.pojo.BaseCustomerInfo;
import org.yuan.boot.shower.pojo.condition.BaseCustomerInfoCondition;
import org.yuan.boot.shower.pojo.converter.BaseCustomerInfoConverter;
import org.yuan.boot.shower.pojo.vo.BaseCustomerInfoVo;
import org.yuan.boot.shower.service.BaseCustomerInfoService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class BaseCustomerInfoServiceImpl implements BaseCustomerInfoService {
    private BaseCustomerInfoDao baseCustomerInfoDao;
    private BaseCustomerInfoConverter baseCustomerInfoConverter;

    @Override
    public Result selectPage(BaseCustomerInfoCondition condition) {
        return Result.data(baseCustomerInfoDao.selectPage(condition));
    }

    @Override
    public Result selectList(BaseCustomerInfoCondition condition) {
        return Result.data(baseCustomerInfoDao.selectList(condition));
    }

    @Override
    public Result selectOne(BaseCustomerInfo customerInfo) {
        return Result.data(baseCustomerInfoDao.selectOne(customerInfo));
    }

    @Override
    public Result selectById(Long id) {
        return Result.data(baseCustomerInfoDao.selectById(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result save(BaseCustomerInfoVo baseCustomerInfoVo) {
        BaseCustomerInfo customerInfo = baseCustomerInfoConverter.convert(baseCustomerInfoVo);
        baseCustomerInfoDao.save(customerInfo);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result update(BaseCustomerInfoVo customerInfoVo) {
        BaseCustomerInfo customerInfo = baseCustomerInfoConverter.convert(customerInfoVo);
        baseCustomerInfoDao.update(customerInfo);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(Long id) {
        baseCustomerInfoDao.delete(id);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result delete(List<Long> ids) {
        baseCustomerInfoDao.delete(ids);
        return Result.ok();
    }
}