package com.idea.shower.shower.app.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.app.commons.pojo.BaseQueryBase;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderItemQueryBase extends BaseQueryBase {
    private Long id;
    private Long orderId;
    private String orderNo;
    
    public OrderItemQueryBase() {
    }

    public OrderItemQueryBase(int page, int size) {
        super(page, size);
    }

    public OrderItemQueryBase(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}