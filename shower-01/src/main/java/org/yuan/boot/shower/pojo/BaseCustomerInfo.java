package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "org-yuan-boot-shower-pojo-BaseCustomerInfo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseCustomerInfo extends BaseEntity<BaseCustomerInfo> implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * actualName
     */
    @ApiModelProperty(value = "actualName")
    private String actualName;

    /**
     * openId
     */
    @ApiModelProperty(value = "openId")
    private String openId;

    /**
     * contactAddress
     */
    @ApiModelProperty(value = "contactAddress")
    private String contactAddress;

    /**
     * contactNumber
     */
    @ApiModelProperty(value = "contactNumber")
    private String contactNumber;

    /**
     * identityNumber
     */
    @ApiModelProperty(value = "identityNumber")
    private String identityNumber;

    /**
     * enabled
     */
    @ApiModelProperty(value = "enabled")
    private Integer enabled;

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

    private static final long serialVersionUID = 1L;

    public static BaseCustomerInfoBuilder builder() {
        return new BaseCustomerInfoBuilder();
    }
}