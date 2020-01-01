package org.yuan.boot.webmvc.app.pojo;

import lombok.*;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseEntity;

import java.util.Date;

/**
 * @program: learning-demo-02
 * @description: 用户实体
 * @author: yuane
 * @create: 2019-12-29 22:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SysUser extends BaseEntity<SysUser> {
    private Long id;
    private String username;
    private String password;
    private String realName;
    private String nickName;
    private String createUser;
    private String updateUser;
    private Date createTime;
    private Date updateTime;
    private Boolean enabled;
}