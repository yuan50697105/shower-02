package com.idea.shower.admin.order.service.impl;

import ai.yue.library.base.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.idea.shower.admin.order.service.OrderInfoService;
import com.idea.shower.db.mybaits.module.dao.OrderInfoDao;
import com.idea.shower.db.mybaits.module.dao.impl.OrderInfoDaoImpl;
import com.idea.shower.db.mybaits.module.mapper.OrderInfoMapper;
import com.idea.shower.db.mybaits.module.pojo.OrderInfo;
import com.idea.shower.db.mybaits.module.pojo.ao.OrderInfoAo;
import io.renren.common.page.PageData;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.common.utils.Result;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * order_info
 *
 * @author finch 2410015564@qq.com
 * @since 1.0.0 2020-08-12
 */
@Service
public class OrderInfoServiceImpl extends CrudServiceImpl<OrderInfoMapper, OrderInfo, OrderInfoAo> implements OrderInfoService {


    @Override
    public QueryWrapper<OrderInfo> getWrapper(Map<String, Object> params) {
        String orderNo = (String) params.get("orderNo");

        QueryWrapper<OrderInfo> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(orderNo), "order_no", orderNo);

        return wrapper;
    }

}