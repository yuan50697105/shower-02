package com.idea.shower.admin.customer.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.admin.customer.service.CustomerInfoService;
import com.idea.shower.db.mybaits.module.mapper.CustomerInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.CustomerInfo;
import com.idea.shower.db.mybaits.module.pojo.ao.CustomerInfoAo;
import io.renren.common.service.impl.CrudServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * customer_info
 *
 * @author finch 2410015564@qq.com
 * @since 1.0.0 2020-09-16
 */
@Service
public class CustomerInfoServiceImpl extends CrudServiceImpl<CustomerInfoMapper, CustomerInfo, CustomerInfoAo> implements CustomerInfoService {

    @Override
    public QueryWrapper<CustomerInfo> getWrapper(Map<String, Object> params){
        String phoneNum = (String)params.get("phoneNum");

        QueryWrapper<CustomerInfo> wrapper = new QueryWrapper<>();
        wrapper.like(StringUtils.isNotBlank(phoneNum), "phone_num", phoneNum);

        return wrapper;
    }


}