package org.yuan.boot.shower.wx.service;

import lombok.SneakyThrows;
import org.yuan.boot.shower.db.pojo.CustomerInfo;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:39
 */
public interface WxCustomerService {
    String getCustomerNameByUnionId(String customerUnionId);

    /**
     * 登录并保存信息
     *
     * @param jsCode jsoCode
     * @return sessionInfo
     */
    @SneakyThrows
    Result loginAndSave(String jsCode);

    /**
     * 获取用户信息并保存信息
     *
     * @param sessionKey
     * @param encryptedData
     * @param ivStr
     * @return
     */
    Result getUserInfoAndUpdateInfo(String sessionKey, String encryptedData, String ivStr);

    /**
     * 通过UNIONID获取用户信息
     * @param unionId 用户UNIONID
     * @return 用户信息
     */
    Optional<CustomerInfo> getByUnionId(String unionId);
}
