package com.idea.shower.app.commons.db.module.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderInfoQueryBaseConditionQuery extends BaseConditionQuery {
    private Long id;
    private String orderNo;
    private String nickName;
    private Long customerId;
    private String customerOpenId;
    private String customerUnionId;

    public OrderInfoQueryBaseConditionQuery() {
    }

    public OrderInfoQueryBaseConditionQuery(int page, int size) {
        super(page, size);
    }

    public OrderInfoQueryBaseConditionQuery(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}