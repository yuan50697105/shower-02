package com.idea.shower.shower.app.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.app.commons.pojo.BaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-31 09:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GoodsInfoQueryBaseConditionQuery extends BaseConditionQuery {
    private Long id;
    private String code;
    private Integer type;

    public GoodsInfoQueryBaseConditionQuery() {
    }

    public GoodsInfoQueryBaseConditionQuery(int page, int size) {
        super(page, size);
    }

    public GoodsInfoQueryBaseConditionQuery(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}