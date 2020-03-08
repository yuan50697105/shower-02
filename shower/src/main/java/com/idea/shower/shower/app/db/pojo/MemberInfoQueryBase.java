package com.idea.shower.shower.app.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.shower.app.commons.pojo.BaseQueryBase;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 11:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MemberInfoQueryBase extends BaseQueryBase {
    private String code;
    private Long customerId;
    private String customerOpenId;
    private String customerUnionId;

    public MemberInfoQueryBase() {
    }

    public MemberInfoQueryBase(int page, int size) {
        super(page, size);
    }

    public MemberInfoQueryBase(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}