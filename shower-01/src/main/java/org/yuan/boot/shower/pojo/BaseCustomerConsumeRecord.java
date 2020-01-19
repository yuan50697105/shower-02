package org.yuan.boot.shower.pojo;

import lombok.*;
import org.yuan.boot.shower.interceptor.annotation.Id;

import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseCustomerConsumeRecord extends BaseEntity<BaseCustomerConsumeRecord> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @Id
    private Long id;
    /**
     * customerId
     */
    private Long customerId;
    /**
     * customerOpenId
     */
    private String customerOpenId;
    /**
     * customerName
     */
    private String customerName;
    /**
     * price
     */
    private BigDecimal price;
    /**
     * time
     */
    private BigDecimal time;
    /**
     * totalPrice
     */
    private BigDecimal totalPrice;
    /**
     * operation
     */
    private String operation;
    /**
     * deviceId
     */
    private Long deviceId;
    /**
     * deviceCode
     */
    private String deviceCode;

    public static BaseCustomerConsumeRecordBuilder builder() {
        return new BaseCustomerConsumeRecordBuilder();
    }
}