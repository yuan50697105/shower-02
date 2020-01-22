package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

import java.util.Date;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 21:43
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class DeviceOrderInfoCondition extends AbstractBaseCondition {
    private Long id;
    private Long deviceId;
    private String deviceCode;
    private Long orderId;
    private String orderNo;
    private Long customerId;
    private String customerName;

    public DeviceOrderInfoCondition() {
    }

    public DeviceOrderInfoCondition(int page, int size) {
        super(page, size);
    }

    public DeviceOrderInfoCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}