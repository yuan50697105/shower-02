package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo extends BaseDbEntity implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public static CustomerInfoBuilder builder() {
        return new CustomerInfoBuilder();
    }
}