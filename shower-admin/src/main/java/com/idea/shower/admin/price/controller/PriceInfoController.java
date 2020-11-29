package com.idea.shower.admin.price.controller;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;
import com.idea.shower.admin.price.service.PriceInfoService;
import com.idea.shower.db.mybaits.module.pojo.PriceInfo;
import com.idea.shower.db.mybaits.module.pojo.query.PriceInfoQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-10-30 12:31
 */
@RestController
@RequestMapping("price/priceinfo")
public class PriceInfoController {
    @Autowired
    private PriceInfoService priceInfoService;

    @GetMapping("/data")
    public Result<?> data(PriceInfoQuery query) {
        return ResultInfo.success(priceInfoService.data(query));
    }

    @GetMapping("/list")
    public Result<?> list(PriceInfoQuery query) {
        return ResultInfo.success(priceInfoService.list(query));
    }

    @GetMapping({"/get"})
    public Result<?> get(Long id) {
        return ResultInfo.success(priceInfoService.get(id));
    }

    @GetMapping({"/{id}"})
    public Result<?> get1(@PathVariable Long id) {
        return ResultInfo.success(priceInfoService.get(id));
    }

    @PostMapping({"/", "/save"})
    public Result<?> add(@RequestBody PriceInfo priceInfo) {
        priceInfoService.add(priceInfo);
        return ResultInfo.success();
    }

    @PutMapping({"/", "/save"})
    public Result<?> update(@RequestBody PriceInfo priceInfo) {
        priceInfoService.update(priceInfo);
        return ResultInfo.success();
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        priceInfoService.delete(id);
        return ResultInfo.success();
    }

    @DeleteMapping("")
    public Result<?> delete(@RequestBody List<Long> id) {
        priceInfoService.delete(id);
        return ResultInfo.success();
    }
}