package org.yuan.boot.webmvc.app.pojo.condition;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

import java.util.Date;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 19:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public final class BaseCustomerInfoCondition extends AbstractBaseCondition {
    private Long id;
    private List<Long> ids;
    private String value;
    private String name;
    private String idNum;
    private String phone;
    private String createUser;
    private Date createDate;
    private Date createDateStart;
    private Date createDateEnd;
    private List<Date> createDateRange;
    private Integer enabled;

    public BaseCustomerInfoCondition() {
    }

    public BaseCustomerInfoCondition(int page, int size) {
        super(page, size);
    }

    @Builder
    public BaseCustomerInfoCondition(int page, int size, Long id, List<Long> ids, String value, String name, String idNum, String phone, String createUser, Date createDate, Date createDateStart, Date createDateEnd, List<Date> createDateRange, Integer enabled) {
        super(page, size);
        this.id = id;
        this.ids = ids;
        this.value = value;
        this.name = name;
        this.idNum = idNum;
        this.phone = phone;
        this.createUser = createUser;
        this.createDate = createDate;
        this.createDateStart = createDateStart;
        this.createDateEnd = createDateEnd;
        this.createDateRange = createDateRange;
        this.enabled = enabled;
    }
}