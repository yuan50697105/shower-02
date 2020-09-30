package com.idea.shower.admin.area.service.impl;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.idea.shower.admin.area.pojo.AreaInfoVo;
import com.idea.shower.admin.area.service.AreaInfoService;
import com.idea.shower.db.mybaits.commons.pojo.PageResult;
import com.idea.shower.db.mybaits.module.dao.AreaInfoDao;
import com.idea.shower.db.mybaits.module.pojo.AreaInfo;
import com.idea.shower.db.mybaits.module.pojo.query.AreaInfoQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-09 19:36
 */
@Service
@Transactional
public class AreaInfoServiceImpl implements AreaInfoService {
    @Autowired
    private AreaInfoDao areaInfoDao;

    @Override
    public Result<?> data(AreaInfoQuery query) {
        PageResult<AreaInfo> pageResult = areaInfoDao.selectPageByQuery(query);
        return ResultInfo.success(pageResult);
    }

    @Override
    public Result<?> list(AreaInfoQuery query) {
        return ResultInfo.success(areaInfoDao.selectListByQuery(query));
    }

    @Override
    public Result<?> add(AreaInfoVo areaInfo) {
        areaInfoDao.insert(areaInfo);
        return ResultInfo.success();
    }

    @Override
    public Result<?> delete(Long id) {
        areaInfoDao.delete(id);
        return ResultInfo.success();
    }

    @Override
    public Result<?> delete(List<Long> id) {
        id.forEach(this::delete);
        return ResultInfo.success();
    }

    @Override
    public Result<?> update(AreaInfoVo areaInfo) {
        Optional<AreaInfo> optional = areaInfoDao.getOpt(areaInfo.getId());
        if (optional.isPresent()) {
            AreaInfo info = optional.get();
            info.copyFrom(areaInfo, "id,code,createDate");
            areaInfoDao.update(info);
        }
        return ResultInfo.success();
    }

    @Override
    public Result<?> get(Long id) {
        return ResultInfo.success(areaInfoDao.get(id));
    }

}