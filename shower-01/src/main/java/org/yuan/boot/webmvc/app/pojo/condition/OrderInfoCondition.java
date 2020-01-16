package org.yuan.boot.webmvc.app.pojo.condition;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCoreCondition;

import java.util.Date;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 21:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public final class OrderInfoCondition extends AbstractBaseCoreCondition {
    private Long id;
    private String orderNo;
    private String userName;
    private String userId;
    private String userOpenId;
    private Long deviceId;
    private String deviceCode;
    private Integer payStatus;
    private Date payStartDate;
    private Date payEndDate;
    private Integer useStatus;
    private Date useStartTime;
    private Date useEndTime;

    public OrderInfoCondition() {
    }

    public OrderInfoCondition(int page, int size) {
        super(page, size);
    }

    @Builder
    public OrderInfoCondition(int page, int size, Long id, String orderNo, String userName, String userId, String userOpenId, Long deviceId, String deviceCode, Integer payStatus, Date payStartDate, Date payEndDate, Integer useStatus, Date useStartTime, Date useEndTime) {
        super(page, size);
        this.id = id;
        this.orderNo = orderNo;
        this.userName = userName;
        this.userId = userId;
        this.userOpenId = userOpenId;
        this.deviceId = deviceId;
        this.deviceCode = deviceCode;
        this.payStatus = payStatus;
        this.payStartDate = payStartDate;
        this.payEndDate = payEndDate;
        this.useStatus = useStatus;
        this.useStartTime = useStartTime;
        this.useEndTime = useEndTime;
    }
}