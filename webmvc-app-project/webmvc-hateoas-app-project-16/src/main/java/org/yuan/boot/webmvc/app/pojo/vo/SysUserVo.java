package org.yuan.boot.webmvc.app.pojo.vo;

import lombok.Data;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:26
 */
@Data
public class SysUserVo {
    private Long id;
    private String username;
    private String password;
    private String realName;
    private String nickName;
}