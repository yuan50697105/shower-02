package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 18:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeviceRecord extends BaseEntity {
    private Long deviceId;
    private String deviceCode;
    private Integer type;
    private String content;
}