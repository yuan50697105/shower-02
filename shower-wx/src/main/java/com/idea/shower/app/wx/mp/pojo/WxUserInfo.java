package com.idea.shower.app.wx.mp.pojo;

import lombok.Data;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 13:02
 */
@Data
public class WxUserInfo {
    private String sessionKey;
    private String encryptedData;
    private String ivStr;
}