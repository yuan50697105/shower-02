package org.yuan.boot.shower.wx.service.impl;

import cn.hutool.core.util.IdUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.shower.wx.service.WxOrderNoService;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-28 11:49
 */
@Service
@AllArgsConstructor
public class WxOrderNoServiceImpl implements WxOrderNoService {

    @Override
    public synchronized String getOrderNo() {
        return IdUtil.getSnowflake(2, 2).nextIdStr();
    }
}