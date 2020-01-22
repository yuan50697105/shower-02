package org.yuan.boot.shower.admin.service;

import org.yuan.boot.shower.db.pojo.WxOrderInfoCondition;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:20
 */
public interface WxOrderInfoService {
    Result data(WxOrderInfoCondition condition);
}
