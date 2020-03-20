package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo extends BaseDbEntity {
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