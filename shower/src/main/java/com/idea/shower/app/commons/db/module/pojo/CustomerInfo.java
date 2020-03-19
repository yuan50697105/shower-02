package com.idea.shower.app.commons.db.module.pojo;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.idea.shower.app.commons.pojo.BaseDbEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerInfo extends BaseDbEntity implements Serializable {
    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户OPENID
     */
    private String openId;

    /**
     * 用户UNIONID
     */
    private String unionId;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 电话
     */
    private String phone;

    private static final long serialVersionUID = 1L;
}