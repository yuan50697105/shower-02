package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class AdminUser implements Serializable {
    /**
     * id
     */
    private Long id;

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
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public static org.yuan.boot.shower.db.pojo.AdminUser.AdminUserBuilder builder() {
        return new org.yuan.boot.shower.db.pojo.AdminUser.AdminUserBuilder();
    }
}