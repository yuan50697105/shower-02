package org.yuan.boot.webmvc.app.pojo.condition;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.jpa.pojo.AbstractBaseCondition;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:12
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysRoleCondition extends AbstractBaseCondition {
    private Long id;
    private List<Long> ids;
    private String name;

    public SysRoleCondition() {
    }

    public SysRoleCondition(int page, int size) {
        super(page, size);
    }

    @Builder
    public SysRoleCondition(int page, int size, Long id, List<Long> ids, String name) {
        super(page, size);
        this.id = id;
        this.ids = ids;
        this.name = name;
    }
}