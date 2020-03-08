package com.idea.shower.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.commons.pojo.BaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderItemCondition extends BaseCondition {
    private Long id;
    private Long orderId;
    private String orderNo;
    
    public OrderItemCondition() {
    }

    public OrderItemCondition(int page, int size) {
        super(page, size);
    }

    public OrderItemCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}