package com.idea.shower.admin.order.service;

import com.idea.shower.db.mybaits.module.pojo.ao.OrderInfoAo;
import com.idea.shower.db.mybaits.module.pojo.OrderInfo;
import io.renren.common.page.PageData;
import io.renren.common.service.CrudService;
import io.renren.common.utils.Result;

import java.util.Map;

/**
 * order_info
 *
 * @author finch 2410015564@qq.com
 * @since 1.0.0 2020-08-12
 */
public interface OrderInfoService extends CrudService<OrderInfo, OrderInfoAo> {

}