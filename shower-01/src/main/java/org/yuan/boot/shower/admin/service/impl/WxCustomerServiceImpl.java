package org.yuan.boot.shower.admin.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.yuan.boot.shower.admin.service.WxCustomerService;
import org.yuan.boot.shower.db.dao.WxCustomerDao;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:19
 */
@Service
@AllArgsConstructor
@Log4j2
public class WxCustomerServiceImpl implements WxCustomerService {
    private WxCustomerDao wxCustomerDao;
}