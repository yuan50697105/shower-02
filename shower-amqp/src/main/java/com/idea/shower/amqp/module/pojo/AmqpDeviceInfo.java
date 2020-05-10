package com.idea.shower.amqp.module.pojo;

import lombok.Data;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-04-09 20:35
 */
@Data
public class AmqpDeviceInfo {
    private String deviceCode;
    private Long deviceId;
    private DeviceStatus status;
    public enum DeviceStatus {
        OPEN(57, "开启"),
        STOP(56, "停止");

        private final Integer code;
        private final String mark;

        DeviceStatus(Integer code, String mark) {
            this.code = code;
            this.mark = mark;
        }

        public Integer getCode() {
            return code;
        }

        public String getMark() {
            return mark;
        }
    }
}