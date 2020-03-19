package com.idea.shower.app.commons.db.module.pojo;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseDbEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class MemberInfo extends BaseDbEntity implements Serializable {
    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 客户昵称
     */
    private String customerNickName;

    /**
     * 客户微信openId
     */
    private String customerOpenId;

    /**
     * 客户UNIONID
     */
    private String customerUnionId;

    /**
     * 客户类型
     */
    private Integer type;

    /**
     * 会员编号
     */
    private String code;

    private static final long serialVersionUID = 1L;
}