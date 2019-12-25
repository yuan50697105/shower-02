package org.yuan.boot.webmvc.app.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseEntity;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
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

    public SysUser() {
    }

    public SysUser(Long id) {
        super(id);
    }

}
