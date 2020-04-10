package com.idea.shower.app.wx.mp.util;

/**
 * @author wcq
 * 微信登录, getPhoneNumber模式信息
 * @title: EncryptedPhone
 * @projectName shower-01
 * @date 2020/3/2315:03
 */
public class EncryptedPhone {
    private String encryptedData;
    private String errMsg;
    private String iv;

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }
}
