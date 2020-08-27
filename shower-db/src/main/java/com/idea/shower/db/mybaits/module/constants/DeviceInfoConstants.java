package com.idea.shower.db.mybaits.module.constants;

/**
 * @program: shower-01
 * @description: 设备信息状态常量
 * @author: yuane
 * @create: 2020-01-23 18:31
 */
public class DeviceInfoConstants {

    /**
     * 设备类型
     */
    public static class DeviceType {
        /**
         * 室外机
         */
        public static final int OUT_TYPE = 1;
        /**
         * 室内机
         */
        public static final int INNER_TYPE = 2;
    }

    /**
     * 设备运行状态
     */
    public static class DeviceRunningStatus {
        public static final int AVALI = 0;
        public static final int RUNNING = 1;
        public static final int ALL_STATUS = 2;
    }

}