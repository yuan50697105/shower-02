package com.idea.shower.app.commons.db.module.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseConditionQuery;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 11:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MemberInfoQueryBaseConditionQuery extends BaseConditionQuery {
    private String code;
    private Long customerId;
    private String customerOpenId;
    private String customerUnionId;

    public MemberInfoQueryBaseConditionQuery() {
    }

    public MemberInfoQueryBaseConditionQuery(int page, int size) {
        super(page, size);
    }

    public MemberInfoQueryBaseConditionQuery(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}