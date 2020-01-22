package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 21:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class WxCustomerCondition extends AbstractBaseCondition {
    private Long id;
    private String name;
    private String phone;

    public WxCustomerCondition() {
    }

    public WxCustomerCondition(int page, int size) {
        super(page, size);
    }
}