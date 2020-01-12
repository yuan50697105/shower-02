package org.yuan.boot.webmvc.app.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public final class SysUserRole extends BaseEntity<SysUserRole> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
    /**
     * roleId
     */
    private Long roleId;
    /**
     * userId
     */
    private Long userId;
    /**
     * createUser
     */
    private String createUser;
    /**
     * createTime
     */
    private Date createTime;
}