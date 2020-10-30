package com.idea.shower.admin.area.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;
import com.idea.shower.db.mybaits.module.pojo.ao.AreaBuildingAo;
import com.idea.shower.db.mybaits.module.pojo.query.AreaInfoQuery;
import com.idea.shower.db.mybaits.module.pojo.ao.AreaBuildingAo;
import com.idea.shower.db.mybaits.module.pojo.query.AreaInfoQuery;
import io.renren.common.page.PageData;
import io.renren.common.service.CrudService;

import java.util.Map;

/**
 * 楼宇信息
 *
 * @author finch 2410015564@qq.com
 * @since 1.0.0 2020-08-12
 */
public interface AreaBuildingService extends CrudService<AreaBuilding, AreaBuildingAo> {

    PageData<AreaBuildingAo> selectPageByQuery(Map<String, Object> params);
}