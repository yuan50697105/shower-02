package com.idea.shower.app.db.module.pojo;

import com.idea.shower.db.mybaits.pojo.BaseDbDbEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerInfo extends BaseDbDbEntity implements Serializable {
    private static final long serialVersionUID = 1L;
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
}