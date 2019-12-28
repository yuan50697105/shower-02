package org.yuan.boot.webmvc.app.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.webmvc.db.pojo.BaseEntity;

import java.util.Date;

/**
 * @program: learning-demo-02
 * @description: 系统角色
 * @author: yuane
 * @create: 2019-12-28 11:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class SysRole extends BaseEntity<SysRole> {
    private String name;
    private String createUser;
    private String updateUser;
    private Date createTime;
    private Date updateTime;
    private Integer enabled;

    public SysRole() {
    }

    public SysRole(Long id) {
        super(id);
    }
}