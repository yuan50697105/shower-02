package org.yuan.boot.shower.wx.service;

import lombok.SneakyThrows;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:54
 */
public interface WxCustomerService {
    Result login(String jsCode);

    Result getUserInfo(String jsCode);
}
