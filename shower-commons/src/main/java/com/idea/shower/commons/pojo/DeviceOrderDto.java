package com.idea.shower.commons.pojo;

import lombok.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-17 22:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class DeviceOrderDto extends BaseMessageDto {
    private Long deviceId;
    private String orderNo;
    private String customerOpenId;
    private Long customerId;
}