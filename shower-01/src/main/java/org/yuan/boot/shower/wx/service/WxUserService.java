package org.yuan.boot.shower.wx.service;

import org.yuan.boot.shower.wx.pojo.WxUserInfoVO;
import org.yuan.boot.webmvc.pojo.Result;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:22
 */
public interface WxUserService {
    Result wxLogin(String jsCode);

    Result getAccessToken();

    Result saveUserInfo(WxUserInfoVO wxUserInfoVO);
}
