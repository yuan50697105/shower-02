package org.yuan.boot.shower.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "org-yuan-boot-shower-pojo-OrderInfo")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * orderNo
     */
    @ApiModelProperty(value = "orderNo")
    private String orderNo;

    /**
     * userId
     */
    @ApiModelProperty(value = "userId")
    private Long userId;

    /**
     * userOpenId
     */
    @ApiModelProperty(value = "userOpenId")
    private Long userOpenId;

    /**
     * userName
     */
    @ApiModelProperty(value = "userName")
    private String userName;

    /**
     * orderPrice
     */
    @ApiModelProperty(value = "orderPrice")
    private BigDecimal orderPrice;

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
     * startTime
     */
    @ApiModelProperty(value = "startTime")
    private Date startTime;

    /**
     * payStatus
     */
    @ApiModelProperty(value = "payStatus")
    private Integer payStatus;

    /**
     * payTime
     */
    @ApiModelProperty(value = "payTime")
    private Date payTime;

    /**
     * useStatus
     */
    @ApiModelProperty(value = "useStatus")
    private Integer useStatus;

    /**
     * useStartTime
     */
    @ApiModelProperty(value = "useStartTime")
    private Date useStartTime;

    /**
     * useEndTime
     */
    @ApiModelProperty(value = "useEndTime")
    private Date useEndTime;

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

    /**
     * deviceAddress
     */
    @ApiModelProperty(value = "deviceAddress")
    private String deviceAddress;

    /**
     * devicePoiny
     */
    @ApiModelProperty(value = "devicePoiny")
    private String devicePoint;

    private static final long serialVersionUID = 1L;

    public static OrderInfoBuilder builder() {
        return new OrderInfoBuilder();
    }
}