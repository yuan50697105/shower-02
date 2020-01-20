package org.yuan.boot.shower.wx.pojo;

import lombok.Data;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 20:14
 */
@Data
public class WxUserInfoVO {
    private UserInfo userInfo;
    private String jsCode;
    private String sessionKey;
    private String rawData;
    private String signature;
    private String encryptedData;
    private String iv;
    private String cloudID;

    @Data
    public static class UserInfo {
        private String nickName;
        private String avatarUrl;
        private Integer gender;
        private String country;
        private String province;
        private String city;
        private String language = "zh_CN";
    }

}