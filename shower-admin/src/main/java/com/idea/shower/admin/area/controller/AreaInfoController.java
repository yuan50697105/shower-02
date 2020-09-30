package com.idea.shower.admin.area.controller;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.area.pojo.AreaInfoVo;
import com.idea.shower.admin.area.service.AreaInfoService;
import com.idea.shower.db.mybaits.module.pojo.query.AreaInfoQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping({"/get"})
    public Result<?> get(Long id) {
        return areaInfoService.get(id);
    }

    @GetMapping({"/{id}"})
    public Result<?> get1(@PathVariable Long id) {
        return areaInfoService.get(id);
    }

    @PostMapping({"/", "/save"})
    public Result<?> add(@RequestBody AreaInfoVo areaInfo) {
        return areaInfoService.add(areaInfo);
    }

    @PutMapping({"/", "/save"})
    public Result<?> update(@RequestBody AreaInfoVo areaInfo) {
        return areaInfoService.update(areaInfo);
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        return areaInfoService.delete(id);
    }

    @DeleteMapping("")
    public Result<?> delete(@RequestBody List<Long> id) {
        return areaInfoService.delete(id);
    }
}