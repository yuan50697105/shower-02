package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

import java.util.Date;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 21:44
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class WxOrderInfoCondition extends AbstractBaseCondition {
    private String openId;
    private String customerId;
    private String orderNo;
    private String deviceCode;
    private Date createDateStart;
    private Date createDateEnd;

    public WxOrderInfoCondition() {
    }

    public WxOrderInfoCondition(int page, int size) {
        super(page, size);
    }


    public WxOrderInfoCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}