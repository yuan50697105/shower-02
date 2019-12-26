package org.yuan.boot.webmvc.app.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.core.BaseCondition;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysUserCondition extends BaseCondition {
    private Long id;
    private List<Long> ids;
    private String name;
    private String username;
    private String realName;
    private String nickName;
    private String createUser;
    private Date createDate;
    private Date createDateStart;
    private Date createDateEnd;
    private Integer enabled;

    public SysUserCondition() {
    }

    public SysUserCondition(int page, int size) {
        super(page, size);
    }
}
