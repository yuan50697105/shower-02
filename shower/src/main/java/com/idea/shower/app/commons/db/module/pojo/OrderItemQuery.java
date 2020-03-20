package com.idea.shower.app.commons.db.module.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:42
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderItemQuery extends BaseConditionQuery {
    private Long id;
    private Long orderId;
    private String orderNo;
    
}