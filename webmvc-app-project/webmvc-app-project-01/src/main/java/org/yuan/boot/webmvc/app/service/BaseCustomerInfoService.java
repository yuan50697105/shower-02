package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.pojo.condition.BaseCustomerInfoCondition;
import org.yuan.boot.webmvc.app.pojo.vo.BaseCustomerInfoVo;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
public interface BaseCustomerInfoService {
    Result page(BaseCustomerInfoCondition condition);

    Result list(BaseCustomerInfoCondition condition);

    Result get(BaseCustomerInfo customerInfo);

    Result get(Long id);

    Result save(BaseCustomerInfoVo baseCustomerInfoVo);

    Result update(BaseCustomerInfoVo customerInfoVo);

    Result delete(Long id);

    Result delete(List<Long> ids);
}
