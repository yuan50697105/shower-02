package com.idea.shower.app.wx.mp.service;


import com.idea.shower.app.wx.mp.pojo.WxLoginInfo;
import com.idea.shower.commons.pojo.WxUserInfo;
import com.idea.shower.commons.pojo.Result;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 12:47
 */
public interface WxCustomerInfoService {
    Result login(WxLoginInfo wxLoginInfo);

    Result saveUserInfo(WxUserInfo wxUserInfo);
}
