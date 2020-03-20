package com.idea.shower.app.db.module.utils.goods;

import com.idea.shower.app.db.module.constants.goods.GoodsTimeUnit;
import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 20:27
 */
@UtilityClass
public class GoodsUtils {
    public static Date getEndTime(Date startTime, Double timeInterval, Integer timeUnit) {
        Calendar calendar = Calendar.getInstance();
        switch (timeUnit) {
            case GoodsTimeUnit.HOUR:
                calendar.set(Calendar.HOUR, timeInterval.intValue());
                break;
            case GoodsTimeUnit.MINUTE:
                calendar.set(Calendar.MINUTE, timeInterval.intValue());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + timeUnit);
        }
        return calendar.getTime();
    }

    /**
     * 额外时间使用量
     *
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param timeUnit  时间单位
     * @return 时间使用量
     */
    public static Double getTimeUse(Date startTime, Date endTime, Integer timeUnit) {
        long timeUse = endTime.getTime() - startTime.getTime();
        switch (timeUnit) {
            case GoodsTimeUnit.HOUR:
                timeUse = timeUse / 1000 / 60;
                break;
            case GoodsTimeUnit.MINUTE:
                timeUse = timeUse / 1000 / 60 / 60;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + timeUnit);
        }
        return (double) timeUse;
    }

    /**
     * 额外水使用量
     *
     * @param rentalWaterUse 起租使用量
     * @param realWaterUse   实际使用量
     * @return 额外使用量
     */
    public static Double getWaterUse(Double rentalWaterUse, Double realWaterUse) {
        return realWaterUse - rentalWaterUse;
    }

    /**
     * 判断是否产生额外时间
     *
     * @param rentalEndTime   起租价结束时间
     * @param continueEndTime 结束使用时间
     * @return 是否产生额外时间
     */
    public static boolean isProduceContinueTimeUse(Date rentalEndTime, Date continueEndTime) {
        return rentalEndTime.before(continueEndTime);
    }

    /**
     * 判断是否有额外的水费产生
     *
     * @param realWaterUse   实际使用量
     * @param rentalWaterUse 起租价使用量
     * @return 是否有额外水费产生
     */
    public boolean isProduceContinueWaterUse(Double realWaterUse, Double rentalWaterUse) {
        return realWaterUse > rentalWaterUse;
    }

    /**
     * 获取总价
     *
     * @param waterUse      用水量
     * @param waterInterval 水费计费间隔
     * @param waterPrice    水价
     * @param timeUse       时间使用量
     * @param timeInterval  时间计费间隔
     * @param timePrice     时间价格
     * @return 总价
     */
    public static BigDecimal getTotalPrice(Double waterUse, Double waterInterval, BigDecimal waterPrice, Double timeUse, Double timeInterval, BigDecimal timePrice) {
        BigDecimal waterTotalPrice = getWaterTotalPrice(waterUse, waterInterval, waterPrice);
        BigDecimal timeTotalPrice = getTimeTotalPrice(timeUse, timeInterval, timePrice);
        return waterTotalPrice.add(timeTotalPrice);
    }

    /**
     * @param timeUse      时间使用量
     * @param timeInterval 时间计费间隔
     * @param timePrice    时间价格
     * @return 时间总价
     */
    private static BigDecimal getTimeTotalPrice(Double timeUse, Double timeInterval, BigDecimal timePrice) {
        return new BigDecimal(timeUse / timeInterval).multiply(timePrice);
    }

    /**
     * @param waterUse      用水量
     * @param waterInterval 水费计费间隔
     * @param waterPrice    水价
     * @return 水总价
     */
    private static BigDecimal getWaterTotalPrice(Double waterUse, Double waterInterval, BigDecimal waterPrice) {
        return new BigDecimal(waterUse / waterInterval).multiply(waterPrice);
    }
}