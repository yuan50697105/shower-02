package com.idea.shower.db.mybaits.module.pojo.query;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 11:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MemberInfoQuery extends BaseDbQuery {
    private String code;
    private Long customerId;
    private String customerOpenId;
    private String customerUnionId;

}