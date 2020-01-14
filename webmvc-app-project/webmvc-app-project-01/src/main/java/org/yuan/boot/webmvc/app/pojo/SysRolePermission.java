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
public final class SysRolePermission extends BaseEntity<SysRolePermission> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long roleId;
    private Long permissionId;
    private Date createTime;
    private Long createUser;
}