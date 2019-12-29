package org.yuan.boot.webmvc.app.pojo.condition;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseCondition;

import java.util.Date;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-28 12:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysRoleCondition extends BaseCondition {
    private Long id;
    @Singular
    private List<Long> ids;
    private String name;
    private String createUser;
    private Date createDate;
    private Date createDateStart;
    private Date createDateEnd;

    public SysRoleCondition() {
    }

    public SysRoleCondition(int page, int size) {
        super(page, size);
    }

    @Builder

    public SysRoleCondition(int page, int size, Long id, List<Long> ids, String name, String createUser, Date createDate, Date createDateStart, Date createDateEnd) {
        super(page, size);
        this.id = id;
        this.ids = ids;
        this.name = name;
        this.createUser = createUser;
        this.createDate = createDate;
        this.createDateStart = createDateStart;
        this.createDateEnd = createDateEnd;
    }
}