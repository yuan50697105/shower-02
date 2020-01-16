package org.yuan.boot.webmvc.app.pojo.vo;

import lombok.Data;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 21:47
 */
@Data
public class OrderInfoVo {
    private Long userId;
    private Long userOpenId;
    private Long deviceId;
    private String deviceCode;
}