package com.idea.shower.admin.price;

import com.idea.shower.admin.price.service.PriceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}