package com.idea.shower.admin.order.service.impl;

import ai.yue.library.base.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.idea.shower.admin.order.dao.OrderInfoDao;
import com.idea.shower.admin.order.dto.OrderInfoDTO;
import com.idea.shower.admin.order.service.OrderInfoService;
import com.idea.shower.db.mybaits.module.pojo.OrderInfo;
import io.renren.common.service.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * order_info
 *
 * @author finch 2410015564@qq.com
 * @since 1.0.0 2020-08-12
 */
@Service
public class OrderInfoServiceImpl extends CrudServiceImpl<OrderInfoDao, OrderInfo, OrderInfoDTO> implements OrderInfoService {

    @Override
    public QueryWrapper<OrderInfo> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OrderInfo> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}