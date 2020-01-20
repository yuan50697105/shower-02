package org.yuan.boot.shower.db.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.commons.interceptor.annotation.CreateTime;
import org.yuan.boot.shower.commons.interceptor.annotation.UpdateTime;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 16:31
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class AdminUser extends BaseEntity<AdminUser> implements Serializable {
    /**
     * 账户
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String realName;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 创建时间
     */
    @CreateTime
    private Date createTime;
    /**
     * 更新时间
     */
    @UpdateTime
    private Date updateTime;


    public AdminUser() {
    }

    @Builder
    public AdminUser(Long id, String username, String password, String realName, String createUser, Date createTime, Date updateTime) {
        super(id);
        this.username = username;
        this.password = password;
        this.realName = realName;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}