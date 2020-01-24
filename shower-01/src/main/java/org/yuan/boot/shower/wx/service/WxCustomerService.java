package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.wx.pojo.WxUserInfo;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:54
 */
public interface WxCustomerService {
    Result login(String jsCode);

    Result saveUserInfo(WxUserInfo wxUserInfo);

    Result getUserInfo(String sessionKey, String enData, String iv);

    Result getUserInfoById(Long id);
}
