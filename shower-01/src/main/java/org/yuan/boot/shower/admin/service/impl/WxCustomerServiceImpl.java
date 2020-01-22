package org.yuan.boot.shower.admin.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.shower.admin.service.WxCustomerService;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.WxCustomerDao;
import org.yuan.boot.shower.db.pojo.WxCustomer;
import org.yuan.boot.shower.db.pojo.WxCustomerCondition;
import org.yuan.boot.webmvc.pojo.Result;

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

    @Override
    public Result data(WxCustomerCondition condition) {
        PageResult<WxCustomer> pageResult = wxCustomerDao.selectPage(condition);
        return Results.data(pageResult);
    }
}