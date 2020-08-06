package com.idea.shower.admin.customer.service.impl;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.customer.pojo.CustomerInfoVo;
import com.idea.shower.admin.customer.service.CustomerInfoService;
import com.idea.shower.app.db.module.dao.CustomerInfoDao;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-02 17:06
 */
@Service
@Data
public class CustomerInfoServiceImpl implements CustomerInfoService {
    private CustomerInfoDao customerInfoDao;

    @Override
    public Result<?> add(CustomerInfoVo customerInfoVo) {
        return null;
    }
}