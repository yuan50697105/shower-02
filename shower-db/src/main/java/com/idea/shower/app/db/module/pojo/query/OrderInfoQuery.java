package com.idea.shower.app.db.module.pojo.query;

import com.idea.shower.app.db.commons.pojo.BaseDbQuery;
import com.idea.shower.app.db.module.constants.OrderInfoConstants.OrderStatus;
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
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 订单类型
     */
    private Integer type;
    /**
     * 用户ID
     */
    private Long customerId;

    /**
     * 微信OPENID
     */
    private String openId;

    /**
     * 订单状态{@link OrderStatus}
     *
     */
    private Integer status;

    private Integer page;
    private Integer limit;
}