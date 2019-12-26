package org.yuan.boot.webmvc.app.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SysUserVo {
    private Long id;
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @NotEmpty(message = "密码不能为空")
    private String password;
    @NotEmpty(message = "昵称不能为空")
    private String nickName;
    @NotEmpty(message = "姓名不能为空")
    private String realName;
}
