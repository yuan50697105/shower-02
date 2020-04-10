package com.idea.shower.app.wx.mp.pojo;

import com.idea.shower.app.wx.mp.util.EncryptedPhone;
import lombok.Data;

/**
 * 登录实体
 * @author wcq
 * @title: WxLoginInfo
 * @projectName shower-01
 * @date 2020/3/2313:51
 */
@Data
public class WxLoginInfo {

    private String code;
    private UserInfo userInfo;
    private EncryptedPhone encryptedPhone;
}
