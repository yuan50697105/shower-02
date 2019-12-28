package org.yuan.boot.webmvc.app.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.webmvc.db.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysUser extends BaseEntity<SysUser> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * username
     */
    private String username;
    /**
     * password
     */
    private String password;
    /**
     * realName
     */
    private String realName;
    /**
     * nickName
     */
    private String nickName;
    /**
     * createUser
     */
    private String createUser;
    /**
     * updateUser
     */
    private String updateUser;
    /**
     * createTime
     */
    private Date createTime;
    /**
     * updateTime
     */
    private Date updateTime;
    /**
     * enabled
     */
    private Integer enabled;

    public SysUser() {
    }

    public SysUser(Long id) {
        super(id);
    }

    @Builder
    public SysUser(Long id, String username, String password, String realName, String nickName, String createUser, String updateUser, Date createTime, Date updateTime, Integer enabled) {
        super(id);
        this.username = username;
        this.password = password;
        this.realName = realName;
        this.nickName = nickName;
        this.createUser = createUser;
        this.updateUser = updateUser;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.enabled = enabled;
    }
}