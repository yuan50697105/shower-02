package org.yuan.boot.shower.db.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.shower.commons.pojo.BaseEntity;

@Data
@EqualsAndHashCode(callSuper = true)
public class AdminRole extends BaseEntity implements Serializable {
    /**
     * 名称
     */
    private String name;

    private static final long serialVersionUID = 1L;
}