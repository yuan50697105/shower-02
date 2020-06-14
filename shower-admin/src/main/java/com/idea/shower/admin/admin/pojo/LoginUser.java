package com.idea.shower.admin.admin.pojo;

import lombok.Data;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-31 10:28
 */
@Data
public class LoginUser {
    private String username;
    private String password;
    private Integer type;
}