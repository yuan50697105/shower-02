package org.yuan.boot.webmvc.app.pojo;

import lombok.*;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
}