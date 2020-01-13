package org.yuan.boot.webmvc.app.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SysUserRoleView implements Serializable {
    /**
    * id
    */
    private Long id;

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
    private Byte enabled;

    /**
    * name
    */
    private String roleName;

    private static final long serialVersionUID = 1L;
}