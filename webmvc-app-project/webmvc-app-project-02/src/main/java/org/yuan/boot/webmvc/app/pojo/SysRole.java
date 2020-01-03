package org.yuan.boot.webmvc.app.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

import lombok.*;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "org-yuan-boot-webmvc-app-pojo-SysRole")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SysRole extends BaseEntity<SysRole> implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * authority
     */
    @ApiModelProperty(value = "authority")
    private String authority;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * createUser
     */
    @ApiModelProperty(value = "createUser")
    private String createUser;

    /**
     * updateUser
     */
    @ApiModelProperty(value = "updateUser")
    private String updateUser;

    /**
     * createTime
     */
    @ApiModelProperty(value = "createTime")
    private Date createTime;

    /**
     * updateTime
     */
    @ApiModelProperty(value = "updateTime")
    private Date updateTime;

    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    private Integer enabled;

    private static final long serialVersionUID = 1L;
}