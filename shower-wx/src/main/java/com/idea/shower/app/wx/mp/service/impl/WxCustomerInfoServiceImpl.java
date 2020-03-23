package com.idea.shower.app.wx.mp.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.WxMaUserService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.idea.shower.app.db.module.dao.CustomerInfoDao;
import com.idea.shower.app.db.module.pojo.CustomerInfo;
import com.idea.shower.app.wx.mp.pojo.WxUserInfo;
import com.idea.shower.app.wx.mp.service.WxCustomerInfoService;
import com.idea.shower.web.webmvc.pojo.Result;
import com.idea.shower.web.webmvc.utils.ResultUtils;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public Result login(String jsCode) {
        WxMaJscode2SessionResult sessionResult = wxMaService.jsCode2SessionInfo(jsCode);
        if (!isExistCustomerInfo(sessionResult)) {
            saveCustomerInfo(sessionResult);
        }
        return ResultUtils.data(sessionResult);
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
        long count = customerInfoDao.countByUnionId(sessionResult.getUnionid());
        return count > 0;
    }

    /**
     * 添加用户信息
     *
     * @param sessionResult
     */
    private void saveCustomerInfo(WxMaJscode2SessionResult sessionResult) {
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setOpenId(sessionResult.getOpenid());
        customerInfo.setUnionId(sessionResult.getUnionid());
        customerInfoDao.save(customerInfo);
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
}