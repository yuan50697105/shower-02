package org.yuan.boot.shower.admin.pojo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:01
 */
@Data
public class AdminUserVO {
    @NotEmpty(groups = {Update.class, ChangeRole.class})
    private Long id;
    @NotEmpty(groups = {Save.class})
    private String username;
    @NotEmpty(groups = {ChangePwd.class})
    private String password;
    @NotEmpty(groups = {Save.class, Update.class})
    private String realName;
    @NotEmpty(groups = {ChangeRole.class})
    private List<Long> roleIds;
    @NotEmpty(groups = {ChangePwd.class})
    private String newPassword;

    public interface Save {
    }

    public interface Update {
    }

    public interface ChangePwd {
    }

    public interface ChangeRole {
    }


}