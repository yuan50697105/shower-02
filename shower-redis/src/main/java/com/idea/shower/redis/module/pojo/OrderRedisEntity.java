package com.idea.shower.redis.module.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.concurrent.TimeUnit;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 16:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRedisEntity {
    @Id
    private Long orderId;
    private String orderNo;
    private Long deviceId;
    private String deviceCode;
    private Long customerId;
    private String openId;
    private Integer time;
    private TimeUnit unit;
}