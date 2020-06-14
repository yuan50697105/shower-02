package com.yuan.shower.security;

import lombok.Data;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-31 16:10
 */
@Data
public class LoginUser {
    private String username;
    private String password;
}