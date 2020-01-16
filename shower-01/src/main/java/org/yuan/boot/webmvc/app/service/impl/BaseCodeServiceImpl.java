package org.yuan.boot.webmvc.app.service.impl;

import cn.hutool.core.lang.Snowflake;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.service.BaseCodeService;

/**
 * @program: learning-demo-02
 * @description: 订单号service
 * @author: yuane
 * @create: 2020-01-15 22:09
 */
@Service
@AllArgsConstructor
public class BaseCodeServiceImpl implements BaseCodeService {
    private Snowflake snowflake;

    @Override
    public String getOrderSn() {
        return snowflake.nextIdStr();
    }
}