package com.idea.shower.shower.app.wx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.idea.shower.shower.app.commons.web.controller.BaseController;
import com.idea.shower.shower.app.wx.service.WxGoodsService;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:51
 */
@RestController
@RequestMapping("wx/goods")
public class WxGoodsController extends BaseController {
    private WxGoodsService wxGoodsService;
}