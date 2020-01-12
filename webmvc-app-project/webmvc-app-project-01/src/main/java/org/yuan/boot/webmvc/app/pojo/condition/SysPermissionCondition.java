package org.yuan.boot.webmvc.app.pojo.condition;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-02 22:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@ApiModel("权限查询")
public final class SysPermissionCondition extends AbstractBaseCondition {
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("主键集合")
    private List<Long> ids;
    @ApiModelProperty("名称")
    private String name;

    public SysPermissionCondition() {
    }

    public SysPermissionCondition(int page, int size) {
        super(page, size);
    }

    @Builder
    public SysPermissionCondition(int page, int size, Long id, List<Long> ids, String name) {
        super(page, size);
        this.id = id;
        this.ids = ids;
        this.name = name;
    }
}