package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class CustomerInfo extends BaseEntity implements Serializable {
    /**
     * nickName
     */
    private String nickName;

    /**
     * openId
     */
    private String openId;

    /**
     * unionId
     */
    private String unionId;

    /**
     * gender
     */
    private Integer gender;

    /**
     * phone
     */
    private String phone;

    private static final long serialVersionUID = 1L;
}