package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo extends BaseDbEntity {
    private static final long serialVersionUID = 1L;
    /**
     * openId
     */
    private String openId;

    /**
     * unionId
     */
    private String unionId;

    /**
     * nickName
     */
    private String nickName;

    /**
     * gender
     */
    private Integer gender;

    /**
     * phoneNum
     */
    private String phoneNum;

    public static CustomerInfoBuilder builder() {
        return new CustomerInfoBuilder();
    }
}