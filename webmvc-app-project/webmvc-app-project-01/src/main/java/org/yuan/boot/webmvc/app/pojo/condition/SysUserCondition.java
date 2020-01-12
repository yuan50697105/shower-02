package org.yuan.boot.webmvc.app.pojo.condition;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * @create: 2019-12-29 22:22
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@ApiModel
public final class SysUserCondition extends AbstractBaseCondition {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("主键集合")
    private List<Long> ids;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("账户名")
    private String username;
    @ApiModelProperty("姓名")
    private String realName;
    @ApiModelProperty("昵称")
    private String nickName;
    @ApiModelProperty("创建人")
    private String createUser;
    @ApiModelProperty("创建日期")
    private Date createDate;
    @ApiModelProperty("起始创建日期")
    private Date createDateStart;
    @ApiModelProperty("截至创建日期")
    private Date createDateEnd;
    @ApiModelProperty(value = "启用状态", access = "0：停用，1：启用")
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