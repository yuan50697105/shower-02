package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class AdminRole implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public static org.yuan.boot.shower.db.pojo.AdminRole.AdminRoleBuilder builder() {
        return new org.yuan.boot.shower.db.pojo.AdminRole.AdminRoleBuilder();
    }
}