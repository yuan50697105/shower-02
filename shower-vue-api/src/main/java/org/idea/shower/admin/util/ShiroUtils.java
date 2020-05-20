package org.idea.shower.admin.util;

import org.apache.shiro.SecurityUtils;
import org.idea.shower.db.domain.showerAdmin;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;

/**
 * @program: shower
 * @description:
 * @author: yuanez
 * @create: 2019-10-09 10:02
 **/
public class ShiroUtils {
    public static showerAdmin getUser() {
        return ((showerAdmin) SecurityUtils.getSubject().getPrincipal());
    }

    public static Integer getUserId() {
        return getUser().getId();
    }

    public static String getUsername() {
        return getUser().getUsername();
    }

    public static Integer[] getRoles() {
        return getUser().getRoleIds();
    }

    public static boolean containsRoles(Integer... roles) {
        return CollectionUtils.containsAny(Arrays.asList(getRoles()), Arrays.asList(roles));
    }

    public static boolean equalsRole(Integer role) {
        return Arrays.asList(getRoles()).contains(role);
    }

    public static boolean isAdmin(){
        return containsRoles(1);
    }
}
