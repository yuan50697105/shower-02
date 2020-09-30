package com.idea.shower.admin.area.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.area.pojo.AreaInfoVo;
import com.idea.shower.db.mybaits.module.pojo.query.AreaInfoQuery;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-09 19:36
 */
public interface AreaInfoService {
    Result<?> data(AreaInfoQuery query);

    Result<?> list(AreaInfoQuery query);

    Result<?> get(Long id);

    Result<?> add(AreaInfoVo areaInfo);

    Result<?> delete(Long id);

    Result<?> delete(List<Long> id);

    Result<?> update(AreaInfoVo areaInfo);
}
