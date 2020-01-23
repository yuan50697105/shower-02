package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class DeviceOrderInfo extends BaseEntity implements Serializable {
    /**
     * deviceId
     */
    private Long deviceId;

    /**
     * deviceCode
     */
    private String deviceCode;

    /**
     * orderId
     */
    private Long orderId;

    /**
     * orderNo
     */
    private String orderNo;

    /**
     * status
     */
    private Integer status;

    /**
     * content
     */
    private String content;

    private static final long serialVersionUID = 1L;
}