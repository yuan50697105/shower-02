package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class OrderItem extends BaseEntity implements Serializable {
    /**
     * type
     */
    private Integer type;

    /**
     * orderId
     */
    private Long orderId;

    /**
     * orderNo
     */
    private String orderNo;

    /**
     * customerId
     */
    private Long customerId;

    /**
     * customerOpenId
     */
    private String customerOpenId;

    /**
     * customerUnionId
     */
    private String customerUnionId;

    /**
     * customerNickName
     */
    private String customerNickName;

    /**
     * itemType
     */
    private Integer itemType;

    /**
     * itemOrderNo
     */
    private String itemOrderNo;

    /**
     * deviceType
     */
    private Integer deviceType;

    /**
     * deviceId
     */
    private Long deviceId;

    /**
     * deviceCode
     */
    private String deviceCode;

    /**
     * rangeCode
     */
    private String rangeCode;

    /**
     * goodsInfoId
     */
    private Long goodsInfoId;

    /**
     * goodsInfoCode
     */
    private String goodsInfoCode;

    /**
     * price
     */
    private BigDecimal timePrice;

    /**
     * timeInterval
     */
    private BigDecimal timeInterval;

    /**
     * timeTotalPrice
     */
    private BigDecimal timeTotalPrice;

    /**
     * priceUnit
     */
    private Integer priceUnit;

    /**
     * startTime
     */
    private Date startTime;

    /**
     * endTime
     */
    private Date endTime;

    /**
     * 使用量
     */
    private BigDecimal timeUseAmount;

    /**
     * 使用量单位
     */
    private Integer timeUseUnit;

    /**
     * waterPrice
     */
    private BigDecimal waterPrice;

    /**
     * waterSpace
     */
    private BigDecimal waterSpace;

    /**
     * waterTotalPrice
     */
    private BigDecimal waterTotalPrice;

    /**
     * totalPrice
     */
    private BigDecimal totalPrice;

    /**
     * remainPrice
     */
    private BigDecimal remainPrice;

    private static final long serialVersionUID = 1L;
}