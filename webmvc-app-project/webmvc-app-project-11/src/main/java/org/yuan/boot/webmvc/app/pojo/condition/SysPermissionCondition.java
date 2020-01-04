package org.yuan.boot.webmvc.app.pojo.condition;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.BaseCondition;

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
public class SysPermissionCondition extends BaseCondition {
    private Long id;
    private List<Long> ids;
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