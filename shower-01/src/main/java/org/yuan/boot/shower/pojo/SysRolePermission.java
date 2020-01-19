package org.yuan.boot.shower.pojo;

import lombok.*;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.interceptor.annotation.CreateTime;
import org.yuan.boot.shower.interceptor.annotation.Id;

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
    @Id
    private Long id;
    private Long roleId;
    private Long permissionId;
    @CreateTime
    private Date createTime;
    private Long createUser;
}