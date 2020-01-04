package org.yuan.boot.webmvc.app.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import java.util.Date;

/**
 * @program: learning-demo-02
 * @description: 用户实体
 * @author: yuane
 * @create: 2019-12-29 22:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SysUser extends BaseEntity<SysUser> {
    private String username;
    private String password;
    private String realName;
    private String nickName;
    private String createUser;
    private String updateUser;
    private Date createTime;
    private Date updateTime;
    private Integer enabled;

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