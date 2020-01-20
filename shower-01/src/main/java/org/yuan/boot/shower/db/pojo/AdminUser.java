package org.yuan.boot.shower.db.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
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
    private String username;
    private String password;
    private String realName;
    private String createUser;
    private Date createTime;
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