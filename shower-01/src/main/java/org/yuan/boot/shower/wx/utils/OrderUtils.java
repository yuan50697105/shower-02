package org.yuan.boot.shower.wx.utils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-28 14:03
 */
public class OrderUtils {
    public synchronized static Date calculateFinalTime(Date startTime, BigDecimal totalPrice, BigDecimal price, Integer unit) {
        int doubleValue = totalPrice.divide(price, 2, BigDecimal.ROUND_FLOOR).intValue();
        switch (unit.intValue()) {
            case 0:
//                分钟

                break;
            case 1:
//                小时
                break;
        }
    }
}