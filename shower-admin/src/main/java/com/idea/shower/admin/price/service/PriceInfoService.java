package com.idea.shower.admin.price.service;

import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.module.pojo.PriceInfo;
import com.idea.shower.db.mybaits.module.pojo.ao.PriceInfoAo;
import com.idea.shower.db.mybaits.module.pojo.query.PriceInfoQuery;
import io.renren.common.service.CrudService;

import java.util.List;

/**
 * order_info
 *
 * @author finch 2410015564@qq.com
 * @since 1.0.0 2020-08-12
 */
public interface PriceInfoService extends CrudService<PriceInfo, PriceInfoAo> {

    PageResult<PriceInfo> data(PriceInfoQuery query);

    List<PriceInfoAo> list(PriceInfoQuery query);

    Object add(PriceInfo areaInfo);

    Object update(PriceInfo priceInfo);

    Object delete(Long id);

    Object delete(List<Long> id);
}