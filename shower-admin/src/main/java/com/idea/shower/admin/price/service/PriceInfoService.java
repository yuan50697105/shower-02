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

    PageResult<PriceInfoAo> data(PriceInfoQuery query);

    List<PriceInfoAo> list(PriceInfoQuery query);

    void add(PriceInfo areaInfo);

    void update(PriceInfo priceInfo);

    void delete(Long id);

    void delete(List<Long> id);
}