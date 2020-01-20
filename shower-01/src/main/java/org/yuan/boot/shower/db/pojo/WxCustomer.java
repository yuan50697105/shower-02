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
    private String openId;
    private String username;
    private String phone;
    private String idNum;
    @CreateTime
    private Date createTime;
    @UpdateTime
    private Date updateTime;

    public WxCustomer() {
    }

    @Builder
    public WxCustomer(Long id, String openId, String username, String phone, String idNum, Date createTime, Date updateTime) {
        super(id);
        this.openId = openId;
        this.username = username;
        this.phone = phone;
        this.idNum = idNum;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}