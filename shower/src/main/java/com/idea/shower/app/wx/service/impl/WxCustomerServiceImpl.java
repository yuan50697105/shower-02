package com.idea.shower.app.wx.service.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.idea.shower.app.wx.service.WxCustomerConverter;
import com.idea.shower.app.wx.service.WxCustomerService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.idea.shower.app.commons.utils.ResultsUtils;
import com.idea.shower.app.commons.db.module.dao.CustomerInfoDao;
import com.idea.shower.app.commons.db.module.pojo.CustomerInfo;
import com.idea.shower.web.webmvc.pojo.Result;

import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:39
 */
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class, propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class WxCustomerServiceImpl implements WxCustomerService {
    private CustomerInfoDao customerInfoDao;
    private WxCustomerConverter wxCustomerConverter;
    private WxMaService wxMaService;

    @Override
    public String getCustomerNameByUnionId(String customerUnionId) {
        Optional<CustomerInfo> customerInfo = customerInfoDao.getByUnionId(customerUnionId);
        return customerInfo.orElse(new CustomerInfo()).getUnionId();
    }

    /**
     * 登录并保存信息
     *
     * @param jsCode jsoCode
     * @return sessionInfo
     */
    @SneakyThrows
    @Override
    public Result loginAndSave(String jsCode) {
        WxMaJscode2SessionResult sessionResult = wxMaService.jsCode2SessionInfo(jsCode);
        Optional<CustomerInfo> optional = customerInfoDao.getByUnionId(sessionResult.getUnionid());
        if (!optional.isPresent()) {
            CustomerInfo customerInfo = new CustomerInfo();
            customerInfo.setOpenId(sessionResult.getOpenid());
            customerInfo.setUnionId(sessionResult.getOpenid());
            customerInfoDao.save(customerInfo);
        }
        return ResultsUtils.data(sessionResult);
    }


    /**
     * 获取用户信息
     * @param sessionKey
     * @param encryptedData
     * @param ivStr
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result getUserInfoAndUpdateInfo(String sessionKey, String encryptedData, String ivStr) {
        WxMaUserInfo userInfo = wxMaService.getUserService().getUserInfo(sessionKey, encryptedData, ivStr);
        WxMaPhoneNumberInfo phoneNoInfo = wxMaService.getUserService().getPhoneNoInfo(sessionKey, encryptedData, ivStr);
        String unionId = userInfo.getUnionId();
        Optional<CustomerInfo> optional = customerInfoDao.getByUnionId(unionId);
        if (optional.isPresent()) {
            CustomerInfo customerInfo = optional.get();
            customerInfo.setNickName(userInfo.getNickName());
            customerInfo.setGender(Integer.valueOf(userInfo.getGender()));
            customerInfo.setPhone(phoneNoInfo.getPhoneNumber());
            customerInfoDao.updateById(customerInfo);
        }
        return ResultsUtils.ok();
    }

    @Override
    public Optional<CustomerInfo> getByUnionId(String unionId) {
        return customerInfoDao.getByUnionId(unionId);
    }


}