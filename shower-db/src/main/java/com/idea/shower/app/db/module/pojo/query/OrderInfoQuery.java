package com.idea.shower.app.db.module.pojo.query;

import com.idea.shower.app.db.commons.pojo.BaseDbQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 15:51
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor

public class OrderInfoQuery extends BaseDbQuery {
    private String orderNo;
    private Integer type;
    private Long customerId;
    private String unionId;
}