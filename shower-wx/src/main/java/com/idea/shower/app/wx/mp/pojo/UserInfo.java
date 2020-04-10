package com.idea.shower.app.wx.mp.pojo;

import lombok.Data;

/**
 * @author wcq
 * @title: UserInfo
 * @projectName shower-01
 * @date 2020/3/2314:59
 * 登录用户传入信息
 */
@Data
public class UserInfo {
    private String nickName;
    private String avatarUrl;
    private String country;
    private String province;
    private String city;
    private String language;
    private Byte gender;
}
