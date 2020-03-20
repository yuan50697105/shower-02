package com.idea.shower.app.db.module.pojo;

import com.idea.shower.db.mybaits.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderInfoQuery extends BaseDbQuery {
    private Long id;
    private String orderNo;
    private String nickName;
    private Long customerId;
    private String customerOpenId;
    private String customerUnionId;

}