package org.yuan.boot.shower.admin.service;

import org.yuan.boot.shower.db.pojo.WxCustomerCondition;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:19
 */
public interface WxCustomerService {
    Result data(WxCustomerCondition condition);
}
