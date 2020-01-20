package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

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

    private static final long serialVersionUID = 1L;
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

    public static BaseCustomerInfoBuilder builder() {
        return new BaseCustomerInfoBuilder();
    }
}