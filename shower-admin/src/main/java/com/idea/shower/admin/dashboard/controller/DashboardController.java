package com.idea.shower.admin.dashboard.controller;

import com.idea.shower.admin.dashboard.service.DashboardService;
import io.renren.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author finch
 */
@RestController
@RequestMapping("dashboard")
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;
    /**
     * 首页色块数量
     * @return
     */
    @GetMapping("informationNumber")
    public Result informationNumber(){
        return dashboardService.informationNumber();
    }

    /**
     * 服务项目订单比例
     * @return
     */
    @GetMapping("monthOrderData")
    public Result monthOrderData(){
        return dashboardService.monthOrderData();
    }

    /**
     * 设备订单比例
     * @return
     */
    @GetMapping("deviceOrderData")
    public Result deviceOrderData(){
        return dashboardService.deviceOrderData();
    }
}
