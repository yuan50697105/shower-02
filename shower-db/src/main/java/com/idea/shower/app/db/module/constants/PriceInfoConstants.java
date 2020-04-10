package com.idea.shower.app.db.module.constants;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 20:04
 */
public class PriceInfoConstants {
    public static class PriceType {
        /**
         * 起租价
         */
        public static final int STARTING_PRICE = 1;
        /**
         * 续租价
         */
        public static final int RENEWAL_PRICE = 2;
    }

    public static class PriceTimeUnit {
        /**
         * 小时
         */
        public static final int HOUR = 1;
        /**
         * 分钟
         */
        public static final int MINUTE = 2;
    }

    public static class PriceWaterUnit {
        /**
         * 立方米
         */
        public static final int CUBIC_METER = 1;
        /**
         * 升、立方分米
         */
        public static final int RISE = 2;
    }

}