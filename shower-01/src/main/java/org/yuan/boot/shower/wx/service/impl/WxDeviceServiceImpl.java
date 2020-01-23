package org.yuan.boot.shower.wx.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.db.dao.OrderInfoDao;
import org.yuan.boot.shower.wx.service.WxDeviceService;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 19:22
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
@Log4j2
public class WxDeviceServiceImpl implements WxDeviceService {
    private OrderInfoDao orderInfoDao;
}