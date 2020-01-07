package org.yuan.boot.webmvc.app.service.impl;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.mapper.BaseCustomerInfoMapper;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.service.BaseCustomerInfoService;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 19:40
 */
@AllArgsConstructor
@Service
public class BaseCustomerInfoServiceImpl extends BaseServiceImpl<BaseCustomerInfo, BaseCustomerInfoMapper> implements BaseCustomerInfoService {

}