package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.db.dao.CustomerInfoDao;
import org.yuan.boot.shower.db.pojo.CustomerInfo;
import org.yuan.boot.shower.wx.converter.WxCustomerConverter;
import org.yuan.boot.shower.wx.service.WxCustomerService;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:39
 */
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class, propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class WxCustomerServiceImpl implements WxCustomerService {
    @Autowired
    private CustomerInfoDao customerInfoDao;
    private WxCustomerConverter wxCustomerConverter;

    @Override
    public String getCustomerNameByUnionId(String customerUnionId) {
        Optional<CustomerInfo> customerInfo = customerInfoDao.getByUnionId(customerUnionId);
        return customerInfo.orElse(new CustomerInfo()).getUnionId();
    }
}