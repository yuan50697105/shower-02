package com.idea.shower.admin.admin.service;

import ai.yue.library.base.view.Result;
import com.idea.shower.admin.admin.pojo.LoginUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Set;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-31 10:27
 */
public interface AdminService {
    Result<?> doLogin(LoginUser user);

    Set<String> getRoleList(String username);
}
