package org.yuan.boot.webmvc.app.pojo.vo;

import lombok.Data;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 22:44
 */
@Data
public class SysPermissionVo {
    private Long id;
    private String name;
    private String authority;
}