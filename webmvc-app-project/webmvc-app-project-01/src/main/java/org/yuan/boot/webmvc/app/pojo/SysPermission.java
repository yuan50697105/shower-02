package org.yuan.boot.webmvc.app.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.webmvc.db.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SysPermission extends BaseEntity<SysPermission> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * authority
     */
    private String authority;
    /**
     * name
     */
    private String name;
    /**
     * createUser
     */
    private String createUser;
    /**
     * updateUser
     */
    private String updateUser;
    /**
     * createTime
     */
    private Date createTime;
    /**
     * updateTime
     */
    private Date updateTime;
    /**
     * enabled
     */
    private Integer enabled;

    public SysPermission() {
    }

    public SysPermission(Long id) {
        super(id);
    }

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