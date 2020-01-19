package org.yuan.boot.shower.pojo;

import lombok.*;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.interceptor.annotation.CreateTime;
import org.yuan.boot.shower.interceptor.annotation.Id;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BaseDeviceInfo extends BaseEntity<BaseDeviceInfo> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @Id
    private Long id;
    /**
     * createUser
     */
    private String createUser;
    /**
     * createTime
     */
    @CreateTime
    private Date createTime;
    /**
     * code
     */
    private String code;
    /**
     * name
     */
    private String name;
    /**
     * address
     */
    private String address;
    /**
     * point
     */
    private String point;
    /**
     * enabled
     */
    private Integer enabled;
    /**
     * enabledTime
     */
    private Date enabledTime;
    /**
     * disabledTime
     */
    private Date disabledTime;

}