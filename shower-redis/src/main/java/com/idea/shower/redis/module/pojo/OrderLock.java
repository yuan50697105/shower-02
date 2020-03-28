package com.idea.shower.redis.module.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

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
public class OrderLock {
    @Id
    private Long orderId;
    private String orderCode;

}