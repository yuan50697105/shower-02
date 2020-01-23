package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 10:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class WxOrderItemCondition extends AbstractBaseCondition {
    private Long orderId;
    private String orderNo;
    private Long itemOrderId;
    private String itemOrderNo;

    public WxOrderItemCondition() {
    }

    public WxOrderItemCondition(int page, int size) {
        super(page, size);
    }

    public WxOrderItemCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}