package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 会员信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfo extends BaseDbEntity {
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
}