package com.idea.shower.admin.area.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.area.pojo.AreaInfoVo;
import com.idea.shower.app.db.module.pojo.query.AreaInfoQuery;

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
}
