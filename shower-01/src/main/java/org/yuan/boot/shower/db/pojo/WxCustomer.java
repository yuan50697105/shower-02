package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class WxCustomer extends BaseEntity implements Serializable {
    /**
     * 微信OPENID
     */
    private String openId;

    /**
     * 微信UNIONID
     */
    private String unionId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 电话
     */
    private String phone;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}