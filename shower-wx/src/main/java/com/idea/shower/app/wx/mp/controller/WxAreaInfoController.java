package com.idea.shower.app.wx.mp.controller;

import com.idea.shower.app.wx.mp.service.WxAreaInfoService;
import com.idea.shower.web.webmvc.controller.ResultController;
import com.idea.shower.web.webmvc.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 22:43
 */
@RestController
@RequestMapping("wx/area")
@AllArgsConstructor
public class WxAreaInfoController extends ResultController {
    private WxAreaInfoService wxAreaInfoService;

    @RequestMapping("areas")
    public Result areaList() {
        return wxAreaInfoService.areaInfoList();
    }

    @RequestMapping("buildings")
    public Result buildingList(Long areaId) {
        return wxAreaInfoService.areaBuildingList(areaId);
    }
}