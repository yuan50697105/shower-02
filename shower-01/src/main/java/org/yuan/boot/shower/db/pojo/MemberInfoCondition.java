package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 11:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MemberInfoCondition extends BaseCondition {
    private String code;
    private Long customerId;
    private String customerOpenId;
    private String customerUnionId;

    public MemberInfoCondition() {
    }

    public MemberInfoCondition(int page, int size) {
        super(page, size);
    }

    public MemberInfoCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}