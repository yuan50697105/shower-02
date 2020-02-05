package org.yuan.boot.shower.wx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.shower.commons.controller.BaseController;
import org.yuan.boot.shower.wx.service.WxGoodsService;

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