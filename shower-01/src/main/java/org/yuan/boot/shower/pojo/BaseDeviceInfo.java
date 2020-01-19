package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "org-yuan-boot-shower-pojo-BaseDeviceInfo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseDeviceInfo implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * createUser
     */
    @ApiModelProperty(value = "createUser")
    private String createUser;

    /**
     * createTime
     */
    @ApiModelProperty(value = "createTime")
    private Date createTime;

    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;

    /**
     * name
     */
    @ApiModelProperty(value = "name")
    private String name;

    /**
     * address
     */
    @ApiModelProperty(value = "address")
    private String address;

    /**
     * point
     */
    @ApiModelProperty(value = "point")
    private String point;

    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    private Integer enabled;

    /**
     * enabledTime
     */
    @ApiModelProperty(value = "enabledTime")
    private Date enabledTime;

    /**
     * disabledTime
     */
    @ApiModelProperty(value = "disabledTime")
    private Date disabledTime;

    private static final long serialVersionUID = 1L;

    public static BaseDeviceInfoBuilder builder() {
        return new BaseDeviceInfoBuilder();
    }
}