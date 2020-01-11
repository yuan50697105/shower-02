package org.yuan.boot.webmvc.app.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseCustomerInfo {
    /**
    * id
    */
    private Long id;

    /**
    * actualName
    */
    private String actualName;

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
}