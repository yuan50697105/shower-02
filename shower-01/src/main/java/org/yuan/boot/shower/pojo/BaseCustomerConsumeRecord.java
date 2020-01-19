package org.yuan.boot.shower.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.yuan.boot.db.pojo.AbstractBaseEntity;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseCustomerConsumeRecord extends AbstractBaseEntity<BaseCustomerConsumeRecord> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
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