package com.idea.shower.shower.app.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.app.commons.pojo.BaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderItemQueryBaseConditionQuery extends BaseConditionQuery {
    private Long id;
    private Long orderId;
    private String orderNo;
    
    public OrderItemQueryBaseConditionQuery() {
    }

    public OrderItemQueryBaseConditionQuery(int page, int size) {
        super(page, size);
    }

    public OrderItemQueryBaseConditionQuery(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}