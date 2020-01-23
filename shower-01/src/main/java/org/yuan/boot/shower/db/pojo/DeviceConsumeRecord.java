package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.interceptor.annotation.CreateTime;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: shower-01
 * @description: 设备使用记录
 * @author: yuane
 * @create: 2020-01-23 11:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceConsumeRecord extends BaseEntity implements Serializable {
    /**
     * 客户ID
     */
    private Long customerId;
    /**
     * 客户名称
     */
    private String customerName;
    /**
     * 设备ID
     */
    private Long deviceId;
    /**
     * 设备号
     */
    private String deviceCode;
    /**
     *
     */
    private Integer type;
    /**
     * 内容
     */
    private String content;
    @CreateTime
    private Date createTime;
}