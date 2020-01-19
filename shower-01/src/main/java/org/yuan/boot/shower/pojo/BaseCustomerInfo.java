package org.yuan.boot.shower.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BaseCustomerInfo extends BaseEntity<BaseCustomerInfo> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
    /**
     * actualName
     */
    private String actualName;
    /**
     * openId
     */
    private String openId;
    /**
     * contactAddress
     */
    private String contactAddress;
    /**
     * contactNumber
     */
    private String contactNumber;
    /**
     * identityNumber
     */
    private String identityNumber;
    /**
     * enabled
     */
    private Integer enabled;
    /**
     * createUser
     */
    private String createUser;
    /**
     * updateUser
     */
    private String updateUser;
    /**
     * createTime
     */
    private Date createTime;
    /**
     * updateTime
     */
    private Date updateTime;

    public static BaseCustomerInfoBuilder builder() {
        return new BaseCustomerInfoBuilder();
    }
}