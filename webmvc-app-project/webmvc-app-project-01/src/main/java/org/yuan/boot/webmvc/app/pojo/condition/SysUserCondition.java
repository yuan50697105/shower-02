package org.yuan.boot.webmvc.app.pojo.condition;

import lombok.*;
import lombok.experimental.Accessors;
import org.yuan.boot.webmvc.db.core.pojo.BaseCondition;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class SysUserCondition extends BaseCondition {
    private Long id;
    @Singular
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

    @Builder
    public SysUserCondition(int page, int size, Long id, List<Long> ids, String name, String username, String realName, String nickName, String createUser, Date createDate, Date createDateStart, Date createDateEnd, Integer enabled) {
        super(page, size);
        this.id = id;
        this.ids = ids;
        this.name = name;
        this.username = username;
        this.realName = realName;
        this.nickName = nickName;
        this.createUser = createUser;
        this.createDate = createDate;
        this.createDateStart = createDateStart;
        this.createDateEnd = createDateEnd;
        this.enabled = enabled;
    }
}
