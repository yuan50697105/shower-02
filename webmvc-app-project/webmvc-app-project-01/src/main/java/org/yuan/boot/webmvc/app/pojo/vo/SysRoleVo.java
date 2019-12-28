package org.yuan.boot.webmvc.app.pojo.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-28 12:11
 */
@Data
public class SysRoleVo {
    private Long id;
    @NotEmpty
    private String name;
}