package org.yuan.boot.webmvc.app.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.pojo.BaseCondition;

import java.util.Date;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:22
 */
@EqualsAndHashCode(callSuper = true)
@Data
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