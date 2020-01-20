package org.yuan.boot.shower.admin.service.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.yuan.boot.shower.admin.service.WxOrderInfoService;
import org.yuan.boot.shower.db.dao.WxOrderInfoDao;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 02:20
 */
@Service
@AllArgsConstructor
@Log4j2
public class WxOrderInfoServiceImpl implements WxOrderInfoService {
    private WxOrderInfoDao wxOrderInfoDao;
}