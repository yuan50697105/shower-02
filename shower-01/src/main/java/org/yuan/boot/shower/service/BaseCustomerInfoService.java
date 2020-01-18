package org.yuan.boot.shower.service;

import org.yuan.boot.shower.pojo.BaseCustomerInfo;
import org.yuan.boot.shower.pojo.condition.BaseCustomerInfoCondition;
import org.yuan.boot.shower.pojo.vo.BaseCustomerInfoVo;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
public interface BaseCustomerInfoService {
    Result selectPage(BaseCustomerInfoCondition condition);

    Result selectList(BaseCustomerInfoCondition condition);

    Result selectOne(BaseCustomerInfo customerInfo);

    Result selectById(Long id);

    Result save(BaseCustomerInfoVo baseCustomerInfoVo);

    Result update(BaseCustomerInfoVo customerInfoVo);

    Result delete(Long id);

    Result delete(List<Long> ids);
}
