package org.yuan.boot.shower.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.commons.pojo.BaseCondition;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-23 12:58
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class AdminUserCondition extends BaseCondition {
    private Long id;
    private String name;

    public AdminUserCondition() {
    }

    public AdminUserCondition(int page, int size) {
        super(page, size);
    }

    public AdminUserCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}