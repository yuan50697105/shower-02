package com.idea.shower.shower.app.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.app.commons.pojo.BaseQueryBase;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderInfoQueryBase extends BaseQueryBase {
    private Long id;
    private String orderNo;
    private String nickName;
    private Long customerId;
    private String customerOpenId;
    private String customerUnionId;

    public OrderInfoQueryBase() {
    }

    public OrderInfoQueryBase(int page, int size) {
        super(page, size);
    }

    public OrderInfoQueryBase(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}