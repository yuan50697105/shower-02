package com.idea.shower.admin.area.controller;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.area.pojo.AreaInfoVo;
import com.idea.shower.admin.area.service.AreaInfoService;
import com.idea.shower.app.db.module.pojo.query.AreaInfoQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-08-09 19:33
 */
@RestController
@RequestMapping("/area/info")
public class AreaInfoController {
    @Autowired
    private AreaInfoService areaInfoService;

    @GetMapping("/data")
    public Result<?> data(AreaInfoQuery query) {
        return areaInfoService.data(query);
    }

    @GetMapping("/list")
    public Result<?> list(AreaInfoQuery query) {
        return areaInfoService.list(query);
    }

    @GetMapping("/get")
    public Result<?> get(Long id) {
        return areaInfoService.get(id);
    }

    @PostMapping({"", "add"})
    public Result<?> add(AreaInfoVo areaInfo) {
        return areaInfoService.add(areaInfo);
    }
}