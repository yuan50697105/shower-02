package org.yuan.boot.shower.admin.pojo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-21 00:29
 */
@Data
public class AdminRoleVo {
    @NotEmpty(groups = {Save.class, Update.class})
    private String name;

    public interface Save {
    }

    public interface Update {
    }

}