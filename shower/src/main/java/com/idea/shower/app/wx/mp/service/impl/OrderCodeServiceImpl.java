package com.idea.shower.app.wx.mp.service.impl;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.idea.shower.app.wx.mp.service.OrderCodeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 12:00
 */
@Service
@AllArgsConstructor
public class OrderCodeServiceImpl implements OrderCodeService {
    private Snowflake snowflake;

    @Override
    public String generateOrderNo() {
        return IdUtil.getSnowflake(1,2).nextIdStr();
    }
}