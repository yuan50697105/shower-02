package org.yuan.boot.shower.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

import java.util.Date;
import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-19 21:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public final class BaseCustomerConsumeRecordCondition extends AbstractBaseCondition {
    private Long id;
    private List<Long> ids;
    private String name;
    private Date createTimeStart;
    private Date createTimeEnd;

    public BaseCustomerConsumeRecordCondition() {
    }

    public BaseCustomerConsumeRecordCondition(int page, int size) {
        super(page, size);
    }
}