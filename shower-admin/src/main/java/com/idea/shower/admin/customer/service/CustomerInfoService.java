package com.idea.shower.admin.customer.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.customer.pojo.CustomerInfoVo;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 17:05
 */
public interface CustomerInfoService {
    /**
     * @param customerInfoVo
     * @return
     */
    Result<?> add(CustomerInfoVo customerInfoVo);
}
