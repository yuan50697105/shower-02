package org.yuan.boot.shower.wx.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.utils.Results;
import org.yuan.boot.shower.db.dao.WxCustomerDao;
import org.yuan.boot.shower.db.pojo.WxCustomer;
import org.yuan.boot.shower.wx.converter.WxCustomerConverter;
import org.yuan.boot.shower.wx.pojo.WxUserInfoVO;
import org.yuan.boot.shower.wx.service.WxUserService;
import org.yuan.boot.webmvc.pojo.Result;

import java.util.Collections;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:22
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class WxUserServiceImpl implements WxUserService {
    private WxMaService wxMaService;
    private WxCustomerDao wxCustomerDao;
    private WxCustomerConverter wxCustomerConverter;

    @SneakyThrows
    @Override
    public Result wxLogin(String jsCode) {
        WxMaJscode2SessionResult wxMaJscode2SessionResult = wxMaService.jsCode2SessionInfo(jsCode);
        return Results.data(wxMaJscode2SessionResult);
    }

    @SneakyThrows
    @Override
    public Result getAccessToken() {
        String accessToken = wxMaService.getAccessToken();
        return Results.data(Collections.singletonMap("accessToken", accessToken));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result saveUserInfo(WxUserInfoVO wxUserInfoVO) {
        String sessionKey = wxUserInfoVO.getSessionKey();
        String encryptedData = wxUserInfoVO.getEncryptedData();
        String iv = wxUserInfoVO.getIv();
        WxMaUserInfo userInfo = wxMaService.getUserService().getUserInfo(sessionKey, encryptedData, iv);
        WxMaPhoneNumberInfo phoneNoInfo = wxMaService.getUserService().getPhoneNoInfo(sessionKey, encryptedData, iv);
        WxCustomer wxCustomer = wxCustomerConverter.convertToWxCustomer(userInfo, phoneNoInfo);
        wxCustomerDao.saveWxCustomer(wxCustomer);
        return Results.data(wxCustomer);
    }


}