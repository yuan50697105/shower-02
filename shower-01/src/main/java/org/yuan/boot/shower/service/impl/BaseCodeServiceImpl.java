package org.yuan.boot.shower.service.impl;

import cn.hutool.core.lang.Snowflake;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.shower.service.BaseCodeService;

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

    private Long getId() {
        return snowflake.nextId();
    }

    @Override
    public String getOrderSn() {
        return snowflake.nextIdStr();
    }
}