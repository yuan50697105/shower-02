package org.yuan.boot.webmvc.app.service.impl;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.yuan.boot.webmvc.app.mapper.BaseCustomerInfoMapper;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.service.BaseCustomerInfoService;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 19:40
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class BaseCustomerInfoServiceImpl extends BaseServiceImpl<BaseCustomerInfo, BaseCustomerInfoMapper> implements BaseCustomerInfoService {

}