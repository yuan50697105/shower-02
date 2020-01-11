package org.yuan.boot.webmvc.app.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.*;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SysUserRole extends BaseEntity<SysUserRole> implements Serializable {
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

    private static final long serialVersionUID = 1L;
}