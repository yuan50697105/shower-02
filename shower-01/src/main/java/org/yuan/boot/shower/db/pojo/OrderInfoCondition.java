package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.commons.pojo.BaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 13:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class OrderInfoCondition extends BaseCondition {
    private Long id;
    private String orderNo;
    private String nickName;
    private Long customerId;
    private String customerOpenId;
    private String customerUnionId;

    public OrderInfoCondition() {
    }

    public OrderInfoCondition(int page, int size) {
        super(page, size);
    }

    public OrderInfoCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}