package org.yuan.boot.shower.db.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

import java.io.Serializable;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 16:34
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class AdminRole extends BaseEntity<AdminRole> implements Serializable {
    /**
     * 名称
     */
    private String name;

    public AdminRole() {
    }

    @Builder
    public AdminRole(Long id, String name) {
        super(id);
        this.name = name;
    }
}