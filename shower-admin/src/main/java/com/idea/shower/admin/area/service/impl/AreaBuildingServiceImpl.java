package com.idea.shower.admin.area.service.impl;

import ai.yue.library.base.util.StringUtils;
import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.idea.shower.admin.area.service.AreaBuildingService;
import com.idea.shower.db.mybaits.module.dao.AreaBuildingDao;
import com.idea.shower.db.mybaits.module.mapper.AreaBuildingMapper;
import com.idea.shower.db.mybaits.module.pojo.AreaBuilding;
import com.idea.shower.db.mybaits.module.pojo.ao.AreaBuildingAo;
import com.idea.shower.db.mybaits.module.pojo.ao.AreaBuildingAo;
import com.idea.shower.db.mybaits.module.pojo.query.AreaBuildingQuery;
import io.renren.common.page.PageData;
import io.renren.common.service.impl.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 楼宇信息
 *
 * @author finch 2410015564@qq.com
 * @since 1.0.0 2020-08-12
 */
@Service
public class AreaBuildingServiceImpl extends CrudServiceImpl<AreaBuildingMapper, AreaBuilding, AreaBuildingAo> implements AreaBuildingService {

    @Autowired
    private AreaBuildingDao areaBuildingDao;

    @Override
    public QueryWrapper<AreaBuilding> getWrapper(Map<String, Object> params){
        String name = (String)params.get("name");
        QueryWrapper<AreaBuilding> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(name), "name", name);

        return wrapper;
    }

    @Override
    public PageData<AreaBuildingAo> selectPageByQuery(Map<String, Object> params) {
        AreaBuildingQuery query = BeanUtil.mapToBean(params, AreaBuildingQuery.class, true, CopyOptions.create());
        IPage<AreaBuildingAo> iPage = areaBuildingDao.selectPageByQuery(this.getPage(params, null, false), query);
        return new PageData<>(iPage.getRecords(), iPage.getTotal());
    }

}