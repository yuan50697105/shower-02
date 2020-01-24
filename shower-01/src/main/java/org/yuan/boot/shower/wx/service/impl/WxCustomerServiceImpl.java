package org.yuan.boot.shower.wx.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import cn.hutool.core.map.MapUtil;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.CustomerInfoDao;
import org.yuan.boot.shower.db.pojo.CustomerInfo;
import org.yuan.boot.shower.wx.converter.WxUserInfoConverter;
import org.yuan.boot.shower.wx.pojo.WxUserInfo;
import org.yuan.boot.shower.wx.service.WxCustomerService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.HashMap;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:54
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
@Log4j2
public class WxCustomerServiceImpl implements WxCustomerService {
    private CustomerInfoDao customerInfoDao;
    private WxUserInfoConverter wxUserInfoConverter;
    private WxMaService wxMaService;

    @SneakyThrows
    @Override
    public Result login(String jsCode) {
        WxMaJscode2SessionResult sessionInfo = wxMaService.getUserService().getSessionInfo(jsCode);
        return Results.data(sessionInfo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result saveUserInfo(WxUserInfo wxUserInfo) {
        String sessionKey = wxUserInfo.getSessionKey();
        String enData = wxUserInfo.getEnData();
        String iv = wxUserInfo.getIv();
        WxMaUserInfo userInfo = wxMaService.getUserService().getUserInfo(sessionKey, enData, iv);
        WxMaPhoneNumberInfo phoneNoInfo = wxMaService.getUserService().getPhoneNoInfo(sessionKey, enData, iv);
        if (isFirstLogin(userInfo.getUnionId(), userInfo.getOpenId())) {
            CustomerInfo customerInfo = wxUserInfoConverter.convertForSave(userInfo, phoneNoInfo);
            customerInfoDao.save(customerInfo);
        } else {
            Optional<CustomerInfo> optional = customerInfoDao.getByUnionId(userInfo.getUnionId());
            if (optional.isPresent()) {
                CustomerInfo customerInfo = wxUserInfoConverter.convertForUpdate(optional.get(), userInfo, phoneNoInfo);
                customerInfoDao.updateById(customerInfo);
            }
        }
        return Results.ok();

    }

    @Override
    public Result getUserInfo(String sessionKey, String enData, String iv) {
        HashMap<Object, Object> hashMap = MapUtil.newHashMap(2);
        WxMaPhoneNumberInfo phoneNoInfo = wxMaService.getUserService().getPhoneNoInfo(sessionKey, enData, iv);
        WxMaUserInfo userInfo = wxMaService.getUserService().getUserInfo(sessionKey, enData, iv);
        hashMap.put("phoneNoInfo", phoneNoInfo);
        hashMap.put("userInfo", userInfo);
        return Results.data(hashMap);
    }

    /**
     * 通过sessionInfo判断是否是第一次登录
     *
     * @param unionId 微信登录信息
     * @param openId
     * @return 是否是第一登录
     */
    private boolean isFirstLogin(String unionId, String openId) {
        return customerInfoDao.existByUnionIdAndOpenId(unionId, openId);
    }


    @Override
    public Result getUserInfoById(Long id) {
        Optional<CustomerInfo> customerInfo = customerInfoDao.getById(id);
        return Results.data(customerInfo);
    }

}