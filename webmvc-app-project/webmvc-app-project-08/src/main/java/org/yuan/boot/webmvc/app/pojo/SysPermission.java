package org.yuan.boot.webmvc.app.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 22:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SysPermission extends BaseEntity<SysPermission> {
    private String authority;
    private String name;
    private String createUser;
    private String updateUser;
    private Date createTime;
    private Date updateTime;
    private Integer enabled;

    @Builder
    public SysPermission(Long id, String authority, String name, String createUser, String updateUser, Date createTime, Date updateTime, Integer enabled) {
        super(id);
        this.authority = authority;
        this.name = name;
        this.createUser = createUser;
        this.updateUser = updateUser;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.enabled = enabled;
    }
}