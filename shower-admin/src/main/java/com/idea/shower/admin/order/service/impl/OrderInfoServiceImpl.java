package com.idea.shower.admin.order.service.impl;

import ai.yue.library.base.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.idea.shower.admin.order.dao.OrderInfoDao;
import com.idea.shower.db.mybaits.module.pojo.dto.OrderInfoDTO;
import com.idea.shower.admin.order.service.OrderInfoService;
import com.idea.shower.db.mybaits.module.pojo.OrderInfo;
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
public class OrderInfoServiceImpl extends CrudServiceImpl<OrderInfoDao, OrderInfo, OrderInfoDTO> implements OrderInfoService {

    @Override
    public QueryWrapper<OrderInfo> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OrderInfo> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


    @Override
    public Result<PageData<OrderInfoDTO>> selectPage(Map<String, Object> params) {
        IPage<OrderInfo> page = getPage(params, "id", false);
        List<OrderInfoDTO> list =  baseDao.selectPageByChoices(params);
        return  new Result<PageData<OrderInfoDTO>>().ok(new PageData<OrderInfoDTO>(list, page.getTotal()));
    }
}