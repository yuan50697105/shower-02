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
public final class SysUserRole extends BaseEntity<SysUserRole> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @Id
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
    @CreateTime
    private Date createTime;
}