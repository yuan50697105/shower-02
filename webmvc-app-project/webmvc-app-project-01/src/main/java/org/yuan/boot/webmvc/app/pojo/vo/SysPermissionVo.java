package org.yuan.boot.webmvc.app.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-28 13:13
 */
@Data
public class SysPermissionVo {
    private Long id;
    @NotEmpty
    private String name;
}