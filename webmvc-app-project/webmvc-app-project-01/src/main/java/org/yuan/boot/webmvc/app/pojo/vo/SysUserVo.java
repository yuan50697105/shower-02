package org.yuan.boot.webmvc.app.pojo.vo;

import lombok.Data;

@Data
public class SysUserVo {
    private Long id;
    private String username;
    private String password;
    private String nickName;
    private String realName;
}
