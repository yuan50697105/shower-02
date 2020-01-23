package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceRecord extends BaseEntity implements Serializable {
    /**
     * deviceId
     */
    private Long deviceId;

    /**
     * deviceCode
     */
    private String deviceCode;

    /**
     * type
     */
    private Integer type;

    /**
     * content
     */
    private String content;

    private static final long serialVersionUID = 1L;
}