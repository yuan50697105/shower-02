package org.yuan.boot.webmvc.app.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class OrderInfo extends BaseEntity<OrderInfo> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
    /**
     * orderNo
     */
    private String orderNo;
    /**
     * userId
     */
    private Long userId;
    /**
     * userOpenId
     */
    private Long userOpenId;
    /**
     * userName
     */
    private String userName;
    /**
     * orderPrice
     */
    private BigDecimal orderPrice;
    /**
     * createTime
     */
    private Date createTime;
    /**
     * updateTime
     */
    private Date updateTime;
    /**
     * startTime
     */
    private Date startTime;
    /**
     * payStatus
     */
    private Integer payStatus;
    /**
     * payTime
     */
    private Date payTime;
    /**
     * useStatus
     */
    private Integer useStatus;
    /**
     * useStartTime
     */
    private Date useStartTime;
    /**
     * useEndTime
     */
    private Date useEndTime;
    /**
     * deviceId
     */
    private Long deviceId;
    /**
     * deviceCode
     */
    private String deviceCode;
    /**
     * deviceAddress
     */
    private String deviceAddress;
    /**
     * devicePoiny
     */
    private String devicePoint;

    public static OrderInfoBuilder builder() {
        return new OrderInfoBuilder();
    }
}