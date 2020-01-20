package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 21:39
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class AdminRoleCondition extends AbstractBaseCondition {
    public AdminRoleCondition() {
    }

    public AdminRoleCondition(int page, int size) {
        super(page, size);
    }
}