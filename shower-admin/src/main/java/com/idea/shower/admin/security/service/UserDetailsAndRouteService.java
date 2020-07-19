package com.idea.shower.admin.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Set;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-07-07 22:11
 */
public interface UserDetailsAndRouteService extends UserDetailsService {
    Set<String> getRoleList(String username);

    Set<String> getRouteList(String username);
}
