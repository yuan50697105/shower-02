package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

import java.util.Date;

/**
 * customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo extends BaseDbEntity {
    /**
     * id
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 修改人
     */
    private Long updater;

    private String delFlag;

    /**
     * 用户微信OpenId
     */
    private String openId;

    /**
     * 用户微信UNIONID（未使用）
     */
    private String unionId;

    /**
     * 用户微信昵称
     */
    private String nickName;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 电话
     */
    private String phoneNum;
}