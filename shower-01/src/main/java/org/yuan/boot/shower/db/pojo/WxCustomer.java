package org.yuan.boot.shower.db.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.interceptor.annotation.CreateTime;
import org.yuan.boot.shower.commons.interceptor.annotation.UpdateTime;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 16:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WxCustomer extends BaseEntity<WxCustomer> implements Serializable {
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
    @CreateTime
    private Date createTime;
    /**
     * 修改时间
     */
    @UpdateTime
    private Date updateTime;

    public WxCustomer() {
    }


    @Builder
    public WxCustomer(Long id, String openId, String unionId, String nickName, String phone, Date createTime, Date updateTime) {
        super(id);
        this.openId = openId;
        this.unionId = unionId;
        this.nickName = nickName;
        this.phone = phone;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}