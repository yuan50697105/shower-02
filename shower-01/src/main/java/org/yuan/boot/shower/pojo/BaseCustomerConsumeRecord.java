package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "org-yuan-boot-shower-pojo-BaseCustomerConsumeRecord")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseCustomerConsumeRecord extends BaseEntity<BaseCustomerConsumeRecord> implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * customerId
     */
    @ApiModelProperty(value = "customerId")
    private Long customerId;

    /**
     * customerOpenId
     */
    @ApiModelProperty(value = "customerOpenId")
    private String customerOpenId;

    /**
     * customerName
     */
    @ApiModelProperty(value = "customerName")
    private String customerName;

    /**
     * price
     */
    @ApiModelProperty(value = "price")
    private BigDecimal price;

    /**
     * time
     */
    @ApiModelProperty(value = "time")
    private BigDecimal time;

    /**
     * totalPrice
     */
    @ApiModelProperty(value = "totalPrice")
    private BigDecimal totalPrice;

    /**
     * operation
     */
    @ApiModelProperty(value = "operation")
    private String operation;

    /**
     * deviceId
     */
    @ApiModelProperty(value = "deviceId")
    private Long deviceId;

    /**
     * deviceCode
     */
    @ApiModelProperty(value = "deviceCode")
    private String deviceCode;

    @ApiModelProperty(value = "")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static BaseCustomerConsumeRecordBuilder builder() {
        return new BaseCustomerConsumeRecordBuilder();
    }
}