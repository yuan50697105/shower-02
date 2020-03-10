package com.idea.shower.app.wx.controller;

import com.idea.shower.app.wx.service.WxGoodsService;
import com.idea.shower.app.commons.web.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:51
 */
@RestController
@RequestMapping("com/idea/shower/shower/app/wx/goods")
public class WxGoodsController extends BaseController {
    private WxGoodsService wxGoodsService;
}