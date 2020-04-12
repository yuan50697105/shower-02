package com.idea.shower.app.wx.mp.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaUserService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.alibaba.fastjson.JSONObject;
import com.idea.shower.app.db.module.dao.CustomerInfoDao;
import com.idea.shower.app.db.module.pojo.CustomerInfo;
import com.idea.shower.app.wx.mp.pojo.WxLoginInfo;
import com.idea.shower.app.wx.mp.pojo.WxUserInfo;
import com.idea.shower.app.wx.mp.service.WxCustomerInfoService;
import com.idea.shower.app.wx.mp.util.EncryptedPhone;
import com.idea.shower.app.wx.mp.util.GetPhoneNumber;
import com.idea.shower.app.wx.mp.util.UserTokenManager;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 12:47
 */
@Service
@AllArgsConstructor
public class WxCustomerInfoServiceImpl implements WxCustomerInfoService {
    private CustomerInfoDao customerInfoDao;
    private WxMaService wxMaService;

    @SneakyThrows
    @Override
    public Result login(WxLoginInfo wxLoginInfo) {
        WxMaJscode2SessionResult sessionResult = wxMaService.jsCode2SessionInfo(wxLoginInfo.getCode());
        if (sessionResult.getSessionKey() == null || sessionResult.getOpenid() == null) {
            return ResultUtils.data("登录失败");
        }
        CustomerInfo customerInfo = new CustomerInfo();
        if (!isExistCustomerInfo(sessionResult)) {
            customerInfo = saveCustomerInfo(sessionResult,wxLoginInfo);
        }else {
            Optional<CustomerInfo> infoOptional = customerInfoDao.getByOpenId(sessionResult.getOpenid());
            customerInfo = infoOptional.get();
        }
        // token
        String token = UserTokenManager.generateToken(customerInfo.getId());

        Map<Object, Object> result = new HashMap<Object, Object>();
        result.put("token", token);
        result.put("userInfo", customerInfo);
        return ResultUtils.data(result);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result saveUserInfo(WxUserInfo wxUserInfo) {
        WxMaUserService userService = wxMaService.getUserService();
        WxMaUserInfo userInfo = userService.getUserInfo(wxUserInfo.getSessionKey(), wxUserInfo.getEncryptedData(), wxUserInfo.getIvStr());
        WxMaPhoneNumberInfo phoneNoInfo = userService.getPhoneNoInfo(wxUserInfo.getSessionKey(), wxUserInfo.getEncryptedData(), wxUserInfo.getIvStr());
        updateCustomerUserInfo(userInfo, phoneNoInfo);
        return ResultUtils.ok();
    }


    /**
     * 检查是否存在此用户
     *
     * @param sessionResult
     * @return
     */
    private boolean isExistCustomerInfo(WxMaJscode2SessionResult sessionResult) {
        long count = customerInfoDao.countByOpenId(sessionResult.getOpenid());
        return count > 0;
    }

    /**
     * 添加用户信息
     *
     * @param sessionResult
     */
    private CustomerInfo saveCustomerInfo(WxMaJscode2SessionResult sessionResult,WxLoginInfo wxLoginInfo) {
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setOpenId(sessionResult.getOpenid());
        customerInfo.setUnionId(sessionResult.getUnionid());

        String phone = null;
        try {
            phone = deciphering(wxLoginInfo.getEncryptedPhone(), sessionResult.getSessionKey());
        } catch (Exception e) {
            e.printStackTrace();
        }
        customerInfo.setPhoneNum(phone);
        customerInfoDao.save(customerInfo);
        return customerInfo;
    }

    /**
     * 更新用户信息
     *
     * @param userInfo
     * @param phoneNoInfo
     */
    private void updateCustomerUserInfo(WxMaUserInfo userInfo, WxMaPhoneNumberInfo phoneNoInfo) {
        String unionId = userInfo.getUnionId();
        Optional<CustomerInfo> optional = customerInfoDao.getByUnionId(unionId);
        optional.ifPresent(customerInfo -> {
            customerInfo.setGender(Integer.valueOf(userInfo.getGender()));
            customerInfo.setNickName(userInfo.getNickName());
            customerInfo.setPhoneNum(phoneNoInfo.getPhoneNumber());
            customerInfoDao.update(customerInfo);
        });
    }

    /**
     * 解析电话号码
     *
     * @param encryptedPhone
     * @param session_key
     * @return
     */
    public String deciphering(EncryptedPhone encryptedPhone, String session_key) {
        String encryptedData = encryptedPhone.getEncryptedData();
        String iv = encryptedPhone.getIv();
        // 解密电话号码
        JSONObject obj = GetPhoneNumber.getPhoneNumber(session_key, encryptedData, iv);
        String phone = null;
        if (obj != null) {
            phone = obj.get("phoneNumber").toString();
        }
        return phone;
    }
}